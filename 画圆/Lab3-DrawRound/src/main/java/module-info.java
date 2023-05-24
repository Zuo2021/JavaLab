module com.example.lab3drawround {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab3drawround to javafx.fxml;
    exports com.example.lab3drawround;
}