package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Public {
    @FXML
    private Button BackButton;

    public void BackOnAction() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Bills.fxml"));
        Stage window = (Stage)BackButton.getScene().getWindow();
        window.setScene(new Scene(root, 620, 480));
    }
}
