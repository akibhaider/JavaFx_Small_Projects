package com.example.lab05_210041222_2b_simple_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    public boolean op_cnt=false, math_error=false;
    @FXML
    boolean first_operand=false;
    @FXML
    Double first_val, second_val, res_val;
    @FXML
    protected String digit_obj, ac_obj, operator_obj, old_display_txt, new_display_txt;
    @FXML
    private Label result_display;
    @FXML
    private Label welcome_text;

    @FXML
    protected void on_digit_clicked(ActionEvent event) {
        digit_obj=((Button)event.getSource()).getText();
        old_display_txt=result_display.getText();
        if(first_operand==false){
            first_operand=true;
            old_display_txt="";
        }
        new_display_txt=(old_display_txt+digit_obj);
        result_display.setText(new_display_txt);
    }
    @FXML
    protected void on_AC_clicked(ActionEvent event) {
        ac_obj=((Button)event.getSource()).getText();
        result_display.setText("");
        op_cnt=false;
    }
    @FXML
    protected void on_operator_clicked(ActionEvent event) {
        if(op_cnt){
            on_equal_clicked(event);
        }
        operator_obj=((Button)event.getSource()).getText();
        switch (operator_obj){
            case "+":
            case "-":
            case "*":
            case "/":
                old_display_txt=result_display.getText();
                first_val=Double.parseDouble(old_display_txt);
                result_display.setText("");
                op_cnt=true;
                break;
            default:
        }
    }
    @FXML
    protected void on_equal_clicked(ActionEvent event){
        old_display_txt=result_display.getText();
        second_val=Double.parseDouble(old_display_txt);
        switch(operator_obj){
            case "+":
                res_val=first_val+second_val;
                break;
            case "-":
                res_val=first_val-second_val;
                break;
            case "*":
                res_val=first_val*second_val;
                break;
            case "/":
                res_val=first_val/second_val;
                if(second_val==0.0){
                    math_error=true;
                }
                break;
            default:
        }
        if(math_error==true){
            result_display.setText("Math Error!");
        }else {
            new_display_txt = String.format("%.2f", res_val);
            result_display.setText(new_display_txt);
            first_val = res_val;
            first_operand = false;
        }
    }
}