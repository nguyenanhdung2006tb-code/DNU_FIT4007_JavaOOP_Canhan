package part14.oop.midterm;

import java.util.Scanner;

public class EBook extends Book {
    private String format;
    private double fileSizeMB;

    public EBook() {}

    public EBook(int bookID, String title, String author, long price, String format, double fileSizeMB) {
        super(bookID, title, author, price);
        this.format = format;
        this.fileSizeMB = fileSizeMB;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public boolean isBigBook() {
        return fileSizeMB > 200;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập định dạng sách điện tử: ");
        format = sc.nextLine();
        System.out.print("Nhập kích thước file (MB): ");
        fileSizeMB = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + ", Format: " + format + ", File size: " + fileSizeMB + "MB";
    }
}
