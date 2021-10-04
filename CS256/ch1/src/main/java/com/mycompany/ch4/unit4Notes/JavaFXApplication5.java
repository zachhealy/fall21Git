/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch4.unit4Notes;;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 *
 * @author ziping
 */
public class JavaFXApplication5 extends Application {
    //one stage multiple scenes
    Scene scene1, scene2;
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Scene1
        Button btn = new Button();
        btn.setText("Go to Scene2");
        Label label1= new Label("This is the first scene");     
        FileInputStream input = new FileInputStream("java.png");
        Image image = new Image(input);    
        VBox layout1= new VBox(20);
        layout1.getChildren().addAll(label1, new ImageView(image),btn);
        btn.setOnAction(e -> primaryStage.setScene(scene2));        
        scene1 = new Scene(layout1, 300, 250);    
        
        //Scene 2
        Label label2= new Label("This is the second scene");
        Polygon polygon = new Polygon(); //create a polygon
        //Adding coordinates to the polygon 
        polygon.getPoints().addAll(new Double[]{ 
            100.0, 30.0,
            180.0, 30.0,
            230.0, 90.0,
            180.0, 150.0,
            100.0, 150.0,
            50.0,90.0,
        }); 
        polygon.setFill(Color.GREEN);         
        Group poly = new Group(polygon); //group object         
        Button button2= new Button("Go to scene 1");
        button2.setOnAction(e -> primaryStage.setScene(scene1));
        VBox layout2= new VBox(20);
        layout2.getChildren().addAll(label2, poly, button2);
        scene2= new Scene(layout2,300,250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
