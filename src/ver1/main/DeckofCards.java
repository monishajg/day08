package ver1.main;

import ver1.deck.deck;

public class DeckofCards {
    public static void main(String[] args) {
    int[] deck = new int[52];
    
    /*List<String> cart = new LinkedList<>();
    Console cons = System.console();
    Boolean stop = false*/
    
    String[] suits = {"spades", "hearts", "diamonds", "clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    switch (terms[0]) {
    case "shuffle":
      if (cart.size() <= 0) {
        System.out.println("Your cart is empty");
      } else {
        System.out.println("The contents of your cart");
      for (Integer idx = 0; idx < cart.size(); idx++)
        System.out.printf("%d. %s\n", idx + 1, cart.get(idx));
      }
        break;

      case "exit":
      stop = true;
       break;

    default:
      System.err.printf("Unknown command: %s\n", terms[0]);
    }

    /*// Initialize cards
    for (int i = 0; i < deck.length; i++) {
      deck[i] = i;
    }

    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      int index = (int)(Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index];
      deck[index] = temp;
    }

    // Display the all the cards
    for (int i = 0; i < 52; i++) {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      System.out.println( rank + " of " + suit);
    }*/
    }
}