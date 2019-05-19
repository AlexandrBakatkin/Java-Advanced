package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Controller {

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    @FXML
    Button btn1;

    public void enter(){
        btn1.fire();
    }

    public void sendMsg() {
        textArea.appendText(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME) + ": " + textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}
