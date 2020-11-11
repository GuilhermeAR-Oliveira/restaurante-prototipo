/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: 
 */

package restaurante;

import javafx.application.Application;
import javafx.stage.Stage;

public class Restaurante extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("SceneBuilder.fxml"));

        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) throws Exception 
    {
        lanch(args);
    }
}

