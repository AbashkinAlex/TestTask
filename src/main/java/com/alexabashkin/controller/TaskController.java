package com.alexabashkin.controller;

import com.alexabashkin.exercise.exercise1.Task1;
import com.alexabashkin.utils.ClassNameUtil;
import com.alexabashkin.exercise.exercise3.Task3;
import com.alexabashkin.exercise.exercise2.Task2;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import org.apache.log4j.Logger;
import java.io.File;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * It provides a link between the user and the system to solve the test tasks,
 * monitors user input, and the implementation of the necessary reaction.
 * @author Aleksandr Abashkin
 * @version 1.0
 */
public class TaskController {
    private static String inputFileAdress = null;
    private static final Logger log = Logger.getLogger(ClassNameUtil.getCurrentClassName());
    @FXML
    private TextField nameField; // input user name
    @FXML
    private TextField inputNumberField; // input number of brackets
    @FXML
    private Label messageLabelTask1;
    @FXML
    private Label messageLabelTask2;
    @FXML
    private Label messageLabelTask3;


    public void task1() {
        String userName = nameField.getText();
        String inputNumber = inputNumberField.getText();
        if (inputNumber.length() > 0) {
            long number = Integer.parseInt(inputNumber);
            if (number >= 0) {

                log.debug("Saying hello to " + userName);
                messageLabelTask1.setText("Hello " + userName + "!\n" + "Result task1 : " + Task1.showResult(number));
            } else {
                log.debug("Neither first name nor last name was set, saying hello to anonymous person");
                messageLabelTask1.setText("Hello mysterious person");
            }
        }
    }

    public void task2() throws IOException {
        if (inputFileAdress != null) {
            System.out.println(Task2.showResult(inputFileAdress));
            messageLabelTask2.setText("Result task2 :\n" + Task2.showResult(inputFileAdress));
        }
    }

    public void task3(){
        messageLabelTask3.setText("Result showResult : " + Task3.showResult());
    }


    public void startPlayer(){
        Media pick = new Media(Paths.get("BackAudio.mp3").toUri().toString());
        MediaPlayer player = new MediaPlayer(pick);
        player.play();
    }

    public void fileChooser() {

        FileChooser fc = new FileChooser();
        fc.setInitialDirectory(new File("src/main/resources/inputFile/exercise2"));
        fc.getExtensionFilters().addAll(new ExtensionFilter("Only file *.txt", "*.txt"));

        File selectedFile = fc.showOpenDialog(null);

        if (selectedFile != null) {
            System.out.println(selectedFile.getAbsolutePath());
            inputFileAdress = selectedFile.getAbsolutePath();
        } else {
            System.out.println("File is not valid");
        }
    }


}
