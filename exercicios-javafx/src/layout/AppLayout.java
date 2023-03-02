package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application{ // herdando de Application (extends Application)

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent raiz = null;
		
		// referencias, por estarem no mesmo pacote não rpecisa importar
//		raiz = new TesteAnchorPane();
//		raiz = new TesteBorderPane();
//		raiz = new TesteFlowPane();
//		raiz = new TesteGridPane();
//		raiz = new TesteStackPane();
		raiz = new TesteTilePane();

		Scene principal = new Scene(raiz, 800,600);
		
		
//		VBox temp = new VBox();
//		temp.getChildren().add(new Caixa().comTexto("1")); // instanciou um objeto (new Caixa()) e chamou a função (comTexto("1")) que retorna uma caixa
//		temp.getChildren().add(new Caixa().comTexto("2"));
//		temp.getChildren().add(new Caixa().comTexto("3"));
//		temp.getChildren().add(new Caixa().comTexto("4"));
//		temp.getChildren().add(new Caixa().comTexto("5"));
//		temp.getChildren().add(new Caixa().comTexto("6"));
//		temp.getChildren().add(new Caixa().comTexto("7"));
		
		
//		temp.getChildren().add(new Quadrado()); // instanciou um objeto (new Quadrado()) 
//		temp.getChildren().add(new Quadrado());
//		temp.getChildren().add(new Quadrado());
//		temp.getChildren().add(new Quadrado());
//		temp.getChildren().add(new Quadrado());
//		temp.getChildren().add(new Quadrado());
//		temp.getChildren().add(new Quadrado());
//		
//		Scene principal = new Scene(temp, 800, 600);
		
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
