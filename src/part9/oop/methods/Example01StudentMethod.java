package part9.oop.methods;

public class Example01StudentMethod {
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyen Van B", 20);

        System.out.println("Thông tin sinh viên: " + s1);
        System.out.println("Năm sinh: " + s1.getYearOfBirth());
        System.out.println("Tên viết in hoa: " + s1.getUpperName());
    }
}
