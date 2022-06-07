package ra5.eurovision.controlador;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ra5.eurovision.modelo.Festival;

public class FestivalController {

    private Festival festival;

    @FXML
    private TextArea areaTxt;

    @FXML
    private Button btnMostrarPuntos;

    @FXML
    private TextField txtField;

    @FXML
    private Button btnMostrarGanador;

    @FXML
    private CheckBox checkGuardar;

    @FXML
    private Button btnClear;

    public FestivalController() {
        festival=new Festival();
    }



    @FXML
    void salir(ActionEvent event) {
        Platform.exit();
    }



    private void cogerFoco() {
        txtField.requestFocus();
        txtField.selectAll();

    }

    @FXML
    void clear(ActionEvent event) {
        areaTxt.setText("");
        cogerFoco();

    }

}

