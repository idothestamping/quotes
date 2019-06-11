package quotes;

public class Quotes {
    public String author;
    public String text;

    public Quotes(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    //    @Override
    public String toString() {
        return String.format("Author: %s\nQuote: %s", this.author, this.text);
    }
}