package ver1.deck;

public class deck {
    private String colour;
    private String suit;
    private String rank;
    private Integer count;
    
    public deck() { }
    
    public deck(String colour, String suit, String rank) {
        this.colour = colour;
        this.suit = suit;
        this.rank = rank;   // (1) at this juncture -> CTRL SHIFT P > Source action > Generate Getters Setters > Sellect all that apply
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        switch (colour.toLowerCase()) {
            // if (make.equals("red") || make.equals("black")
            case "black":
            case "red":
                this.colour = colour;
                break; }
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        switch (suit.toLowerCase()) {
            case "diamonds":
            case "hearts":
            case "spades":
            case "clubs":
                this.suit = suit;
                break; }
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        switch (suit.toLowerCase()) {
            case "Ace":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "Jack":
            case "Queen":
            case "King":
                this.rank = rank;
                break; }
    }
    // methods - behaviour 
    public void shuffle() {
        System.out.println("Dealer is shuffling the deck");

    public void deal() {

    }
    }
}