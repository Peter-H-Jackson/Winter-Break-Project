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

    quotes.add("Live, Laugh, Love");
    quotes.add("Love For All, Hatred for None");
    quotes.add("Sing like no one is listening. Love like you've never been hurt. Dance like nobody is watching.");
    quotes.add("You have to look through the rain to see the rainbow");
    quotes.add("Keep calm and carry on");
    quotes.add("Shoot for the moon. Even if you miss, you'll land among the stars.");
    quotes.add("Everything happens for a reason.");
    quotes.add("If life gives you lemons, make lemonade");
    quotes.add("Real eyes realize real lies");
    quotes.add("You miss 100% of the shots you don't take");
    quotes.add("YOLO");
  }
}
