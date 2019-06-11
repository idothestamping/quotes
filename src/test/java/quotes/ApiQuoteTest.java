package quotes;

import org.junit.Test;
import static org.junit.Assert.*;

public class ApiQuoteTest {

    @Test
    public void testRandomQuoteConstructorText() {
        ApiQuote randomQuote = new ApiQuote("Test Constructor");
        assertEquals("Should create text", "Test Constructor", randomQuote.getText());
    }

    @Test
    public void testRandomQuotesToString() {
        ApiQuote randomQuote = new ApiQuote("Test String");
        assertEquals("should return a string", "Star Wars quote: Test String", randomQuote.toString());
    }

    @Test
    public void testQuoteConstructorAuthor() {
        Quotes quotes = new Quotes("Rilke", "I don't like Mondays");
        assertEquals("Should create an author", "Rilke", quotes.getAuthor());
    }

    @Test
    public void testQuoteConstructorText() {
        Quotes quotes = new Quotes("Rilke", "I don't like Mondays");
        assertEquals("Should create text", "I don't like Mondays", quotes.getText());
    }

    @Test
    public void testQuotesToString() {
        Quotes quotes = new Quotes("Rilke", "I don't like Mondays");
        assertEquals("should return a string", "Author: Rilke\n" +
                "Quote: I don't like Mondays", quotes.toString());
    }
}