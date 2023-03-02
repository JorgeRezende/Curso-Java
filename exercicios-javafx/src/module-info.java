module exerciciosfx {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires org.controlsfx.controls;
	
	opens basico; // tem abrir o pacote básico para permitir que seja feito o reflection dentro das classes do pacote básico
	opens layout;
	opens fxml to javafx.graphics, javafx.fxml; // abrindo o pacote fxml
}