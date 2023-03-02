package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane { // herdando de FlowPane (extends FlowPane) 

	public TesteFlowPane() { // Construtor padrão

		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();
	
		
		setHgap(10); // qual espaço vc quer entre os elementos na horizontal
		setVgap(10); // qual espaço vc quer entre os elementos na vertical
		setPadding(new Insets(10)); //espaçamento interno Insets => esse é o que passamos um e ele aplica para todas as direções, não fica mais grudado no canto da tela
		
		setOrientation(Orientation.VERTICAL);
		setAlignment(Pos.CENTER_RIGHT); // centralizados do lado direito
		
		
		getChildren().addAll(q1,q2,q3,q4,q5);
	}
	
}
