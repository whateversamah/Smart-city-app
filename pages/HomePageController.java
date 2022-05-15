package sample;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class HomePageController {
    @FXML
    private Button TouristButton;
    @FXML
    private Button FacilityButton;
    @FXML
    private Button CitizenButton;


    public void switchToCitizenLoginScreen(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CitizenLoginScreen.fxml"));
        Stage window = (Stage)CitizenButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));

    }
    public void switchToTouristLoginScreen(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TouristLoginScreen.fxml"));
        Stage window = (Stage)TouristButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
    public void switchToFacilityLoginScreen(ActionEvent e) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FacilityLoginScreen.fxml"));
        Stage window = (Stage)FacilityButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
}
