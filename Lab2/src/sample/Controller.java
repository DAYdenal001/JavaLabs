package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Menu menu;

    @FXML
    private MenuItem exitBtn;

    @FXML
    private MenuItem infoBtn;

    @FXML
    private HBox hBox;

    @FXML
    private ChoiceBox<?> parametrSelect;

    @FXML
    private TextField textVew;

    @FXML
    private Button searchBtn;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> firstName;

    @FXML
    private TableColumn<?, ?> secondName;

    @FXML
    private TableColumn<?, ?> salary;

    @FXML
    private TableColumn<?, ?> hours;

    @FXML
    private TableColumn<?, ?> department;

    @FXML
    void About(ActionEvent event) {

    }

    @FXML
    void Exit(ActionEvent event) {

    }

    @FXML
    void Search(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert menuBar != null : "fx:id=\"menuBar\" was not injected: check your FXML file 'sample.fxml'.";
        assert menu != null : "fx:id=\"menu\" was not injected: check your FXML file 'sample.fxml'.";
        assert exitBtn != null : "fx:id=\"exitBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert infoBtn != null : "fx:id=\"infoBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert hBox != null : "fx:id=\"hBox\" was not injected: check your FXML file 'sample.fxml'.";
        assert parametrSelect != null : "fx:id=\"parametrSelect\" was not injected: check your FXML file 'sample.fxml'.";
        assert textVew != null : "fx:id=\"textVew\" was not injected: check your FXML file 'sample.fxml'.";
        assert searchBtn != null : "fx:id=\"searchBtn\" was not injected: check your FXML file 'sample.fxml'.";
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'sample.fxml'.";
        assert firstName != null : "fx:id=\"firstName\" was not injected: check your FXML file 'sample.fxml'.";
        assert secondName != null : "fx:id=\"secondName\" was not injected: check your FXML file 'sample.fxml'.";
        assert salary != null : "fx:id=\"salary\" was not injected: check your FXML file 'sample.fxml'.";
        assert hours != null : "fx:id=\"hours\" was not injected: check your FXML file 'sample.fxml'.";
        assert department != null : "fx:id=\"department\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
