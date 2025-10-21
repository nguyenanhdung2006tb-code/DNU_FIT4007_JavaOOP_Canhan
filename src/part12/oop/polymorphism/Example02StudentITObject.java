package part12.oop.polymorphism;

public class Example02StudentITObject {
    public static void main(String[] args) {
        StudentIT s1 = new StudentIT();
        s1.input();

        System.out.println("\n🔹 Thông tin sinh viên IT:");
        System.out.println(s1);

        System.out.println("\n🔹 Tạo bản sao sinh viên IT:");
        StudentIT s2 = s1.copyObject();
        System.out.println(s2);

        System.out.println("\n2 sinh viên có giống nhau không? " + s1.equals(s2));
    }
}
