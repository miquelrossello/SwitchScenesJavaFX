package FrameworkTest;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

    public static String MainScreenID = "main";
    public static String MainScreenFile = "MainScreen.fxml";
    public static String Screen1ID = "screen1";
    public static String Screen1File = "Screen1.fxml";

    @Override
    public void start(Stage primaryStage) {

        ScreensControlled mainContainer = new ScreensControlled();
        //Carrega les Screens, pero no les estableix
        mainContainer.loadScreen(MainScreenID, MainScreenFile);
        mainContainer.loadScreen(Screen1ID, Screen1File);
        //...

        //Estableix Screen
        mainContainer.setScreen(MainScreenID);

        Group root = new Group();
        root.getChildren().add(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
