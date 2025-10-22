package part13.oop.abstraction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager implements IManager {
    private ArrayList<Student> students;

    // Constructor mặc định
    public StudentManager() {
        this.students = new ArrayList<>();
    }

    // Constructor có tham số
    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    // Getter và Setter
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // Triển khai các phương thức trong interface IManager

    @Override
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Đã thêm sinh viên: " + student.getName());
    }

    @Override
    public void editStudent(String masv, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMasv().equalsIgnoreCase(masv)) {
                students.set(i, updatedStudent);
                System.out.println("Đã cập nhật thông tin sinh viên có mã: " + masv);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có mã: " + masv);
    }

    @Override
    public void removeStudent(String masv) {
        students.removeIf(s -> s.getMasv().equalsIgnoreCase(masv));
        System.out.println("Đã xóa sinh viên có mã: " + masv);
    }

    @Override
    public Student findStudent(String masv) {
        for (Student s : students) {
            if (s.getMasv().equalsIgnoreCase(masv)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> findStudent(int age) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getAge() == age) {
                result.add(s);
            }
        }
        return result;
    }

    @Override
    public void sortByAge() {
        Collections.sort(students, Comparator.comparingInt(Student::getAge));
        System.out.println("Đã sắp xếp danh sách theo tuổi tăng dần.");
    }

    @Override
    public void sortByScore() {
        Collections.sort(students, Comparator.comparingDouble(Student::calculateAverage));
        System.out.println("Đã sắp xếp danh sách theo điểm trung bình tăng dần.");
    }

    @Override
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            System.out.println("Danh sách sinh viên:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
