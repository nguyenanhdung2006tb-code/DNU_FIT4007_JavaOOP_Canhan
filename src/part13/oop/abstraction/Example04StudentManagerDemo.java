package part13.oop.abstraction;

public class Example04StudentManagerDemo {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Thêm sinh viên IT và BA
        Student s1 = new StudentIT("SV01", "Nguyen Van A", 20, 8.5f, 9.0f);
        Student s2 = new StudentBA("SV02", "Tran Thi B", 21, 7.0f, 8.0f);

        manager.addStudent(s1);
        manager.addStudent(s2);

        // Hiển thị danh sách
        manager.displayAllStudents();

        // Sắp xếp theo điểm trung bình
        manager.sortByScore();
        manager.displayAllStudents();

        // Tìm sinh viên theo mã
        Student found = manager.findStudent("SV01");
        if (found != null) {
            System.out.println("Tìm thấy sinh viên: " + found);
        }

        // Xóa sinh viên
        manager.removeStudent("SV02");
        manager.displayAllStudents();
    }
}
