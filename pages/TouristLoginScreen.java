package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.sql.*;


public class TouristLoginScreen {
    @FXML
    private Button BackButton;
    @FXML
    private Button SigninButton;
    @FXML
    private TextField SocialNumber;
    @FXML
    private PasswordField Password;
    @FXML
    private Label LoginMessageLabel;



    public void BackOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        Stage window = (Stage)BackButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }

    public void SigninButtonOnAction(ActionEvent e) {

        if (e.getSource()==SigninButton){
            Connection con;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sys","root","1234");
                PreparedStatement stmt=con.prepareStatement("select * from usersaccounts where idUsersAccounts=?");
                stmt.setString(1,String.valueOf(SocialNumber.getText()));
                ResultSet resultSet = stmt.executeQuery();
                resultSet.next();
                if (String.valueOf(Password.getText()).equals(resultSet.getString("Password"))){
                    LoginMessageLabel.setText("You are logged in");
                } else{
                    LoginMessageLabel.setText("Please try again.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}
