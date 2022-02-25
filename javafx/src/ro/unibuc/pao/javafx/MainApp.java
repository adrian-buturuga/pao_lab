package ro.unibuc.pao.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import ro.unibuc.pao.javafx.tabs.ReservationTabs;
import ro.unibuc.pao.javafx.tabs.ShowTabs;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        setStageParams(stage);
        Scene scene = createMainScene(stage);

        stage.show();
    }

    private void setStageParams(Stage stage) {
        stage.setTitle("This is my application title");
        stage.centerOnScreen();
    }

    private Scene createMainScene(Stage stage) {
        TabPane tabs = new TabPane();

        tabs.getTabs().add(new ShowTabs());

        tabs.getTabs().add(new ReservationTabs());

        Tab offers = new Tab("Offers");
        offers.setContent(new Label("something yet again"));
        offers.setClosable(false);
        tabs.getTabs().add(offers);
        Scene scene = new Scene(tabs, 600, 450);
        scene.setFill(Color.ALICEBLUE);
        stage.setScene(scene);
        return scene;
    }

    public static void main(String args[]) {
        launch(args);
    }
}
