package restaurante;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField textField;

    @FXML
    private Button submitbtn;

    @FXML
    private Label display;

    @FXML
    void onSubmitBtnClick(ActionEvent event)
    {
        display.setText(txtField.getText());
    }
}
