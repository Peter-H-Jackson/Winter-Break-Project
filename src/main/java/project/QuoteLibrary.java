package project;

import java.util.ArrayList;

public class QuoteLibrary {

  private static ArrayList<String> quotes;

  /** Quotes **/
  // Create quotes
  public static ArrayList<String> createQuotes() {
    if (quotes == null) {
      populateQuotes();
    }
    return quotes;
  }
  // Initialize quotes
  private static void populateQuotes() {
    quotes = new ArrayList<>();

    quotes.add("Motivational text 1");
    quotes.add("Motivational text 2");
    quotes.add("Motivational text 3");
    quotes.add("Motivational text 4");
    quotes.add("Motivational text 5");

  }
}
