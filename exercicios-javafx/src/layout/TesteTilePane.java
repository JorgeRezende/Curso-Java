package layout;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class TesteTilePane extends TilePane{ // herdando de TilePane  (extends TilePane)

	public TesteTilePane() { // construtior padrão

		List<Quadrado> quadrados = new ArrayList<>();
		
		// No TilePane todos os elementos terão o mesmo tamanho
		for (int i = 1; i < 10; i++) {
			quadrados.add(new Quadrado(i * 10));
		}
		setVgap(10); // 10 cm
		setHgap(10);
		
		// Para se afastar dos outros componentes da tela 
		// 20 => em cima / 10 = > na lateral / 20 => em baixo / 10 => na outra lateral 
		setPadding(new Insets(20, 10, 20, 10 ));   
		setOrientation(Orientation.VERTICAL); // orientação da apresentação em vertical
		setTileAlignment(Pos.BOTTOM_RIGHT); // reposicionando os elementos
		getChildren().addAll(quadrados);
	}
}
