import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  Rating rating1 = new Rating("Bosse", "Bosse.com", 3);
        //   Rating rating2 = new Rating("Kentan", "Kent.nu", 10);
        //  Rating rating3 = new Rating("Lena", "Handen.com", 1);
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Davids bok", "David", "0471958697"));
        listOfBooks.add(new Book("Ludwigs bok", "Ludwig", "1234958697"));
        listOfBooks.add(new Book("Jimmys bok", "Jimmy", "0435958697"));


        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int i = 1;
                System.out.println("Våra böcker: ");
                for (Book list : listOfBooks) {
                    System.out.println(i + " " + list);
                    i++;
                }

                System.out.println("Vilken bok vill du betygsätta? Skriv 0 för avslut");
                int choice = scanner.nextInt();
                System.out.println("Vad heter du?");
                String name = scanner.next();
                System.out.println("Vad är din epost?");
                String email = scanner.next();
                System.out.println("Vad är dit betyg? 1-10");
                int rating = scanner.nextInt();
                Rating rater = new Rating(name, email, rating);
                listOfBooks.get(choice - 1).addRating(rater);
                if (choice == 0) {
                    break;
                }
            }
        }
    }


}
