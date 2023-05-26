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

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/GestionEstudiantes111.fxml"));
        Parent root = loader.load();

      
        GestionEstudianteController controller = loader.getController();

        controller.setStage(primaryStage);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
