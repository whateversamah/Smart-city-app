package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Bills {
    @FXML
    private Button BackButton;
    @FXML
    private Button Water;
    public void BackOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("paiment.fxml"));
        Stage window = (Stage)BackButton.getScene().getWindow();
        window.setScene(new Scene(root, 635, 450));
    }
    public void WaterOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("WaterBills.fxml"));
        Stage window = (Stage)Water.getScene().getWindow();
        window.setScene(new Scene(root, 708, 536));
    }
    public void ElectricityOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ElectricityBills.fxml"));
        Stage window = (Stage)Water.getScene().getWindow();
        window.setScene(new Scene(root, 708, 536));
    }
    public void InternetOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("InternetBills.fxml"));
        Stage window = (Stage)Water.getScene().getWindow();
        window.setScene(new Scene(root, 708, 536));
    }
    public void GroceriesOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Groceries.fxml"));
        Stage window = (Stage)Water.getScene().getWindow();
        window.setScene(new Scene(root, 708, 536));
    }
    public void PublicOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Public.fxml"));
        Stage window = (Stage)Water.getScene().getWindow();
        window.setScene(new Scene(root, 708, 536));
    }
    public void DebtsOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Debts.fxml"));
        Stage window = (Stage)Water.getScene().getWindow();
        window.setScene(new Scene(root, 708, 536));
    }
}
