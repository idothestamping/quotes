package quotes;

public class Quotes {
    private String text;
    private String author;

    public Quotes(String text, String author) {
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("Author: %s Quote: %s", this.author, this.text);
    }
}