package quotes;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;


import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAppGson() throws IOException  {
        String allQuotes = App.read("src/main/resources/recentquotes.json");
        Gson gson = new Gson();
        Quotes[] gsonParse = gson.fromJson(allQuotes, Quotes[].class );
        System.out.println(gsonParse[1]);
    }

    @Test(expected = IOException.class)
    public void testAppReader() throws IOException {
        App.read("");
    }

    @Test
    public void testGetUrlQuote() throws IOException {
        try {
            URL url = new URL("http://swquotesapi.digitaljedi.dk/api/SWQuote/RandomStarWarsQuote");

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader((con.getInputStream())));

        } catch (MalformedURLException e) {
            System.out.println("exception: " + e);

        }
    }

    @Test
    public void testGetUrlQuoteMissing() throws IOException {
        try {
            URL url = new URL("");

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader((con.getInputStream())));

        } catch (MalformedURLException e) {
            System.out.println("exception: " + e);

        }
    }

    @Test
    public void testGetUrlQuoteBad() throws IOException {
        try {
            URL url = new URL("http://nothingHere");

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader((con.getInputStream())));

        } catch (UnknownHostException e) {
            System.out.println("exception: " + e);

        }
    }
}