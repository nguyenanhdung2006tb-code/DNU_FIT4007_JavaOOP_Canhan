package part12.oop.polymorphism;

import java.util.Scanner;

public class Menu {
    private StudentManager manager;
    private Scanner sc = new Scanner(System.in);

    public Menu() {
        manager = new StudentManager();
    }

    public int choiceMenu() {
        System.out.println("===== MENU QUẢN LÝ SINH VIÊN =====");
        System.out.println("1. Nhập thông tin sinh viên");
        System.out.println("2. Xem danh sách sinh viên");
        System.out.println("3. Tìm kiếm sinh viên theo mã sinh viên");
        System.out.println("4. Xoá sinh viên theo mã sinh viên");
        System.out.println("5. Cập nhật sinh viên");
        System.out.println("6. Sắp xếp sinh viên");
        System.out.println("7. Thoát");
        System.out.print("Chọn chức năng: ");
        return Integer.parseInt(sc.nextLine());
    }

    public void run() {
        int choice;
        do {
            choice = choiceMenu();
            switch (choice) {
                case 1 -> inputStudents();
                case 2 -> manager.showStudents();
                case 3 -> searchStudent();
                case 4 -> deleteStudent();
                case 5 -> updateStudent();
                case 6 -> sortMenu();
                case 7 -> System.out.println("Kết thúc chương trình!");
                default -> System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        } while (choice != 7);
    }

    private void inputStudents() {
        System.out.println("1. Nhập sinh viên IT");
        System.out.println("2. Nhập sinh viên BA");
        System.out.print("Chọn loại sinh viên: ");
        int type = Integer.parseInt(sc.nextLine());

        Student s = null;
        if (type == 1) {
            s = new StudentIT();
        } else if (type == 2) {
            s = new StudentBA();
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
            return;
        }

        s.input();
        manager.addStudent(s);
        System.out.println("Thêm sinh viên thành công!");
    }

    private void searchStudent() {
        System.out.print("Nhập mã sinh viên cần tìm: ");
        String id = sc.nextLine();
        Student s = manager.searchStudent(id);
        if (s != null) {
            System.out.println("Tìm thấy sinh viên:");
            System.out.println(s);
        } else {
            System.out.println("Không tìm thấy sinh viên có mã " + id);
        }
    }

    private void deleteStudent() {
        System.out.print("Nhập mã sinh viên cần xoá: ");
        String id = sc.nextLine();

        Student s = manager.searchStudent(id);
        if (s == null) {
            System.out.println("Không tìm thấy sinh viên có mã " + id);
            return;
        }

        manager.deleteStudent(s);
        System.out.println("Xoá thành công!");
    }


    private void updateStudent() {
        System.out.print("Nhập mã sinh viên cần cập nhật: ");
        String id = sc.nextLine();
        Student old = manager.searchStudent(id);
        if (old == null) {
            System.out.println("Không tìm thấy sinh viên có mã " + id);
            return;
        }

        System.out.println("Nhập thông tin mới:");
        Student updated;
        if (old instanceof StudentIT) {
            updated = new StudentIT();
        } else {
            updated = new StudentBA();
        }
        updated.input();

        manager.updateStudent(id, updated);
        System.out.println("Cập nhật thành công!");
    }

    private void sortMenu() {
        System.out.println("1. Sắp xếp theo điểm trung bình");
        System.out.println("2. Sắp xếp theo tuổi");
        System.out.println("3. Sắp xếp theo mã sinh viên");
        System.out.println("4. Sắp xếp theo ngành học");
        System.out.print("Chọn kiểu sắp xếp: ");
        int type = Integer.parseInt(sc.nextLine());

        switch (type) {
            case 1 -> manager.sortByScore();
            case 2 -> manager.sortByAge();
            case 3 -> manager.sortByID();
            case 4 -> manager.sortByType();
            default -> System.out.println("Lựa chọn không hợp lệ!");
        }
    }
}
