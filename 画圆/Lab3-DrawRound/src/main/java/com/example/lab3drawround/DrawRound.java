package com.example.lab3drawround;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

import java.util.Random;

public class DrawRound extends Application
{
    @Override
    public void start(Stage stage)
    {

        Random random = new Random();
        int i,x,y,r,red,green,blue;
        Circle[] circle = new Circle[10];

        for(i=0;i<10;i++)
        {
            circle[i] = new Circle();
            r = random.nextInt(50)+25;
            x = random.nextInt(1700)+100;
            y = random.nextInt(1000)+100;
            red = random.nextInt(100);
            green = random.nextInt(100);
            blue = random.nextInt(100);
            circle[i].setCenterX(x);
            circle[i].setCenterY(y);
            circle[i].setRadius(r);
            circle[i].setFill(Color.rgb(red,green,blue));
        }

        Group root = new Group(circle);

        Scene scene = new Scene(root, 1920, 1200);

        stage.setTitle("Drawing");

        stage.setScene(scene);

        stage.show();
    }
    public static void main(String args[])
    {
        launch(args);
    }
}

