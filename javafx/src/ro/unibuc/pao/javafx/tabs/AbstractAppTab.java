package ro.unibuc.pao.javafx.tabs;

import javafx.geometry.Insets;
import javafx.scene.control.Tab;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public abstract class AbstractAppTab extends Tab {

    public AbstractAppTab(String text) {
        super(text);
    }

    protected HBox buildHeader(String title) {
        HBox titleHBox = new HBox();
        titleHBox.setPadding(new Insets(20, 40, 20, 40));
        titleHBox.setBackground(new Background(new BackgroundFill(new Color(55.0 / 255, 83.0 / 255, 116.0 / 255, 1), CornerRadii.EMPTY, Insets.EMPTY)));

        Text titleText = new Text(title);
        titleText.setFill(Color.WHITE);
        titleText.setFont(new Font("Arial", 24));
        titleText.setTextAlignment(TextAlignment.LEFT);

        titleHBox.getChildren().add(titleText);
        return titleHBox;
    }
}
