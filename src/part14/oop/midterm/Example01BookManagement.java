package part14.oop.midterm;

import java.util.Scanner;

public class Example01BookManagement {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU QUẢN LÝ SÁCH ---");
            System.out.println("1. Xem danh sách sách");
            System.out.println("2. Thêm sách");
            System.out.println("3. Tìm sách");
            System.out.println("4. Xoá sách theo bookID");
            System.out.println("5. Sắp xếp sách");
            System.out.println("6. Tính tổng giá sách");
            System.out.println("7. Tính tổng kích thước sách điện tử");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    manager.displayBooks();
                    break;
                case 2:
                    System.out.println("1. Thêm sách cứng");
                    System.out.println("2. Thêm sách điện tử");
                    int type = Integer.parseInt(sc.nextLine());
                    Book b;
                    if (type == 1) b = new HardcoverBook();
                    else b = new EBook();
                    b.input();
                    manager.addBook(b);
                    break;
                case 3:
                    System.out.println("1. Tìm theo title");
                    System.out.println("2. Tìm theo bookID");
                    int sub = Integer.parseInt(sc.nextLine());
                    if (sub == 1) {
                        System.out.print("Nhập title: ");
                        String t = sc.nextLine();
                        manager.searchBook(t).forEach(System.out::println);
                    } else {
                        System.out.print("Nhập bookID: ");
                        int id = Integer.parseInt(sc.nextLine());
                        Book found = manager.searchBook(id);
                        System.out.println(found != null ? found : "Không tìm thấy");
                    }
                    break;
                case 4:
                    System.out.print("Nhập bookID cần xoá: ");
                    int id = Integer.parseInt(sc.nextLine());
                    manager.removeBook(id);
                    break;
                case 5:
                    System.out.println("1. Sắp theo giá tăng dần");
                    System.out.println("2. Sắp theo loại");
                    int s = Integer.parseInt(sc.nextLine());
                    if (s == 1) manager.sortByPrice();
                    else manager.sortByType();
                    break;
                case 6:
                    System.out.println("Tổng giá sách: " + manager.totalPrice());
                    break;
                case 7:
                    System.out.println("Tổng kích thước sách điện tử: " + manager.getTotalFileSize() + " MB");
                    break;
                case 8:
                    System.out.println("Thoát chương trình.");
                    return;
            }
        }
    }
}
