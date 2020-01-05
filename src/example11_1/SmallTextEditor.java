package example11_1;

/* An example of text files and menus */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/*
 * Simple editor for short text. 
 */
public class SmallTextEditor extends Application {

    final Label statusLabel = new Label();
    final FileChooser fileChooser = new FileChooser();
    final TextArea textArea = new TextArea();

    private File currentfile = null;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
		
        //Handle only text files
        fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
        //If text exceeds the width, then text wrap onto another line.
        textArea.setWrapText(true); 

        //Create menubar and File menu
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        menuBar.getMenus().add(menuFile);

        MenuItem startNew = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem saveAs = new MenuItem("Save As");
        MenuItem exit = new MenuItem("Exit");
        menuFile.getItems().addAll(startNew, open, save, saveAs, new SeparatorMenuItem(), exit);
        root.setTop(menuBar);

        root.setBottom(statusLabel);
        root.setCenter(textArea);

        Scene scene = new Scene(root, 700, 500);
        primaryStage.setTitle("SmallTextEditor");
        primaryStage.setScene(scene);
        primaryStage.show();

        //Event handlers
        saveAs.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                File file = fileChooser.showSaveDialog(primaryStage);
                if (file != null) {
                    currentfile = file;
                    saveToCurrentFile();
                }
            }
        });

        save.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                if (currentfile == null) {
                    File file = fileChooser.showSaveDialog(primaryStage);
                    if (file != null) {
                        currentfile = file;
                        saveToCurrentFile();
                    }
                } else {
                    saveToCurrentFile();
                }
            }
        });

        open.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                File file = fileChooser.showOpenDialog(primaryStage);
                if (file != null) {
                    currentfile = file;
                    readFromCurrentFile();
                }
            }
        });

        exit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                //System.exit(0);
                //OR
                Platform.exit();
            }
        });

        startNew.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                textArea.setText(null);
                currentfile = null;
                statusLabel.setText(null);
            }
        });

    } //End of method start

    //Saves text into  file
    private void saveToCurrentFile() {
        try (PrintWriter outputfile = new PrintWriter(new FileOutputStream(currentfile), true)) {
            outputfile.print(textArea.getText()); //write the text from the text area into the file
            statusLabel.setText("Saved: " + currentfile.getName());
        } 
        catch (Exception ex) {
            statusLabel.setText("Save failed: " + ex.getMessage());
        }
    } //End of method saveToCurrentFile

    //Reads text from file
    private void readFromCurrentFile() {
        try (BufferedReader inputfile = new BufferedReader(new FileReader(currentfile))) {
            String line;
            textArea.setText(null); // empty the text area
            while ((line = inputfile.readLine()) != null) {
                textArea.appendText(line + "\n"); // appends to the text area
            }
            textArea.positionCaret(0); // cursor in the beginning of the text
            statusLabel.setText("Opend: " + currentfile.getName());
        } catch (IOException ex) {
            statusLabel.setText("Open failed: " + ex.getMessage());
        }
    } //End of method readFromCurrentFile

    public static void main(String[] args) {
        launch(args);
    } //End of main
	
} //End of class

