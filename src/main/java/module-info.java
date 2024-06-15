module lonnwolf031.textedit {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.xml;
    requires richtextfx;

    opens lonnwolf031.textedit to javafx.fxml;
    exports lonnwolf031.textedit;
}