package part14.oop.midterm;

import java.util.Scanner;

public class Example02FruitManagement {
    public static void main(String[] args) {
        FruitList list = new FruitList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU QUẢN LÝ TRÁI CÂY ---");
            System.out.println("1. Thêm trái cây");
            System.out.println("2. Xem danh sách trái cây");
            System.out.println("3. In danh sách có giá bán > 20");
            System.out.println("4. Tính tổng số lượng trái cây");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Thêm FruitIn");
                    System.out.println("2. Thêm FruitOut");
                    int type = Integer.parseInt(sc.nextLine());
                    Fruit f;
                    if (type == 1) f = new FruitIn();
                    else f = new FruitOut();
                    f.input();
                    list.addFruit(f);
                    break;
                case 2:
                    list.displayAll();
                    break;
                case 3:
                    list.displayHighPriceFruits();
                    break;
                case 4:
                    System.out.println("Tổng số lượng trái cây: " + list.countFruits());
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
