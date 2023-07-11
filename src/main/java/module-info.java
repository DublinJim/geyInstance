module com.example.stageswitch {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.stageswitch to javafx.fxml;
    exports com.example.stageswitch;
}