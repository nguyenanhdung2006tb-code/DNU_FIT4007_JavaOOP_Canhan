package part14.oop.midterm;

import java.util.Scanner;

public class Book {
    private int bookID;
    private String title;
    private String author;
    private long price;

    public Book() {}

    public Book(int bookID, String title, String author, long price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        bookID = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tiêu đề sách: ");
        title = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        author = sc.nextLine();
        System.out.print("Nhập giá sách: ");
        price = Long.parseLong(sc.nextLine());
    }

    @Override
    public String toString() {
        return "BookID: " + bookID + ", Title: " + title + ", Author: " + author + ", Price: " + price;
    }
}
