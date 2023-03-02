package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application{

	// Terceiro passo criar o Stage e as Cenas que serão usadas nas telas
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;
	
	
	// Primeiro passo é criar o metodo start => Ctrl + barra de espaço seleciona start override aplication
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		janela = primaryStage;
		criarPasso1();
		criarPasso2();
		criarPasso3();
		
		janela.setScene(passo1); // setando para que o passo1 seja o principal
		janela.setTitle("Wizard :: Passo 01");
		janela.show();
	}
	
	private void criarPasso1() {
		Button proximoPasso = new Button("Ir para Passo 2 >>");
		
		proximoPasso.setOnAction(e ->{
			janela.setScene(passo2); // quando clicar no botão vai para o passo 2
			janela.setTitle("Wizard :: Passo 02");
		});		
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoPasso);
		
		passo1 = new Scene(box,400,400);
	}
	
	private void criarPasso2() {
		Button passoAnterior = new Button("<< Voltar para Passo 1");
		passoAnterior.setOnAction(e ->{
			janela.setScene(passo1); // volta para o passo 1
			janela.setTitle("Wizard :: Passo 02");
		});
		
		Button proximoPasso = new Button("Ir para Passo 3 >>");
		proximoPasso.setOnAction(e ->{
			janela.setScene(passo3);
			janela.setTitle("Wizard :: Passo 03");
		});
		
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(proximoPasso);
		
		passo2 = new Scene(box,400,400);
	}
	
	private void criarPasso3() {
		Button passoAnterior = new Button("<< Voltar para Passo 2");
		passoAnterior.setOnAction(e ->{
			janela.setScene(passo2); // volta para o passo 2
			janela.setTitle("Wizard :: Passo 02");
		});
		
		Button proximoPasso = new Button("Finalizar!");
		proximoPasso.setOnAction(e ->{
			System.exit(0); // 0 => concluindo a aplicação sem erro, fechandoS
		});
		
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(proximoPasso);
		
		passo3 = new Scene(box,400,400); // setando o passo 3
	}
	
	// Segundo passo é cliar o método main, com launch(args);
	public static void main(String[] args) {
		launch(args);
		
	}
}
