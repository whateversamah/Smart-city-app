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

public class Balance {
    @FXML
    private Button BackButton;
    @FXML
    private Label BalanceValue;
    @FXML
    private Label ErrorMesssage;
    @FXML
    private Button GoButton;
    @FXML
    private TextField RIB;


    public void BackOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("paiment.fxml"));
        Stage window = (Stage)BackButton.getScene().getWindow();
        window.setScene(new Scene(root, 635, 450));
    }
    public void GoOnAction(ActionEvent e) {
        if (e.getSource()==GoButton){
            Connection con;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sys","root","1234");
                PreparedStatement stmt=con.prepareStatement("select * from bankaccounts where RIB=? ");
                stmt.setString(1,String.valueOf(RIB.getText()));
                ResultSet resultSet = stmt.executeQuery();
                resultSet.next();
                if (String.valueOf(RIB.getText()).equals(resultSet.getString("RIB"))){
                    BalanceValue.setText(resultSet.getString("Balance"));
                } else {
                    ErrorMesssage.setText("Please try again.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}
