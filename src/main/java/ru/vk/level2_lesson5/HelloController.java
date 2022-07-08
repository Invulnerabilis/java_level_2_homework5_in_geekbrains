package ru.vk.level2_lesson5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class HelloController {

    @FXML
    private ListView<Label> labelList;

    @FXML
    private TextArea message;

    @FXML
    protected void onSendButtonClick() {
        if (!message.getText().equals("")) {
            labelList.getItems().add(new Label(message.getText()));
            message.clear();
        }
    }

    @FXML
    protected void onKeyPressed(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER))
            if (!message.getText().equals("")) {
                labelList.getItems().add(new Label(message.getText()));
                message.clear();
            }
    }
}