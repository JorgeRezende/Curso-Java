package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


// entrar em Run Configuration / Contador (que é classe que está) / Arguments / desmarcar opção Use The XX .... 
public class Contador extends Application {

	private int contador = 0;
	
	// método criado para alterar a cor, se <0 fica vermelho se >0 fica verde
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador)); // convertendo um inteiro como string
		
		label.getStyleClass().remove("verde"); // associando a classe css limpando as cores
		label.getStyleClass().remove("vermelha"); // associando a classe css limpando as cores
						
		if(contador > 0){
			label.getStyleClass().add("verde"); // associando a classe css								
		}else if(contador < 0){
			label.getStyleClass().add("vermelha"); // associando a classe css			
		}
	}
	
	
@Override
public void start(Stage primaryStage) throws Exception { // tem que criar esse contrutor
	
	
	
	Label labelTitulo = new Label("Contador");
	labelTitulo.getStyleClass().add("titulo"); // associando a classe css para pegar a cor da fonte
	
	Label  labelNumero = new Label("0");
	labelNumero.getStyleClass().add("numero"); // associando a classe css para pegar a cor da fonte
	
	Button botaoDecremento = new Button("-");
	botaoDecremento.getStyleClass().add("botoes"); // associando a classe css para deixar o botão redondo
	botaoDecremento.setOnAction(e -> { // recebe um evento como parâmetro
		contador --;
		atualizarLabelNumero(labelNumero);
	});
	
	Button botaoIncremento = new Button("+");
	botaoIncremento.getStyleClass().add("botoes"); // associando a classe css para deixar o botão redondo
	botaoIncremento.setOnAction(e ->{  // recebe um evento como parâmetro
		contador ++;
		//labelNumero.setText(Integer.toString(contador)); // convertendo um inteiro como string
		atualizarLabelNumero(labelNumero);
	});
	
	
	HBox boxBotoes = new HBox(); // box que agrupa os botões
	boxBotoes.setAlignment(Pos.CENTER); // alinhando na tela
	boxBotoes.setSpacing(10); // espaçamento
	boxBotoes.getChildren().add(botaoDecremento);
	boxBotoes.getChildren().add(botaoIncremento);
	
	VBox boxConteudo = new VBox();
	boxConteudo.getStyleClass().add("conteudo"); // nome da classe css(Contador.css) refrerente ao css , atibuindo os valores declarados no .css
	boxConteudo.setAlignment(Pos.CENTER); // alinhando na tela
	boxConteudo.setSpacing(10); // espaçamento
	boxConteudo.getChildren().add(labelTitulo); // O método getChildren () retorna uma lista modificável de filhos.
	boxConteudo.getChildren().add(labelNumero);
	boxConteudo.getChildren().add(boxBotoes);
	
	String caminhoDoCss = getClass() // getClass() é o método da classe Object. Este método retorna a classe de tempo de execução deste objeto
			              .getResource("/basico/Contador.css") // caminho do arquivo  css
			              .toExternalForm();
	
	Scene cenaPrincipal = new Scene(boxConteudo, 400,400);
	cenaPrincipal.getStylesheets().add(caminhoDoCss); // getStylesheets() => arquivos  do css
	cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald"); // caminho da font usada
	
	primaryStage.setScene(cenaPrincipal);
	primaryStage.show();
	}

public static void main(String[] args) { // tem que criar a classe main
	
	launch(args);
}
}
