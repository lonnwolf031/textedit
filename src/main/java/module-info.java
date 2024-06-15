module lonnwolf.textedit {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.xml;
    requires richtextfx;

    opens lonnwolf031.textedit.gui.components to javafx.graphics, javafx.fxml;
    exports lonnwolf031.textedit;
}