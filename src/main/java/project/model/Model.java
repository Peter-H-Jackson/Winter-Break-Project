package project.model;

import java.io.IOException;
import javafx.scene.image.Image;

public interface Model {

  // Returns an int specifying the page
  int getPage();

  // Returns a random image
  String getImagePath();

  // Returns a random quote
  String getQuote();

  // Toggles between both pages
  void togglePage() throws IOException;

  // Add an observer to the model
  void addObserver(ModelObserver observer);

  // Remove an observer to the model
  void removeObserver(ModelObserver observer);

  // Refresh page
  void refresh() throws IOException;
}
