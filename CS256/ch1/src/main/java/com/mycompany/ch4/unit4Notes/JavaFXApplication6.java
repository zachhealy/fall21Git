/*
https://o7planning.org/en/11533/opening-a-new-window-in-javafx

There are three modelities that you can apply to the  Stage through the stage.initModality(Modelity) method.
Modelity.NONE
Modelity.WINDOW_MODAL
Modelity.APPLICATION_MODAL

1 Modelity.NONE	When you open a new window with this modelity, the new window will be independent from the parent window. You can interact with the parent window, or close it without affecting the new window. 
2 Modelity.WINDOW_MODAL	When you open a new window with this modelity, it will lock the parent window. You can not interact with the parent window until this window is closed.
3 Modelity.APPLICATION_MODAL	When you open a new window with this modelity, it will lock any other windows of the application. You can not interact with any other windows  until this window is closed.
 */
package javafxapplication6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author ziping
 * open the second window with the default modality ( Modeless Window / Modality.NONE).
 */
public class JavaFXApplication6 extends Application {    
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
