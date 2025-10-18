package part8.oop.constructor;

public class Example01StudentManagement {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor mặc định
        Student s1 = new Student();
        s1.setMasv("SV001");
        s1.setName("Nguyen Van A");
        s1.setAge(20);

        // Tạo đối tượng bằng constructor có tham số
        Student s2 = new Student("SV002", "Tran Thi B", 21);

        // In thông tin sinh viên
        System.out.println(s1);
        System.out.println(s2);
    }
}
