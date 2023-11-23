import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Davids bok", "David", "0471958697"));
        listOfBooks.add(new Book("Ludwigs bok", "Ludwig", "1234958697"));
        listOfBooks.add(new Book("Jimmys bok", "Jimmy", "0435958697"));

        for (Book book : listOfBooks) {
            System.out.println(book);
        }




    }

}
