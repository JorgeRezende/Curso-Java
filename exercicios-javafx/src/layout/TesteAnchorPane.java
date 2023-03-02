package layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TesteAnchorPane extends AnchorPane { // gerenciador de layout Ancorar os elementos no topo, em baixo etc..
	
	public TesteAnchorPane() { // construtor padrão
		
		Quadrado q1 = new Quadrado();
		setTopAnchor(q1, 10.0);
		setLeftAnchor(q1, 10.0); // fazendo a ancorangem = > tem que colocar um double 10.0 pixels da esquerda por exemplo
		
		Quadrado q2 = new Quadrado();
		setTopAnchor(q2, 10.0);
		setRightAnchor(q2, 10.0); // fazendo a ancorangem = > tem que colocar um double 10.0 pixels da direita por exemplo
		
		Quadrado q3 = new Quadrado();
		setBottomAnchor(q3, 10.0); // parte de baixo
		setLeftAnchor(q3, 10.0); // fazendo a ancorangem = > tem que colocar um double 10.0 pixels da esquerda por exemplo
		
		Quadrado q4 = new Quadrado();
		setBottomAnchor(q4, 10.0);
		setRightAnchor(q4, 10.0); // fazendo a ancorangem = > tem que colocar um double 10.0 pixels da direita por exemplo
		

		HBox centro = new HBox();
		centro.setAlignment(Pos.CENTER);
		setTopAnchor(centro, 110.0);
		setBottomAnchor(centro, 110.0);
		setLeftAnchor(centro, 110.0);
		setRightAnchor(centro, 110.0);
		
		Quadrado q5 = new Quadrado();
		centro.getChildren().add(q5);
		
		getChildren().addAll(q1, q2, q3, q4, centro);
	}

}
