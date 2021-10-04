/*
Loading an Image
You can load an image in JavaFX by instantiating the class named Image of the package javafx.scene.image.

To the constructor of the class, you have to pass either of the following −

An InputStream object of the image to be loaded or,

A string variable holding the URL for the image.

//Passing FileInputStream object as a parameter 
FileInputStream inputstream = new FileInputStream("C:\\images\\image.jpg"); 
Image image = new Image(inputstream); 
         
//Loading image from URL 
//Image image = new Image(new FileInputStream("url for the image));
After loading the image, you can set the view for the image by instantiating the ImageView class and passing the image to its constructor as follows −

ImageView imageView = new ImageView(image);
 */
package javafxapplication02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
/**
 *
 * @author zliu
 */
public class JavaFXApplication02 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{//FileInputStream needs checked exception
    // Create a pane to hold the image views
    Pane pane = new HBox(10);
    pane.setPadding(new Insets(5, 5, 5, 5));
    FileInputStream input = new FileInputStream("javafx-documentation.png");
    Image image = new Image(input);
    pane.getChildren().add(new ImageView(image));
    
    ImageView imageView2 = new ImageView(image);
    imageView2.setFitHeight(200);
    imageView2.setFitWidth(250);
    pane.getChildren().add(imageView2);   

    ImageView imageView3 = new ImageView(image);
    imageView3.setFitHeight(200);
    imageView3.setFitWidth(150);    
    imageView3.setRotate(90);
    pane.getChildren().add(imageView3);    
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowImage"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
