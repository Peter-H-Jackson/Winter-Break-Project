package project.controller;

import java.io.IOException;
import javafx.scene.layout.StackPane;

public interface Controller {

  // Returns an int specifying the page
  int getPage();

  // Returns a random image with quote
  StackPane getImageQuote() throws IOException;

  // Toggles between both pages
  void togglePage() throws IOException;

  // Refreshes the page
  void refresh() throws IOException;

}
