package FrameworkTest;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMainScreen implements Initializable, ControlledScreen {

    ScreensControlled mainScreen;
    @FXML
    private Button buttonPantalla1;

    @Override
    public void setScreenParent(ScreensControlled screen) {
        mainScreen = screen;
    }

    @FXML
    public void goToScreen1() {
        mainScreen.setScreen(MainApplication.Screen1ID);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
