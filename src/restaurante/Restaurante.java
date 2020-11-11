/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: 
 */

package restaurante;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Restaurante extends Application
{
    public static void main(String[] args) throws Exception 
    {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("SceneBuilder.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }
}

