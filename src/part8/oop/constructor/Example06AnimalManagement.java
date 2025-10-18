package part8.oop.constructor;

public class Example06AnimalManagement {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor mặc định
        Animal a1 = new Animal();
        a1.setName("Dog");
        a1.setColor("Brown");
        a1.setAge(3);

        // Tạo đối tượng bằng constructor có tham số
        Animal a2 = new Animal("Cat", "White", 2);

        // In thông tin động vật
        System.out.println(a1);
        System.out.println(a2);
    }
}
