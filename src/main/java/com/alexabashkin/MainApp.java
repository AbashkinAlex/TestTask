package com.alexabashkin;

import com.alexabashkin.utils.ClassNameUtil;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.nio.file.Paths;

/**
 * It provides a link between the user and the system to solve the test tasks,
 * monitors user input, and the implementation of the necessary reaction.
 * @author Aleksandr Abashkin
 * @version 1.0
 */
public class MainApp extends Application {

    private static final Logger log = Logger.getLogger(ClassNameUtil.getCurrentClassName());

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        log.info("Starting application");

        String fxmlFile = "/fxml/hello.fxml";
        log.debug("Loading FXML for main view from: {}" + fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));

        log.debug("Showing JFX scene");
        Scene scene = new Scene(rootNode, 400, 600);
        scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("Hello JavaFX and Maven");
        stage.setScene(scene);
        stage.show();

    }
}
