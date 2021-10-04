/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author ziping
 * open a new window with the Modal Window modelity ( Modelity.WINDOW_MODAL) . When the new window still displays you can not interact with the father window.
 */
public class JavaFXApplication7 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
 
      Button button = new Button();
      button.setText("Open a New Window");
 
      button.setOnAction(new EventHandler<ActionEvent>() {
 
         @Override
         public void handle(ActionEvent event) {
 
            Label secondLabel = new Label("I'm a Label on new Window");
            TextField secondText = new TextField();
            VBox secondaryLayout = new VBox();
            secondaryLayout.getChildren().add(secondLabel);
            secondaryLayout.getChildren().add(secondText); 
            Scene secondScene = new Scene(secondaryLayout, 230, 100);
 
            // New window (Stage)
            Stage newWindow = new Stage();
            newWindow.setTitle("Second Stage");
            newWindow.setScene(secondScene); 
            // Specifies the modality for new window.
            newWindow.initModality(Modality.WINDOW_MODAL); 
            // Specifies the owner Window (parent) for new window
            newWindow.initOwner(primaryStage);
 
            // Set position of second window, related to primary window.
            newWindow.setX(primaryStage.getX() + 200);
            newWindow.setY(primaryStage.getY() + 100); 
            newWindow.show();
         }
      });
 
      StackPane root = new StackPane();
      root.getChildren().add(button);
 
      Scene scene = new Scene(root, 450, 250);
 
      primaryStage.setTitle("JavaFX Open a new Window");
      primaryStage.setScene(scene);
      primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
