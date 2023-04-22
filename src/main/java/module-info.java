module com.stempien.geometric {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
requires java.mail;

    opens com.stempien.geometric to javafx.fxml;
    exports com.stempien.geometric;
}