package basico;

//import java.nio.BufferUnderflowException;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		Button botaoA = new Button("A"); 
		Button botaoB = new Button("B"); 
		Button botaoC = new Button("C"); 
		
		 // setOnAction => quando acontecer uma action (ação)
		botaoA.setOnAction(e -> System.out.println("A"));
		botaoB.setOnAction(e -> System.out.println("B"));
		botaoC.setOnAction(e -> System.exit(0)); // para sair da aplicação
		
		
		VBox box = new VBox(); // VBox=> vai organizar os elementos na vertical. HBox => vai organizar  na horizontal  
		box.setSpacing(10); // espaço entre os botões
		box.setAlignment(Pos.CENTER); // alinhamentyo dos botões => Pos = Posição:
		
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		// criar uma sena para os botões que foram criados acima
		
		Scene unicaCena = new Scene(box, 100, 150); // 100 => largura, 150 => altura
		
		primaryStage.setScene(unicaCena); // joga a cena no palco para exibir
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
