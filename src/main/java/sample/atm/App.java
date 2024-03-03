package sample.atm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * JavaFX App
 */
public class App extends Application {

    private Parent window;

    @Override
    public void start(Stage stage) throws IOException {
       URL fileLocation = new File(
               "src/main/java/sample/atm/atm.fxml")
                .toURI().toURL();
       Parent root = FXMLLoader.load(fileLocation);
       stage.setScene(new Scene(root));
       stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}