package project.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.beans.property.DoubleProperty;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import project.model.Model;

public class ControllerImpl implements Controller {

  private Model model;

  public ControllerImpl(Model model) {
    this.model = model;
  }


  @Override
  public int getPage() {
    return model.getPage();
  }

  @Override
  public StackPane getImageQuote() throws IOException {
    StackPane pane = new StackPane();

    String imagePath = model.getImagePath();
    Image image = new Image(new FileInputStream(imagePath));
    ImageView imageView = new ImageView();
    imageView.setImage(image);
    imageView.setFitHeight(400);
    imageView.setFitWidth(600);
    imageView.setPreserveRatio(true);

    Text quote = new Text(model.getQuote());

    pane.getChildren().addAll(imageView, quote);

    return pane;
  }

  @Override
  public void togglePage() throws IOException {
    model.togglePage();
  }

  @Override
  public void refresh() throws IOException {
    model.refresh();
  }
}
