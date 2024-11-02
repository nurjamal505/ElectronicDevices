module org.example.electronicdevice {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.electronicdevice to javafx.fxml;
    exports org.example.electronicdevice;
}