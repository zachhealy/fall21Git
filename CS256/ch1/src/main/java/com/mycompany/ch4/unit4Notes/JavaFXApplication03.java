/*
 JavaFX multiple scenes and GridPane and shapes
 */
package javafxapplication03;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.layout.Pane;

/**
 *
 * @author ziping
 */
public class JavaFXApplication03 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    pane.setHgap(25.5);
    pane.setVgap(25.5);
    
    // Place nodes in the pane
    pane.add(new Label("First Name:"), 0, 0);
    pane.add(new TextField(), 1, 0);
    pane.add(new Label("MI:"), 0, 1); 
    pane.add(new TextField(), 1, 1);
    pane.add(new Label("Last Name:"), 0, 2);
    pane.add(new TextField(), 1, 2);
    Button btAdd = new Button("Add Name");
    pane.add(btAdd, 1, 3);
    GridPane.setHalignment(btAdd, HPos.RIGHT);
        // Create a circle and set its properties
    Circle circle = new Circle();
    circle.setRadius(50);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);
    pane.add(circle, 2, 0);
    Text text1 = new Text("Programming is fun");
    text1.setFont(Font.font("Courier", FontWeight.BOLD, 
      FontPosture.ITALIC, 15));
    text1.setFill(Color.RED);
    text1.setUnderline(true); 
    pane.add(text1, 2, 1);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowGridPane"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    // Create a pane to hold the circle 
    Pane pane2 = new Pane();    
    // Create a circle and set its properties
    Circle circle2 = new Circle();
    circle2.centerXProperty().bind(pane2.widthProperty().divide(2));
    circle2.centerYProperty().bind(pane2.heightProperty().divide(2));
    circle2.setRadius(50);
    circle2.setStroke(Color.BLACK); 
    circle2.setFill(Color.WHITE);
    pane2.getChildren().add(circle2); // Add circle to the pane

    // Create a scene and place it in the stage
    Scene scene2 = new Scene(pane2, 200, 200);    
    Stage stage = new Stage(); // Create a new stage
    stage.setTitle("Second Stage"); // Set the stage title
    // Set a scene with a button in the stage
    stage.setScene(scene2);        
    stage.show(); // Display the stage    
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
    
}