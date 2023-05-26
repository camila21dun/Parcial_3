package controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import aplicacion.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Diplomado;
import model.Estudiante;
import model.TipoGenero;

public class GestionEstudianteController {

	 private ObservableList<Estudiante> listaEstudiantes = FXCollections.observableArrayList();


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
    private ComboBox<String> cbGenero;

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
    private TextField txtNota;

	private Main main;

	private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @FXML
    void agregarEstudianteEvent(ActionEvent event) {
    	agregarEstudienteAction();

    }

    private void agregarEstudienteAction() {

    	String nombre= txtNombre.getText();
    	String identificacion= txtId.getText();
    	String notas=txtNota.getText();
    	ArrayList<Float> listaNotas = new ArrayList<>();
    	 Estudiante estudiante = new Estudiante(nombre, identificacion, null, listaNotas);
       listaEstudiantes.addAll(estudiante);
       tableEstudientes.setItems(listaEstudiantes);
       calcularPromedio(estudiante);


	}
    private void calcularPromedio(Estudiante estudiante) {

	}
	@FXML
    void seleccionarGenero(ActionEvent event) {
    	String seleccionar= cbGenero.getValue();

    }


	@FXML
    void mejorEstudianteEvent(ActionEvent event) {
		mejorEstudianteAction();

    }

    private void mejorEstudianteAction() {

	}

	@FXML
    void promedioEstudienteEvent(ActionEvent event) {
		promedioEstudianteAction();

    }

    private void promedioEstudianteAction() {
		// TODO Auto-generated method stub

	}
	@FXML
    void promedioTotalEvent(ActionEvent event) {
		promedioTotal();

    }

    private void promedioTotal() {
		// TODO Auto-generated method stub

	}
	@FXML
    void initialize() {

    	cbGenero.getItems().addAll("Masculino","Femenino");

    }

	public void setApplication(Main main) {
		this.main=main;

	}


}

