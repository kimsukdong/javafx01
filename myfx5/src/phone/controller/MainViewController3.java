package phone.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import phone.Main;

public class MainViewController3 {
	@FXML
	AnchorPane root;
    @FXML
    void onClickAdd2(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("/phone/view/Add.fxml"));
			Main.mainLayout.setCenter(root);
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    void onClickDelete2(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("/phone/view/Delete.fxml"));
			Main.mainLayout.setCenter(root);
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    void onClickSearch2(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("/phone/view/Search.fxml"));
			Main.mainLayout.setCenter(root);
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

    @FXML
    void onClickUpdate2(ActionEvent event) {
		try {
			root = FXMLLoader.load(getClass().getResource("/phone/view/Update.fxml"));
			Main.mainLayout.setCenter(root);
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

}
