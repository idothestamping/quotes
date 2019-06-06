/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.common.collect.Iterables;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args)  {
        String jsonFile = "src/main/resources/recentquotes.json";
        Quotes[] result = getQuote(jsonFile);

        int random = (int)(Math.random() * (result.length - 1) + 1);
        System.out.println(result[random].toString());
    }

    public static Quotes[] getQuote(String jsonFile) {
        Gson gson = new Gson();
        List<Quotes> newQuote = new ArrayList<>();
        Quotes[] itemsArray = new Quotes[newQuote.size()];

        try {
            BufferedReader br = new BufferedReader(new FileReader(jsonFile));
            Type newtype = new TypeToken<List<Quotes>>(){}.getType();
            newQuote = gson.fromJson(br, newtype);
            itemsArray = Iterables.toArray(newQuote, Quotes.class);

        } catch (IOException e) {
            System.out.println(e);
        }
        return itemsArray;
    }

}