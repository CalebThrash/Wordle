module com.example.jaxafx_practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jaxafx_practice to javafx.fxml;
    exports com.example.jaxafx_practice;
}