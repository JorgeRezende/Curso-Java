package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Caixa extends HBox {
	
	private static int i = 0; // varialvel apra controlar a cor
	
	public String[] cores = { // array de cores
		
			"#c33c5e","#39aac6","#28d79a","#fb750e","#6657a8","#f9060e"
	};

	public Caixa() { // contrutor padrão

		this(100, 100); // larguira e altura padrão da caixa
	}
	
	public Caixa(int largura, int altura) {
		
		setAlignment(Pos.CENTER); // alinhamento no centro
		
		setMinWidth(largura); // minimo largura possível
		setMinHeight(altura); // altura minima
		
		BackgroundFill fill = new BackgroundFill(Color.web(cores[i]), CornerRadii.EMPTY, Insets.EMPTY);
		setBackground(new Background(fill)); // preenchimento de background
		
		i++; // sempre que criar um nova caixa ele vai pegar uma nova cor
		if(i == 6) i = 0; // como só foram definidas 6 cores (String[] cores), o i só pode ir até o 6
	}
	
	// adicionar um label dentro da caixa
	public Caixa comTexto(String texto) {
		Label label = new Label(texto);
		label.setFont(new Font(24));
		getChildren().add(label); //adicionar o label dentro do HBox
		return this; // retorna a proria instancia atual
	}
}
