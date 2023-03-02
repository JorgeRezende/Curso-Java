package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane{ // herdando de GridPane  extends GridPane()
	
	public TesteGridPane() { // construtor padrão
	
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		setGridLinesVisible(true); // para visualizar as linhas da grid		
		
		getColumnConstraints().addAll(cc(), cc(), fcc(), cc(), cc()); // adicionando colunas, a qtd de repetições de cc() é referente as colunas
		getRowConstraints().addAll(rc(),rc(),frc(),rc(),rc()); // adicionando linhas, a qtd de repetições de rc() é referente as linhas
	
		setVgap(10);
		setHgap(10);
		
		// adicionando os elementos na tela dizendo onde quero os elementos Ex.: coluna 0 linha 0, quantos espaços serão ocupados etc ..

		// adicionando a caixa C1 na coluna 0 e linha 0 usando as constrantes => getColumnConstraints().addAll(cc(), cc(), cc(), cc(), cc())
		// ocupando duas posições na coluna (,2) ficando mais largo (,1) em uma linha
		add(c1, 0, 0, 2, 1);
		add(c2, 1, 1, 2, 2);
		add(c3, 4, 2, 1, 3);
		add(c4, 3, 1); // ocupando apenas uma célula
		add(c5, 0, 4, 2 , 1);
		add(c6, 3, 3);
	}
	
	// criando uma função, defindo 5 linhas e 5 colunas, como serão os comportamentos das linhas e colunas
	private ColumnConstraints cc() { 
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20); // as colunas terão 20% do tamanho da tela		
		cc.setFillWidth(true); // preencher a largura
		return cc;
	}
	
	private ColumnConstraints fcc() {  //  mantendo os tamanhos das colunas com valores minimo e máximo fixos 
		ColumnConstraints fcc = new ColumnConstraints();
	//	fcc.setPercentWidth(20); // as colunas terão 20% do tamanho da tela
		fcc.setMinWidth(50);
		fcc.setMaxWidth(50);
		fcc.setFillWidth(true); // preencher a largura
		return fcc;
	}
	
	private RowConstraints rc() { // criando uma função,
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20); // as linhas terão 20% do tamanho da tela
		rc.setFillHeight(true); // preencher a altura
		return rc;
	}
	
	private RowConstraints frc() { //  mantendo os tamanhos das linhas com valores minimo e máximo fixos 
		RowConstraints frc = new RowConstraints();
	//	rc.setPercentHeight(20); // as linhas terão 20% do tamanho da tela
		frc.setMinHeight(50);
		frc.setMaxHeight(50);
		frc.setFillHeight(true); // preencher a altura
		return frc;
	}
}
