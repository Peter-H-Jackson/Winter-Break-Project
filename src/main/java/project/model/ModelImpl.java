package project.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javafx.scene.image.Image;

public class ModelImpl implements Model {

  private ArrayList<String> imagePaths;
  private ArrayList<String> quotes;
  private ArrayList<ModelObserver> observers;
  int page;

  public ModelImpl(ArrayList<String> imagePaths, ArrayList<String> quotes) {
    this.imagePaths = imagePaths;
    this.quotes = quotes;
    this.observers = new ArrayList<>();
    this.page = 0;
  }

  public void _notify() throws IOException {
    for (ModelObserver observer : observers) {
      observer.update(this);
    }
  }

  @Override
  public int getPage() {
    return page;
  }

  @Override
  public String getImagePath() {
    Random rand = new Random();
    int imageIndex = rand.nextInt(imagePaths.size());
    String imagePath = imagePaths.get(imageIndex);

    return imagePath;
  }

  @Override
  public String getQuote() {
    Random rand = new Random();
    int quoteIndex = rand.nextInt(quotes.size());
    String quote = quotes.get(quoteIndex);

    return quote;
  }

  @Override
  public void togglePage() throws IOException {
    if (page == 0) {
      page = 1;
    } else {
      page = 0;
    }
    _notify();
  }

  @Override
  public void addObserver(ModelObserver observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(ModelObserver observer) {
    observers.remove(observer);
  }

  public void refresh() throws IOException { _notify(); }
}
