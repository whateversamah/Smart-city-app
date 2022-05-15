package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;



public class Controller {
    @FXML
    private Button InfosButton;
    @FXML
    private Button BillsButton;
    @FXML
    private Button BalanceButton;

public void BalanceOnAction() throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("Balance.fxml"));
    Stage window = (Stage)BalanceButton.getScene().getWindow();
    window.setScene(new Scene(root, 580, 390));
}
    public void InfosOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Infos.fxml"));
        Stage window = (Stage)InfosButton.getScene().getWindow();
        window.setScene(new Scene(root, 620, 430));
    }
    public void BillsOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Bills.fxml"));
        Stage window = (Stage)BillsButton.getScene().getWindow();
        window.setScene(new Scene(root, 620, 480));
    }
    @FXML
    private Button BackButton;

    public void BackOnAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LandingPage.fxml"));
        Stage window = (Stage) BackButton.getScene().getWindow();
        window.setScene(new Scene(root, 709, 622));
    }

}
