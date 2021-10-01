package com.example.javafxp1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle mycircle;
    private double x ;
    private  double y;

    @FXML
    protected void onupButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
        //System.out.println("UP");
        mycircle.setCenterY(y=y-5);

    }
    @FXML
    protected void onrightButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
        //System.out.println("RIGHT");
        mycircle.setCenterX(x+=5);
    }
    @FXML
    protected void ondownButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
        //System.out.println("Down");
        mycircle.setCenterY(y+=5);
    }
    @FXML
    protected void onleftButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
        //System.out.println("left");
        mycircle.setCenterX(x-=5);
    }
}