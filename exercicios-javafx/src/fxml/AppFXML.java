package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML  extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception { // criando o método start

		
		String arquivoCss = getClass().getResource("/fxml/Login.css").toExternalForm(); // carregando o arquivo .css
		
		// carregando a interface grafica
		URL arquivoFXML = getClass().getResource("fxml/Login.fxml");
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		
		Scene cena = new Scene(raiz, 350, 350); // tamanho da tela
		cena.getStylesheets().add(arquivoCss); // carregando o arquivo .css
		
		primaryStage.setResizable(false); // não permite ao usuário alterar o tamanho da tela
		primaryStage.setTitle("Tela de Login");
		primaryStage.setScene(cena);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
