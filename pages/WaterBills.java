package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.sql.*;

public class WaterBills {
    @FXML
    private Button BackButton;

    public void BackOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Bills.fxml"));
        Stage window = (Stage)BackButton.getScene().getWindow();
        window.setScene(new Scene(root, 620, 480));
    }

}
