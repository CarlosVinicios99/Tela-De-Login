module exerciciosfx {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.controlsfx.controls;
	 
    opens fxml to javafx.graphics, javafx.fxml;
}

