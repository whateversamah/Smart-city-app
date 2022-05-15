package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.*;

public class InternetBills {
    @FXML
    private Button BackButton;
    @FXML
    private Button GoButton;
    @FXML
    private TextField ID;
    @FXML
    private Label AugustBills;
    @FXML
    private Label SeptBills;
    @FXML
    private Label DecBills;
    @FXML
    private Label NovBills;
    @FXML
    private Label OctobBills;
    @FXML
    private Label ErrorMesssage;

    public void BackOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Bills.fxml"));
        Stage window = (Stage)BackButton.getScene().getWindow();
        window.setScene(new Scene(root, 620, 480));
    }
    public void GoOnAction(ActionEvent e) {
        if (e.getSource()==GoButton){
            Connection con;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sys","root","1234");
                PreparedStatement stmt=con.prepareStatement("select * from intbills where ID=? ");
                stmt.setString(1,String.valueOf(ID.getText()));
                ResultSet resultSet = stmt.executeQuery();
                resultSet.next();
                if (String.valueOf(ID.getText()).equals(resultSet.getString("ID"))){
                    AugustBills.setText(resultSet.getString("AugustBills"));
                    SeptBills.setText(resultSet.getString("SeptemberBills"));
                    OctobBills.setText(resultSet.getString("OctoberBills"));
                    NovBills.setText(resultSet.getString("NovemberBills"));
                    DecBills.setText(resultSet.getString("DecemberBills"));
                } else {
                    ErrorMesssage.setText("Please try again.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
