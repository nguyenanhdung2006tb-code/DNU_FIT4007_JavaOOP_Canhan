package part14.oop.midterm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookManager {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public ArrayList<Book> searchBook(String title) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                result.add(b);
            }
        }
        return result;
    }

    public Book searchBook(int bookID) {
        for (Book b : books) {
            if (b.getBookID() == bookID) {
                return b;
            }
        }
        return null;
    }

    public void removeBook(int bookID) {
        books.removeIf(b -> b.getBookID() == bookID);
    }

    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void sortByPrice() {
        Collections.sort(books, Comparator.comparingLong(Book::getPrice));
    }

    public void sortByType() {
        Collections.sort(books, (b1, b2) -> {
            if (b1 instanceof HardcoverBook && b2 instanceof EBook) return -1;
            else if (b1 instanceof EBook && b2 instanceof HardcoverBook) return 1;
            else return 0;
        });
    }

    public long totalPrice() {
        long total = 0;
        for (Book b : books) {
            total += b.getPrice();
        }
        return total;
    }

    public double getTotalFileSize() {
        double total = 0;
        for (Book b : books) {
            if (b instanceof EBook) {
                total += ((EBook) b).getFileSizeMB();
            }
        }
        return total;
    }
}
