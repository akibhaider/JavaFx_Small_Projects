module com.example.lab05_210041222_2b_simple_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab05_210041222_2b_simple_calculator to javafx.fxml;
    exports com.example.lab05_210041222_2b_simple_calculator;
}