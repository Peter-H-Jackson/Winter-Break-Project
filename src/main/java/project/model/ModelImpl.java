package project.model;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class ModelImpl implements Model {

  // Data
  private ArrayList<String> imagePaths;
  private ArrayList<String> quotes;
  // Observers
  private ArrayList<ModelObserver> observers;
  // Found items
  private ArrayList<Integer> foundPictures;
  private ArrayList<Integer> foundQuotes;
  // Current item index
  int imageIndex;
  int quoteIndex;
  // Current page
  int page;

  public ModelImpl(ArrayList<String> imagePaths, ArrayList<String> quotes) {
    this.imagePaths = imagePaths;
    this.quotes = quotes;
    this.observers = new ArrayList<>();
    this.foundPictures = new ArrayList<>();
    this.foundQuotes = new ArrayList<>();
    this.imageIndex = 0;
    this.quoteIndex = 0;
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

  @Override
  public void refresh() throws IOException { _notify(); }
}
