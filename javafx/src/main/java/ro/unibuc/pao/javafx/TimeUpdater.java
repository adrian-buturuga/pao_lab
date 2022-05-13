package ro.unibuc.pao.javafx;

import javafx.application.Platform;
import javafx.scene.text.Text;

public class TimeUpdater extends Thread {

    private int currentTime;
    private boolean started;
    private Text display;

    public TimeUpdater(Text display) {
        this.currentTime = 0;
        this.display = display;
    }

    @Override
    public void run() {
        started = true;

        while (started) {
            currentTime++;
            Platform.runLater(() -> {
                display.setText(((currentTime * 50 / 10) / 100.0) + "s");
            });

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                //
            }
        }
    }

    public void requestToStop() {
        started = false;
    }
}
