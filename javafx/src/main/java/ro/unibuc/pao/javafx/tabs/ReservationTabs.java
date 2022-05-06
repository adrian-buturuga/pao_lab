package ro.unibuc.pao.javafx.tabs;

import javafx.scene.layout.BorderPane;

public class ReservationTabs extends AbstractAppTab {

    private BorderPane borderPane = new BorderPane();

    public ReservationTabs() {
        super("Reservations");
        this.setClosable(false);

        borderPane.setTop(buildHeader("Reservations"));

        this.setContent(borderPane);
    }
}
