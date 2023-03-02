package layout;


import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Quadrado extends Rectangle {

private static int i = 0; // varialvel apra controlar a cor
	
	public String[] cores = { // array de cores
		
			"#c33c5e","#39aac6","#28d79a","#fb750e","#6657a8","#f9060e"
	};

	public Quadrado() { // contrutor padrão

		this(100); // larguira e altura padrão da caixa
	}
	
	public Quadrado(int tamanho) {
		
			
		setWidth(tamanho); // largura 
		setHeight(tamanho); // altura 
		
		
		setFill(Color.web(cores[i])); // preenchimento de background
		
		i++; // sempre que criar um nova caixa ele vai pegar uma nova cor
		if(i == 6) i = 0; // como só foram definidas 6 cores (String[] cores), o i só pode ir até o 6
	}
		
}
