import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Davids bok", "David", "0471958697"));
        listOfBooks.add(new Book("Ludwigs bok", "Ludwig", "1234958697"));
        listOfBooks.add(new Book("Jimmys bok", "Jimmy", "0435958697"));
        Rating rating1 = new Rating("Bosse", "Bosse.com", 3);
        Rating rating2 = new Rating("Kentan", "Kent.nu", 10);
        Rating rating3 = new Rating("Lena", "Handen.com", 1);
        listOfBooks.get(0).addRating(rating1);
        listOfBooks.get(0).addRating(rating2);
        listOfBooks.get(0).addRating(rating3);
        System.out.println(listOfBooks.get(0).ratingList.size());
        for (Book book : listOfBooks) {
        //    System.out.println(book);
        }




    }

}
