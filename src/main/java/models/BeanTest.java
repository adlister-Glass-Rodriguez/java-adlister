package models;

import models.Album;
import models.Author;
import models.Quote;

import java.util.ArrayList;

public class BeanTest {


    public static void main(String[] args) {
            Album album1 = new Album();
            Quote quote1 = new Quote();
            Author author1 = new Author();
//            Date releaseDate1 = new Date("October 8, 2021");
            Album album2 = new Album();
            Quote quote2 = new Quote();
            Author author2 = new Author();
//            Date releaseDate2 = new Date("June 15, 2023");
            Album album3 = new Album();
            Quote quote3 = new Quote();
            Author author3 = new Author();
//            Date releaseDate3 = new Date("January 1, 2014");

            author1.setId(1);
            author1.setFirstName("John");
            author1.setLastName("Maxwell");
            author2.setId(2);
            author2.setFirstName("Patrick");
            author2.setLastName("Lencioni");
            author3.setId(3);
            author3.setFirstName("Jocko");
            author3.setLastName("Willink");

            quote1.setId(1);
            quote1.setAuthor(author1);
            quote1.setContent("We should never let what we cannot do keep us from doing what we can do. ...");
            quote2.setId(2);
            quote2.setAuthor(author2);
            quote2.setContent("Trust is knowing that when a team member does push you, they're doing it because they care about the team");
            quote3.setId(3);
            quote3.setAuthor(author3);
            quote3.setContent("When a team takes ownership of its problems, the problem gets solved. ...");

            album1.setId(1);
            album1.setArtist_name("Cody Johnson");
            album1.setRecord_name("Human");
//            album1.setRelease_date(releaseDate1);
            album1.setSales(4.5);
            album1.setGenre("country");
            album2.setId(2);
            album2.setArtist_name("Hardy");
            album2.setRecord_name("The Mocking Bird & The Crow");

            album2.setSales(8.7);
            album2.setGenre("Country");
            album3.setId(3);
            album3.setArtist_name("Eric Church");
            album3.setRecord_name("The Outsiders");

            album3.setSales(13.5);
            album3.setGenre("Country");

            ArrayList<Quote> quotes = new ArrayList<>();
            quotes.add(quote1);
            quotes.add(quote2);
            quotes.add(quote3);

            for(Quote quote : quotes) {
                System.out.printf("%s %s said: %s. %n", quote.getAuthor().getFirstName(), quote.getAuthor().getLastName(), quote.getContent());
            }
        }
    }
