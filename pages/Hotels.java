package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Hotels {
    @FXML
    public Hyperlink hyperlink;
    @FXML
    public void openLink() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://www.tripadvisor.fr/Hotels-g293732-Casablanca_Casablanca_Settat-Hotels.html"));
    }
    @FXML
    private Button BackButton;

    public void BackOnAction() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LandingPage.fxml"));
        Stage window = (Stage) BackButton.getScene().getWindow();
        window.setScene(new Scene(root, 709, 622));
    }

}
