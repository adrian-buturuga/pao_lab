package ro.unibuc.pao.javafx.tabs;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.util.Pair;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class ShowTabs extends AbstractAppTab {

    private BorderPane borderPane = new BorderPane();

    List<Pair<String, LocalDateTime>> content = Arrays.asList(
            new Pair("Avengers: Endgame", LocalDateTime.now()),
            new Pair("Pikachu", LocalDateTime.of(2018, 6, 22, 12, 0, 3)),
            new Pair("Something else", LocalDateTime.now().plus(2, ChronoUnit.DAYS))
    );

    public ShowTabs() {
        super("Shows");
        this.setClosable(false);

        borderPane.setTop(buildHeader("Shows currently airing"));
        displayContent();

        this.setContent(borderPane);
    }

    private void displayContent() {
        VBox contentBox = new VBox();
        contentBox.setPadding(new Insets(20, 40, 20, 40));

        for (Pair<String, LocalDateTime> show : content) {
            HBox hbox = getContentEntry(show.getKey(), show.getValue());
            contentBox.getChildren().add(hbox);
        }
        borderPane.setCenter(contentBox);
    }

    private HBox getContentEntry(String title, LocalDateTime time) {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(0, 0, 20, 0));
        Label name = new Label(title);
        name.setMinWidth(200);
        name.setMaxWidth(200);
        Text date = new Text(time.format(DateTimeFormatter.ofPattern("dd-MM-YYYY @ HH:mm:ss")));
        hbox.getChildren().addAll(name, date);
        return hbox;
    }
}
