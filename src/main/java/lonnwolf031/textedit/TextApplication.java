package lonnwolf031.textedit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lonnwolf031.textedit.lib.EditorUtils;

import java.io.IOException;

public class TextApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TextApplication.class.getResource("main.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        scene.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());

        stage.setScene(scene);
        stage.setMinHeight(640);
        stage.setMinWidth(640);
        stage.setTitle("untitled");
        stage.setOnCloseRequest(event -> {
            EditorUtils.onCloseExitConfirmation();
            event.consume();
        });
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}