package aplicacion;

import java.io.IOException;



import controllers.GestionEstudianteController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends javafx.application.Application{

	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {

		this.primaryStage = primaryStage;

		mostrarVentanaPrincipal();

	}

	private void mostrarVentanaPrincipal() {

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Application.class.getResource("/views/GestionEstudiantes111.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			GestionEstudianteController estudienteController = loader.getController();
			estudienteController.setApplication(this);


			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	public static void main(String[] args) {
		launch(args);
	}
}
