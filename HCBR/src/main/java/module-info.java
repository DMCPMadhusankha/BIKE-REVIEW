module com.example.hcbr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hcbr to javafx.fxml;
    exports com.example.hcbr;
}