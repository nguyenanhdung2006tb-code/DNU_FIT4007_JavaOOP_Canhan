package part14.oop.midterm;

import java.util.Scanner;

public class HardcoverBook extends Book {
    private String coverMaterial;
    private int numberOfPages;

    public HardcoverBook() {}

    public HardcoverBook(int bookID, String title, String author, long price, String coverMaterial, int numberOfPages) {
        super(bookID, title, author, price);
        this.coverMaterial = coverMaterial;
        this.numberOfPages = numberOfPages;
    }

    public String getCoverMaterial() {
        return coverMaterial;
    }

    public void setCoverMaterial(String coverMaterial) {
        this.coverMaterial = coverMaterial;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chất liệu bìa: ");
        coverMaterial = sc.nextLine();
        System.out.print("Nhập số trang: ");
        numberOfPages = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + ", Cover Material: " + coverMaterial + ", Pages: " + numberOfPages;
    }
}
