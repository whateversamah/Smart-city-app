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

public class Infos {
    @FXML
    private Button BackButton2;
    @FXML
    private Button CheckButton;
    @FXML
    private TextField ID;
    @FXML
    private Label NameLabel;
    @FXML
    private Label SocialNumberLabel;
    @FXML
    private Label RIBLabel;
    @FXML
    private Label AdressLabel;
    @FXML
    private Label IDLabel;
    @FXML
    private Label ErrorMesssage;

    public void BackOnAction2() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("paiment.fxml"));
        Stage window = (Stage)BackButton2.getScene().getWindow();
        window.setScene(new Scene(root, 628, 450));
    }
    public void CheckOnAction(ActionEvent e) {
        if (e.getSource()==CheckButton){
            Connection con;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sys","root","1234");
                PreparedStatement stmt=con.prepareStatement("select * from bankaccounts where Account_ID=? ");
                stmt.setString(1,String.valueOf(ID.getText()));
                ResultSet resultSet = stmt.executeQuery();
                resultSet.next();
                if (String.valueOf(ID.getText()).equals(resultSet.getString("Account_ID"))){
                    NameLabel.setText(resultSet.getString("Full_Name"));
                    SocialNumberLabel.setText(resultSet.getString("Social_Number"));
                    RIBLabel.setText(resultSet.getString("RIB"));
                    AdressLabel.setText(resultSet.getString("Location"));
                    IDLabel.setText(resultSet.getString("Account_ID"));
                } else {
                    ErrorMesssage.setText("Please try again.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}