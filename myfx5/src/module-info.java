module myfx5 {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.sql;
	requires java.desktop;
	
	opens phone to javafx.graphics, javafx.fxml, javafx.base;
	opens phone.controller to javafx.graphics, javafx.fxml,javafx.base;
}
