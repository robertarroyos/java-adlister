package javaBeans;

import java.util.List;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Authors newAuthor = new Authors(1, "Robert", "Arroyos");
        Authors newAuthor2 = new Authors(2, "Chase", "Medford");
        Authors newAuthor3 = new Authors(3, "Andre", "AndreLastName");
        Authors newAuthor4 = new Authors(3, "Ken", "KenLastName");
        Authors newAuthor5 = new Authors(3, "Reggie", "ReggieLastName");

        Quotes newQuote1 = new Quotes(newAuthor, "New quote content");
        Quotes newQuote2 = new Quotes(newAuthor2, "Newer quote content added");
        Quotes newQuote3 = new Quotes(newAuthor3, "Newest quote content added");
        Quotes newQuote4 = new Quotes(newAuthor4, "Newester quote content added");
        Quotes newQuote5 = new Quotes(newAuthor5, "Newesterest quote content added");

        ArrayList<Quotes> quotes = new ArrayList<>(List.of(newQuote1, newQuote2, newQuote3, newQuote4, newQuote5));


       for (Quotes quote : quotes) {
           System.out.println( quote.getAuthors().getFirstName() + " " + quote.getAuthors().getLastName() + " " + "quote: " + quote.getContent());
       }

    }
}
