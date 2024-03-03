module sample.atm {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.atm to javafx.fxml;
    exports sample.atm;
}