package FrameworkTest;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerScreen1 implements Initializable, ControlledScreen {

    ScreensControlled screensControlled;
    @FXML
    private Button buttonMain;

    @Override
    public void setScreenParent(ScreensControlled screen) {
        screensControlled = screen;
    }

    @FXML
    public void goToMain() {
        screensControlled.setScreen(MainApplication.MainScreenID);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
