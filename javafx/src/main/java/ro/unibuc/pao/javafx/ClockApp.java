package ro.unibuc.pao.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class ClockApp extends Application {

    private Text clockTime;
    private TimeUpdater timeUpdaterThread = null;

    @Override
    public void start(Stage stage) throws Exception {
        setStageParams(stage);
        createMainScene(stage);
        stage.show();
    }

    private void setStageParams(Stage stage) {
        stage.setTitle("Clock");
        stage.centerOnScreen();
    }

    private Scene createMainScene(Stage stage) {
        clockTime = new Text("0.00s");
        clockTime.setFont(new Font(20));
        VBox contents = new VBox();

        contents.getChildren().add(clockTime);

        Button start = new Button();
        start.setText("Start");
        start.setOnAction((ActionEvent event) -> {
            if (timeUpdaterThread != null) {
                timeUpdaterThread.requestToStop();
            }
            timeUpdaterThread = new TimeUpdater(clockTime);
            timeUpdaterThread.start();
        });
        start.setGraphic(new Circle(15));
        start.setDefaultButton(true);
        contents.getChildren().add(start);

        Button stop = new Button();
        stop.setText("Stop");
        stop.setOnAction((ActionEvent e) -> {
            if (timeUpdaterThread != null) {
                timeUpdaterThread.requestToStop();
                timeUpdaterThread = null;
            }
        });
        stop.setCancelButton(true);
        contents.getChildren().add(stop);

        contents.setPadding(new Insets(50, 50, 50, 50));
        Scene scene = new Scene(contents, 600, 450);
        stage.setScene(scene);

        stage.setOnCloseRequest((WindowEvent e) -> {
            if (timeUpdaterThread != null) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Really quit?", ButtonType.YES, ButtonType.NO);
                alert.showAndWait();
                if (alert.getResult() == ButtonType.YES) {
                    timeUpdaterThread.requestToStop();
                } else {
                    // cancel closing of app
                }
            }
        });

        return scene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
