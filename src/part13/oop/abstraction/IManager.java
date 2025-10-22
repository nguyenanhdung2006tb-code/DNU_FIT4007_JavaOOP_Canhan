package part13.oop.abstraction;

import java.util.ArrayList;

public interface IManager {
    void addStudent(Student student);              // Thêm một sinh viên
    void editStudent(String masv, Student student); // Sửa thông tin sinh viên
    void removeStudent(String masv);               // Xóa sinh viên theo mã
    Student findStudent(String masv);              // Tìm theo mã sinh viên
    ArrayList<Student> findStudent(int age);       // Tìm sinh viên theo tuổi
    void sortByAge();                              // Sắp xếp theo tuổi tăng dần
    void sortByScore();                            // Sắp xếp theo điểm trung bình tăng dần
    void displayAllStudents();                     // Hiển thị danh sách sinh viên
}
