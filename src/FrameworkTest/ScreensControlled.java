package FrameworkTest;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.util.HashMap;
import javafx.scene.Node;

public class ScreensControlled extends StackPane {

    private HashMap<String, Node> screens = new HashMap<>();

    public ScreensControlled() {
        super();
    }

    //Afegiex Screen
    private void addScreen(String nom, Node node) {
        screens.put(nom, node);
    }

    //Esborra Screen
    private void deleteScreen(String nom) {
        screens.remove(nom);
    }

    //Obtenir Screen
    public Node getScreen(String nom) {
        return screens.get(nom);
    }

    //Carregador d'Screens
    public void loadScreen(String nom, String ruta) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(ruta));
            Parent loadScreen = loader.load();
            ControlledScreen controlledScreen = loader.getController();
            controlledScreen.setScreenParent(this);
            addScreen(nom, loadScreen);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean setScreen(String nom) {
        if (screens.get(nom) != null) {
            if (!getChildren().isEmpty()) {
                getChildren().remove(0);
                getChildren().add(screens.get(nom));
            } else {
                //Carrega screen
                getChildren().add(screens.get(nom));
                return true;
            }
        }
        return false;
    }
}
