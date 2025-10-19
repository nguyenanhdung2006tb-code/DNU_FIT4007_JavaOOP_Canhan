package part9.oop.methods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Example13BookList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách N: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<BookInput> books = new ArrayList<>();

        // Nhập danh sách N sách
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin sách thứ " + (i + 1));
            BookInput b = new BookInput();
            b.input();
            books.add(b);
        }

        // In ra toàn bộ danh sách
        System.out.println("\n=== Danh sách sách vừa nhập ===");
        books.forEach(System.out::println);

        // Tìm giá cao nhất
        double maxPrice = books.stream()
                .mapToDouble(BookInput::getPrice)
                .max()
                .orElse(0);
        System.out.println("\n=== Sách có giá cao nhất ===");
        books.stream()
                .filter(b -> b.getPrice() == maxPrice)
                .forEach(System.out::println);

        // Sách có tên "Java OOP"
        System.out.println("\n=== Sách có tên 'Java OOP' ===");
        books.stream()
                .filter(b -> "Java OOP".equalsIgnoreCase(b.getName()))
                .forEach(System.out::println);

        // Sắp xếp tăng dần theo quantity
        books.sort(Comparator.comparingInt(BookInput::getQuantity));
        System.out.println("\n=== Sách sắp xếp tăng dần theo quantity ===");
        books.forEach(System.out::println);

        // Sắp xếp giảm dần theo price
        books.sort(Comparator.comparingDouble(BookInput::getPrice).reversed());
        System.out.println("\n=== Sách sắp xếp giảm dần theo price ===");
        books.forEach(System.out::println);
    }
}
