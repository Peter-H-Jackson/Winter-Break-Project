package project.view;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import project.controller.Controller;

public class DisplayView implements FXComponent {

  private final Controller controller;

  public DisplayView (Controller controller) { this.controller = controller; }


  @Override
  public Parent render() throws IOException {
    BorderPane layout = new BorderPane();

    /** Create and place motivational picture **/
    StackPane image= controller.getImageQuote();
    layout.setCenter(image);

    /** Create button options beneath **/
    HBox bottomInterface = new HBox();

    // FIX
    HBox back = new HBox();
    Button backButton = new Button("Back");
    backButton.setMinSize(125, 45);
    backButton.setFont(Font.font(15));
    backButton.setOnAction(
        (ActionEvent event) -> {
          try {
            controller.togglePage();
          } catch (IOException e) {
            e.printStackTrace();
          }
        });
    back.getChildren().add(backButton);
    back.setPadding(new Insets(20));

    // FIX
    HBox refresh = new HBox();
    Button refreshButton = new Button("Refresh");
    refreshButton.setMinSize(125, 45);
    refreshButton.setFont(Font.font(15));
    refreshButton.setOnAction(
        (ActionEvent event) -> {
          try {
            controller.refresh();
          } catch (IOException e) {
            e.printStackTrace();
          }
        });
    refresh.getChildren().add(refreshButton);
    refresh.setPadding(new Insets(20));

    bottomInterface.getChildren().addAll(back, refresh);
    bottomInterface.setAlignment(Pos.CENTER);
    bottomInterface.setPadding(new Insets(30));
    layout.setBottom(bottomInterface);

    return layout;
  }
}
