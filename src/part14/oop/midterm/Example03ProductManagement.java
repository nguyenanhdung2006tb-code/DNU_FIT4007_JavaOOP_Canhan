package part14.oop.midterm;

import java.util.Scanner;

public class Example03ProductManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TypeProductManager typeManager = new TypeProductManager();
        ProductManager productManager = new ProductManager();

        while (true) {
            System.out.println("\n--- MENU CHÍNH ---");
            System.out.println("1. Quản lý loại sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát chương trình");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    typeManagerMenu(typeManager);
                    break;
                case 2:
                    productManagerMenu(productManager, typeManager);
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    // menu quản lý loại sản phẩm
    public static void typeManagerMenu(TypeProductManager typeManager) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- QUẢN LÝ LOẠI SẢN PHẨM ---");
            System.out.println("1. Xem danh sách loại sản phẩm");
            System.out.println("2. Thêm loại sản phẩm");
            System.out.println("3. Sắp xếp theo ID (tăng)");
            System.out.println("4. Sắp xếp theo ID (giảm)");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Xóa loại sản phẩm");
            System.out.println("7. Thoát");
            System.out.print("Chọn: ");
            int c = Integer.parseInt(sc.nextLine());
            switch (c) {
                case 1: typeManager.displayAll(); break;
                case 2:
                    TypeProduct tp = new TypeProduct();
                    tp.input();
                    typeManager.add(tp);
                    break;
                case 3: typeManager.sortById(); break;
                case 4: typeManager.sortById(true); break;
                case 5:
                    System.out.print("Nhập tên loại cần tìm: ");
                    String name = sc.nextLine();
                    for (TypeProduct t : typeManager.search(name)) System.out.println(t);
                    break;
                case 6:
                    System.out.print("Nhập ID cần xóa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    typeManager.remove(id);
                    break;
                case 7: return;
                default: System.out.println("Sai lựa chọn.");
            }
        }
    }

    // menu quản lý sản phẩm
    public static void productManagerMenu(ProductManager productManager, TypeProductManager typeManager) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- QUẢN LÝ SẢN PHẨM ---");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sắp xếp theo ID");
            System.out.println("4. Sắp xếp theo giá bán");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int c = Integer.parseInt(sc.nextLine());
            switch (c) {
                case 1: productManager.displayAll(); break;
                case 2:
                    if (typeManager.getAll().isEmpty()) {
                        System.out.println("Chưa có loại sản phẩm. Hãy tạo trước.");
                        break;
                    }
                    System.out.println("Chọn loại sản phẩm:");
                    for (TypeProduct t : typeManager.getAll())
                        System.out.println(t);
                    System.out.print("Nhập ID loại: ");
                    int id = Integer.parseInt(sc.nextLine());
                    TypeProduct tp = typeManager.search(id);
                    if (tp == null) {
                        System.out.println("Không tìm thấy loại này.");
                        break;
                    }
                    System.out.println("1. Sản phẩm nội địa");
                    System.out.println("2. Sản phẩm nhập khẩu");
                    int type = Integer.parseInt(sc.nextLine());
                    Product p;
                    if (type == 1) p = new ProductIn();
                    else p = new ProductOut();
                    p.input(tp);
                    productManager.add(p);
                    break;
                case 3:
                    System.out.println("1. Tăng dần");
                    System.out.println("2. Giảm dần");
                    int opt = Integer.parseInt(sc.nextLine());
                    productManager.sortById(opt == 2);
                    break;
                case 4:
                    System.out.println("1. Tăng dần");
                    System.out.println("2. Giảm dần");
                    int opt2 = Integer.parseInt(sc.nextLine());
                    productManager.sortByPrice(opt2 == 2);
                    break;
                case 5: return;
                default: System.out.println("Sai lựa chọn.");
            }
        }
    }
}
