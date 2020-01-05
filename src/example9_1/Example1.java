package example9_1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Example1 extends Application {
	
    //start method is main entry point for application. 
    //Stage is top-level container.
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Example 1");

        //GridPane for flexible layout of controls in rows and columns
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10); //Horizontal space between columns
        grid.setVgap(10); //Vertical space between rows
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Text control for instructions
        Text instrText = new Text("Give two values");
        instrText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        // In column 0, row 0, column span 2 and row span 1
        grid.add(instrText, 0, 0, 2, 1);

        // Label in column 0, row 1
        Label label1 = new Label("Value 1:");
        grid.add(label1, 0, 1);

        // TextField in column 1, row 1
        TextField textField1 = new TextField();
        grid.add(textField1, 1, 1);

        Label label2 = new Label("Value 2:");
        grid.add(label2, 0, 2);

        TextField textField2 = new TextField();
        grid.add(textField2, 1, 2);

        Button btn = new Button("Calculate");
        grid.add(btn, 1, 4);

        Text resultText = new Text();
        grid.add(resultText, 0, 6, 2, 1);
        resultText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));

        // Event handling for button
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                double val1 = Double.parseDouble(textField1.getText());
                double val2 = Double.parseDouble(textField2.getText());
                double res = val1 + val2;
                resultText.setText(val1 + " + " + val2 + " = " + res);
            }
        });

        //Scene is container for all content 
        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
