package com.example.demo2;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class HelloApplication extends Application {
    Stage primaryStage;
    GridPane gridPane = new GridPane();
    Scene scene;
    public void start(Stage primaryStage) throws FileNotFoundException {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Courier Service System");


        GridPane gridPane=new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(15);
        gridPane.setPadding(new Insets(20,20,20,20));
        Image image = new Image("6982750_3333449.jpg");
        ImageView imageView=new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);
        gridPane.add(imageView,1,0);
        image.
//        VBox vBox=new VBox();
//        vBox.getChildren().add(imageView);
//        gridPane.add(vBox,0,0);
//        vBox.setAlignment(Pos.TOP_CENTER);

        Text title=new Text("Welcome to login form");
        title.setFont(new Font("Times new roman",30));
        title.setStyle("-fx-border-color: #6ec2e5");
        gridPane.add(title,1,1);

        Label userLabel=new Label("Enter Your User Name");
        gridPane.add(userLabel,1,2);
        TextField userTextFiled=new TextField();
        gridPane.add(userTextFiled,2,2);

        Label paswordLabel=new Label("Enter Your Password");
        gridPane.add(paswordLabel,1,3);
        PasswordField passwordField=new PasswordField();
        gridPane.add(passwordField,2,3);

        Button exit=new Button("Exit");
        exit.setStyle("-fx-background-color:#6ec2e5 ");
        exit.setOnAction(e-> System.out.println("Exit button clicked"));


        Label messageLabel=new Label();
        HBox hBox=new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER_RIGHT);

//        gridPane.add(userLabel,0,4);
//        gridPane.add(paswordLabel,0,5);
//        gridPane.add(userTextFiled,1,4);
//        gridPane.add(passwordField,1,5);
        Button login=new Button("Login");
        login.setStyle("-fx-background-color: #6ec2e5 ");
        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                messageLabel.setText(userTextFiled.getText());

                primaryStage.setScene(homePage());

            }
        });




        hBox.getChildren().addAll(login,exit);
        gridPane.add(hBox,1,6);
        gridPane.add(messageLabel,1,5);
        scene=new Scene(gridPane,600,400);


        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public Scene sendpackage() {
        GridPane gridPane1 = new GridPane();
        Scene scene1 = new Scene(gridPane1, 600, 400);
//        stage.setScene(scene1);
        Text text = new Text("Select Your Package:");
         gridPane1.setHgap(10);
         gridPane1.setVgap(10);
        text.setFont(new Font("arial",30));
        gridPane1.add(text, 2, 1,3,2);

        gridPane1.setPadding(new Insets(40, 40, 40, 40));

        Button smallpackage = new Button("Small Package");
        smallpackage.setStyle("-fx-background-color: #6ec2e5 ");

        Button mediumpackage = new Button("Medium Package");
        mediumpackage.setStyle("-fx-background-color: #6ec2e5");

        Button largepackage = new Button("Large Package");
        largepackage.setStyle("-fx-background-color: #6ec2e5");

        smallpackage.setOnAction(e -> switchToUserInput());
        mediumpackage.setOnAction(e -> switchToUserInput());
        largepackage.setOnAction(e -> switchToUserInput());
        VBox vbox = new VBox();
        vbox.getChildren().addAll(smallpackage, mediumpackage, largepackage);
        vbox.setAlignment(Pos.CENTER_RIGHT);

        gridPane1.add(vbox,2,3);
        vbox.setSpacing(15);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20));
        Button back=new Button("back");
        back.setOnAction(e -> switchToHomePage());


        gridPane1.add(back,3,4);

        return scene1;
    }
    public Scene homePage() {
        GridPane gridPane2 = new GridPane();
        Scene scene2 = new Scene(gridPane2, 700, 400);
//        Image backgroundImage = new Image("com/example/demo2/6982750_3333449.jpg");
//        gridPane2.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
//        stage.setScene(scene1);
        Text text = new Text("Please Select an Option:");
        gridPane2.setHgap(10);
        gridPane2.setVgap(10);
        text.setFont(new Font("arial",30));
        //text.setStyle("");
        gridPane2.add(text, 2, 1,3,2);

        gridPane2.setPadding(new Insets(40, 40, 40, 40));

        Text text1=new Text("To update a package please select:");
        Button updatepackage = new Button("Update Package");
        updatepackage.setStyle("-fx-background-color: #6ec2e5 ");
        HBox hbox1=new HBox();
        hbox1.getChildren().addAll(text1,updatepackage);
        hbox1.setSpacing(20);

        Text text2= new Text("To send a package please select:");
        text2.setFont(new Font("arial",20));
        text1.setFont(new Font("arial",20));
        Button sendpackage = new Button("Send Package");
        sendpackage.setStyle("-fx-background-color: #6ec2e5");
        sendpackage.setOnAction(e -> switchToSendPackage());
        HBox hbox2=new HBox();
        hbox2.getChildren().addAll(text2,sendpackage);
        hbox2.setSpacing(35);

        Text text3=new Text("To search a package please select:");
        text3.setFont(new Font("arial",20));
        Button searchpackage = new Button("Search Package");
        searchpackage.setStyle("-fx-background-color: #6ec2e5");
        HBox hbox3=new HBox();
        hbox3.getChildren().addAll(text3,searchpackage);
        hbox3.setSpacing(24);


        VBox vbox = new VBox();
        vbox.getChildren().addAll(hbox1,hbox2,hbox3);
        vbox.setAlignment(Pos.CENTER_RIGHT);

        gridPane2.add(vbox,2,3);
        vbox.setSpacing(15);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20));
        Button back=new Button("back");
        back.setOnAction(e -> primaryStage.setScene(scene));

        gridPane2.add(back,3,4);
        return scene2;
    }
    public Scene userinput() {
        GridPane gridPane3 = new GridPane();
        Scene scene2 = new Scene(gridPane3, 700, 400);
//        Image backgroundImage = new Image("com/example/demo2/6982750_3333449.jpg");
//        gridPane2.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.CENTER,BackgroundSize.DEFAULT)));
//        stage.setScene(scene2);
        Text text = new Text("Please Enter The Details Of Your Package:");
        gridPane3.add(text,0,0);
        text.setFont(new Font("Times new roman",30));

        Label label1=new Label("Sender's Name:");
        TextField textField1=new TextField();
        HBox hbox1=new HBox();
        hbox1.getChildren().addAll(label1,textField1);

        Label label2=new Label("Sender's Address:");
        TextField textField2=new TextField();
        HBox hbox2=new HBox();
        hbox2.getChildren().addAll(label2,textField2);

        Label label3=new Label("Receiver's Name:");
        TextField textField3=new TextField();
        HBox hbox3=new HBox();
        hbox3.getChildren().addAll(label3,textField3);

        Label label4=new Label("Receiver's Address:");
        TextField textField4=new TextField();
        HBox hbox4=new HBox();
        hbox4.getChildren().addAll(label4,textField4);

        Label label5=new Label("Date of Placing Order:");
        TextField textField5=new TextField();
        HBox hbox5=new HBox();
        hbox5.getChildren().addAll(label5,textField5);

        Label label6=new Label("Weight of Package:");
        TextField textField6=new TextField();
        HBox hbox6=new HBox();
        hbox6.getChildren().addAll(label6,textField6);

        VBox allboxes=new VBox();
        allboxes.getChildren().addAll(hbox1,hbox2,hbox3,hbox4,hbox5,hbox6);
        gridPane3.setVgap(40);
        gridPane3.add(hbox1,0,3);
        gridPane3.add(hbox2,0,4);
        gridPane3.add(hbox3,0,5);
        gridPane3.add(hbox4,0,6);
        gridPane3.add(hbox5,0,7);
        gridPane3.add(hbox6,0,8 );
        Button calculatecost=new Button("Calculate Cost");
                gridPane3.add(calculatecost,0,9);
        calculatecost.setStyle("-fx-background-color: #6ec2e5");


        gridPane3.setHgap(10);
        gridPane3.setVgap(10);


        return scene2;
    }

    public void switchToSendPackage() {
        Scene sendPackage = sendpackage();
        primaryStage.setScene(sendPackage);
    }
    public void switchToHomePage() {
        Scene homePage = homePage();
        primaryStage.setScene(homePage);
    }
    public void switchToUserInput() {
        Scene userInput = userinput();
        primaryStage.setScene(userInput);
    }

    public static void main(String[] args) {

        launch();
}
}