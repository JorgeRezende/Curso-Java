package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane{ // herdando de StackPane (extends StackPane)

	public TesteStackPane() { // construtor padrão
		
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		
		getChildren().addAll(c2, c3, c4, c5, c6, c1); // aparecem as caixas sobrepostas, a ultima na frente c1 está ultimo para que serja apresentado em primeiro
		
		// aplicando o evento ao proprio StackPane, vinculando o evento click do mouse a instancia atual que é o this
		setOnMouseClicked(e -> { // criou uma lambda que recebe o evento como parâmetro
			// se o x for maior que a metade da tela quer dizer que o usuário clicou do lado direito da tela
			if(e.getSceneX() > getScene().getWidth() / 2) { //  .getWidth() => pegou a largura
				// indice 0 get(0) que seria o c1,  toFront() => vá para frente de todas as stacks, c5, vai ficar navegando por todos os elementos
				getChildren().get(0).toFront(); 
			} else {
				// pegar o elemento de indice 5 e mandar ele para o back
				getChildren().get(5).toBack();
			}
	    });
		
		// criando uma Thread para as telas ficarem mudando de 3 em 3 segundos
		
		Thread t = new Thread(() -> { // passando como parâmetro uma lambda, usa somente o simbolo -> pq não recebe nenhum parametro
			while(true) {
				try {
					Thread.sleep(3000); // dando uma pausa de 3 segundos antes de mudar a tela
					
					// para que a aplicação possa rodar essa thread, tem que usar a classe	 Platform				
					Platform.runLater(() -> {
						getChildren().get(0).toFront();	
					});
				} catch (Exception e) {					
				} 
			}
		}); 
		t.setDaemon(true); // se a aplicação parar, a thread tb irá parar
		t.start();
	}
	
	
}
