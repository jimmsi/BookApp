import java.util.ArrayList;
import java.util.List;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private String isbn;

public List<Rating> ratingList;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.ratingList = new ArrayList<>();
    }
    public boolean addRating(Rating rating){
        for (Rating emailCheck: ratingList) {
            if(emailCheck.getEmail().equals(rating.getEmail()))
                return false;
        }
        ratingList.add(rating);
        return true;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        int averageRating;
        int ratingSum = 0;
        for (Rating rating: ratingList) {
            ratingSum +=rating.getRating();
        }
        if(!(ratingList.size() ==0)) {
            averageRating = ratingSum / ratingList.size();
        }
        else {
            averageRating =0;
        }
        return String.format("Book info: Title: %s Author: %s ISBN: %s Rating: %d", title, author, isbn,averageRating);
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(o.ratingList);
    }
}
