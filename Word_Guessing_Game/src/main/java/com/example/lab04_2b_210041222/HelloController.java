package com.example.lab04_2b_210041222;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Pane mypane;
    @FXML
    private ColorPicker my_color_picker;
    @FXML
    private Label my_label;
    @FXML
    public Label welcomeText;
    @FXML
    public Label w2_text;
    @FXML
    public Label w3_text;
    @FXML
    public Label congrats_text;


    String word1="", word2="", word3="";
    char ch;
    int cnt1=0, cnt2=0, cnt3=0;

    @FXML
    public void reset_w1(){
        cnt1=0;
        word1="";
        welcomeText.setText("Incorrect word!!");
    }
    @FXML
    public void show_w1(){
        word1+=ch;
        welcomeText.setText(word1);
        cnt1=cnt1+1;
    }
    @FXML
    public void on_CButtonClick() {
        if(cnt1==0){
            ch='C';
            show_w1();
        }else{
            reset_w1();
        }
    }
    @FXML
    public void on_AButtonClick() {
        if(cnt1==1) {
            ch = 'A';
            show_w1();
        }else{
            reset_w1();
        }
    }
    @FXML
    public void on_RButtonClick() {
        if(cnt1==2) {
            ch = 'R';
            show_w1();
            welcomeText.setText("CAR   is Correct");
        }else{
            reset_w1();
        }
        if(cnt1==3 && cnt2==4 && cnt3==4){
            congrats_text.setText("Congratulations! You guessed all words");
        }
    }
    // word 2
    @FXML
    public void reset_w2(){
        cnt2=0;
        word2="";
        w2_text.setText("Incorrect word!!");
    }
    @FXML
    public void show_w2(){
        word2+=ch;
        w2_text.setText(word2);
        cnt2=cnt2+1;
    }
    @FXML
    public void on_w2_TButtonClick() {
        if(cnt2==0){
            ch='T';
            show_w2();
        }else{
            reset_w2();
        }
    }
    @FXML
    public void on_w2_UButtonClick() {
        if(cnt2==1) {
            ch = 'U';
            show_w2();
        }else{
            reset_w2();
        }
    }
    @FXML
    public void on_w2_RButtonClick() {
        if(cnt2==2) {
            ch = 'R';
            show_w2();
        }else{
            reset_w2();
        }
    }
    @FXML
    public void on_w2_NButtonClick() {
        if(cnt2==3) {
            ch = 'N';
            show_w2();
            w2_text.setText("TURN   is Correct");
        }else{
            reset_w2();
        }
        if(cnt1==3 && cnt2==4 && cnt3==4){
            congrats_text.setText("Congratulations! You guessed all words");
        }
    }
    // word 3
    @FXML
    public void reset_w3(){
        cnt3=0;
        word3="";
        w3_text.setText("Incorrect word!!");
    }
    @FXML
    public void show_w3(){
        word3+=ch;
        w3_text.setText(word3);
        cnt3=cnt3+1;
    }
    @FXML
    public void on_w3_RButtonClick() {
        if(cnt3==0){
            ch='R';
            show_w3();
        }else{
            reset_w3();
        }
    }
    @FXML
    public void on_w3_OButtonClick() {
        if(cnt3==1) {
            ch = 'O';
            show_w3();
        }else{
            reset_w3();
        }
    }
    @FXML
    public void on_w3_AButtonClick() {
        if(cnt3==2) {
            ch = 'A';
            show_w3();
        }else{
            reset_w3();
        }
    }
    @FXML
    public void on_w3_DButtonClick() {
        if(cnt3==3) {
            ch = 'D';
            show_w3();
            w3_text.setText("ROAD   is Correct");

            if(cnt1==3 && cnt2==4 && cnt3==4){
                congrats_text.setText("Congratulations! You guessed all words");
            }

        }else{
            reset_w3();
        }
    }
    public void changeColor(ActionEvent e){
        Color my_color = my_color_picker.getValue();
        mypane.setBackground(new Background(new BackgroundFill(my_color, null, null)));
    }
}