package exercise7_2;

import java.util.Scanner;

import exercise4_2.Distribution;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Grade extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Distribution");
		Distribution d = new Distribution(0,5);
		BorderPane root = new BorderPane();
		
		//GridPane for flexible layout of controls in rows and columns
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10); //Horizontal space between columns
        grid.setVgap(10); //Vertical space between rows
        grid.setPadding(new Insets(25, 25, 25, 25));
		
		// Label in column 0, row 1
        Label label1 = new Label("Grade: ");
        grid.add(label1, 0, 1);
        
        // TextField in column 1, row 1
        TextField textField = new TextField();
        grid.add(textField, 1, 1);
        
        //Button
        Button btn = new Button("Insert");
        grid.add(btn, 2, 1);
        
        //Average & Count
        Text showText = new Text();
        root.setBottom(showText);
        showText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        
        root.setTop(grid);
        
  
        final String[] gnum = {"0", "1", "2", "3", "4", "5"};
		final int[] values = {d.frequency(0), d.frequency(1), d.frequency(2), d.frequency(3), d.frequency(4), d.frequency(5)}; 
        
        final CategoryAxis xAxis = new CategoryAxis(); //String category
        final NumberAxis yAxis = new NumberAxis();  
        final BarChart<String, Number> barchart = new BarChart<>(xAxis,yAxis);
        
        barchart.setTitle("Grade Distribution");
        barchart.setLegendVisible(false); //Just one series, legend is not needed
        xAxis.setLabel("Grade");
        yAxis.setLabel("Frequency"); 
        
        XYChart.Series<String, Number> series1 = new Series<>();
        for(int i = 0; i < gnum.length; i++) {
            series1.getData().add(new Data<>(gnum[i], d.frequency(i)));
        }
        barchart.getData().add(series1);
        
        // Event handling for button
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                int val = Integer.parseInt(textField.getText());
                d.insertValue(val);
                series1.getData().get(val).setYValue(d.frequency(val));
                showText.setText("Average: " + d.average() + ", Count: " + d.getCount());
                return;
            }
        });
        
        
        
        root.setCenter(barchart);
		
		//Scene is container for all content 
        Scene scene = new Scene(root, 600, 600);
        stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
