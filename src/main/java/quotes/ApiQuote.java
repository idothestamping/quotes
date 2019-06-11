package quotes;

public class ApiQuote {
    public String starWarsQuote;

    public ApiQuote(String text) {
        this.starWarsQuote = text;
    }

    public String getText() {
        return starWarsQuote;
    }
    //    @Override
    public String toString() {
        return String.format("Star Wars quote: %s", this.starWarsQuote);
    }


}