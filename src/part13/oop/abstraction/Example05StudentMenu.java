package part13.oop.abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Example05StudentMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("========== MENU QUẢN LÝ SINH VIÊN ==========");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Sắp xếp sinh viên");
            System.out.println("6. Chỉnh sửa thông tin sinh viên");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    manager.displayAllStudents();
                    break;

                case 2:
                    System.out.println("2. Thêm sinh viên");
                    System.out.println("1. Thêm sinh viên IT");
                    System.out.println("2. Thêm sinh viên BA");
                    System.out.print("Chọn loại sinh viên: ");
                    int type = Integer.parseInt(sc.nextLine());

                    if (type == 1) {
                        StudentIT sIT = new StudentIT();
                        sIT.input();
                        manager.addStudent(sIT);
                    } else if (type == 2) {
                        StudentBA sBA = new StudentBA();
                        sBA.input();
                        manager.addStudent(sBA);
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    break;

                case 3:
                    System.out.println("3. Tìm kiếm sinh viên");
                    System.out.println("1. Tìm theo mã sinh viên");
                    System.out.println("2. Tìm theo tuổi");
                    System.out.print("Chọn loại tìm kiếm: ");
                    int findChoice = Integer.parseInt(sc.nextLine());

                    if (findChoice == 1) {
                        System.out.print("Nhập mã sinh viên: ");
                        String masv = sc.nextLine();
                        Student s = manager.findStudent(masv);
                        if (s != null) {
                            System.out.println("Kết quả tìm thấy: " + s);
                        } else {
                            System.out.println("Không tìm thấy sinh viên có mã: " + masv);
                        }
                    } else if (findChoice == 2) {
                        System.out.print("Nhập tuổi cần tìm: ");
                        int age = Integer.parseInt(sc.nextLine());
                        ArrayList<Student> found = manager.findStudent(age);
                        if (found.isEmpty()) {
                            System.out.println("Không có sinh viên nào có tuổi " + age);
                        } else {
                            System.out.println("Danh sách sinh viên có tuổi " + age + ":");
                            for (Student s : found) {
                                System.out.println(s);
                            }
                        }
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    break;

                case 4:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String masvRemove = sc.nextLine();
                    manager.removeStudent(masvRemove);
                    break;

                case 5:
                    System.out.println("5. Sắp xếp sinh viên");
                    System.out.println("1. Theo tuổi");
                    System.out.println("2. Theo điểm trung bình");
                    System.out.print("Chọn cách sắp xếp: ");
                    int sortChoice = Integer.parseInt(sc.nextLine());

                    if (sortChoice == 1) {
                        manager.sortByAge();
                    } else if (sortChoice == 2) {
                        manager.sortByScore();
                    } else {
                        System.out.println("Lựa chọn không hợp lệ!");
                    }
                    break;

                case 6:
                    System.out.print("Nhập mã sinh viên cần sửa: ");
                    String masvEdit = sc.nextLine();
                    System.out.println("Chọn loại sinh viên để cập nhật:");
                    System.out.println("1. Sinh viên IT");
                    System.out.println("2. Sinh viên BA");
                    int editType = Integer.parseInt(sc.nextLine());

                    Student updatedStudent = null;
                    if (editType == 1) {
                        updatedStudent = new StudentIT();
                    } else if (editType == 2) {
                        updatedStudent = new StudentBA();
                    }

                    if (updatedStudent != null) {
                        updatedStudent.input();
                        manager.editStudent(masvEdit, updatedStudent);
                    }
                    break;

                case 7:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại!");
            }

            System.out.println();
        } while (choice != 7);

        sc.close();
    }
}
