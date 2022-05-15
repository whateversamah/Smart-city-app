package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LandingPage {
    @FXML
    private Button BackButton;
    @FXML
    private Button ExitButton;
    @FXML
    private Button MailButton;
    @FXML
    private Button BankButton;
    @FXML
    private Button MonumentsButton;
    @FXML
    private Button HotelsButton;
    @FXML
    private Button RestaurantsButton;
    @FXML
    private Button MapButton;
    @FXML
    private Button ParksButton;
    @FXML
    private Button MuseumButton;
    @FXML
    private Button ProfileButton;
    @FXML
    private Button MallButton;
    @FXML
    private Button FacilitiesButton;
    @FXML
    private Button DocumentsButton;

    public void BackOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Stage window = (Stage)BackButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
    public void ExitButtonOnAction(ActionEvent e) {
        Stage stage = (Stage) ExitButton.getScene().getWindow();
        stage.close();
    }
    public void MailOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Mailing.fxml"));
        Stage window = (Stage)MailButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
    public void BankOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("paiment.fxml"));
        Stage window = (Stage)BankButton.getScene().getWindow();
        window.setScene(new Scene(root, 627, 480));
    }
    public void MonumentsOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Monuments.fxml"));
        Stage window = (Stage)MonumentsButton.getScene().getWindow();
        window.setScene(new Scene(root, 813, 588));
    }
    public void HotelsOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Hotels.fxml"));
        Stage window = (Stage)HotelsButton.getScene().getWindow();
        window.setScene(new Scene(root, 828, 600));
    }
    public void RestaurantsOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Restaurants.fxml"));
        Stage window = (Stage)RestaurantsButton.getScene().getWindow();
        window.setScene(new Scene(root, 897, 597));
    }
    public void MapOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Map.fxml"));
        Stage window = (Stage)MapButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
    public void ParksOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Parks.fxml"));
        Stage window = (Stage)ParksButton.getScene().getWindow();
        window.setScene(new Scene(root, 813, 532));
    }
    public void MuseumOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Museum.fxml"));
        Stage window = (Stage)MuseumButton.getScene().getWindow();
        window.setScene(new Scene(root, 796, 564));
    }
    public void ProfileOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("UserProfil.fxml"));
        Stage window = (Stage)ProfileButton.getScene().getWindow();
        window.setScene(new Scene(root, 476, 560));
    }
    public void MallOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Mall.fxml"));
        Stage window = (Stage)MallButton.getScene().getWindow();
        window.setScene(new Scene(root, 838, 586));
    }
    public void FacilitiesOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FacilityProfil.fxml"));
        Stage window = (Stage)FacilitiesButton.getScene().getWindow();
        window.setScene(new Scene(root, 422, 437));
    }
    public void DocumentsOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Documents.fxml"));
        Stage window = (Stage)DocumentsButton.getScene().getWindow();
        window.setScene(new Scene(root, 600, 400));
    }
}
