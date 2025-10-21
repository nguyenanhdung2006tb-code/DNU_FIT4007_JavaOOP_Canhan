package part12.oop.polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // === Thêm sinh viên ===
    public void addStudent(Student s) {
        if (s != null && searchStudent(s.getStudentID()) == null) {
            students.add(s);
        } else {
            System.out.println("Student already exists or invalid!");
        }
    }

    public void addStudent(ArrayList<Student> sList) {
        for (Student s : sList) {
            addStudent(s);
        }
    }

    // === Hiển thị danh sách sinh viên ===
    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // === Xóa sinh viên ===
    public void deleteStudent(Student s) {
        students.remove(s);
    }

    public void deleteStudent(String studentID) {
        students.removeIf(s -> s.getStudentID().equalsIgnoreCase(studentID));
    }

    // === Cập nhật sinh viên ===
    public void updateStudent(Student s) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(s)) {
                students.set(i, s);
                return;
            }
        }
    }

    public void updateStudent(String studentID, Student newStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID().equalsIgnoreCase(studentID)) {
                students.set(i, newStudent);
                return;
            }
        }
    }

    // === Tìm kiếm sinh viên ===
    public Student searchStudent(String studentID) {
        for (Student s : students) {
            if (s.getStudentID().equalsIgnoreCase(studentID)) {
                return s;
            }
        }
        return null;
    }

    public boolean searchStudent(Student s) {
        return students.contains(s);
    }

    // === Sắp xếp sinh viên ===
    public void sortByScore() {
        Collections.sort(students, Comparator.comparingDouble(s -> {
            if (s instanceof StudentIT) {
                return ((StudentIT) s).calculateAverage();
            } else if (s instanceof StudentBA) {
                return ((StudentBA) s).calculateAverage();
            } else {
                return 0.0;
            }
        }));
    }

    public void sortByAge() {
        students.sort(Comparator.comparingInt(Student::getAge));
    }

    public void sortByID() {
        students.sort(Comparator.comparing(Student::getStudentID));
    }

    public void sortByType() {
        students.sort((a, b) -> {
            if (a instanceof StudentIT && b instanceof StudentBA) return -1;
            if (a instanceof StudentBA && b instanceof StudentIT) return 1;
            return 0;
        });
    }
}
