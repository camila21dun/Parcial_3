package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import aplicacion.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Estudiante;
import model.TipoGenero;

public class GestionEstudianteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnMejorEstudiente;

    @FXML
    private Button btnPromedio;

    @FXML
    private Button btnPromedioTotal;

    @FXML
    private ComboBox<TipoGenero> cbGenero;

    @FXML
    private TableColumn<Estudiante, String> columnNit;

    @FXML
    private TableColumn<Estudiante, String> columnNombre;

    @FXML
    private TableView<Estudiante> tableEstudientes;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

	private Main main;

    @FXML
    void agregarEstudianteEvent(ActionEvent event) {
    	agregarEstudienteAction();

    }

    private void agregarEstudienteAction() {


	}

	@FXML
    void mejorEstudianteEvent(ActionEvent event) {
		mejorEstudianteAction();

    }

    private void mejorEstudianteAction() {

	}

	@FXML
    void promedioEstudienteEvent(ActionEvent event) {

    }

    @FXML
    void promedioTotalEvent(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

	public void setApplication(Main main) {
		this.main=main;

	}

}

