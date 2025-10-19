package part9.oop.methods;

public class Example06AnimalMethod {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog", "Brown", 3);
        Animal cat = new Animal("Cat", "White", 2);
        Animal fox = new Animal("Fox", "Brown", 4);

        System.out.println("=== Thông tin động vật ===");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(fox);

        System.out.println("\n=== Kiểm tra năm sinh ===");
        System.out.println(dog.getName() + " sinh năm: " + dog.getYearOfBirth());
        System.out.println(cat.getName() + " sinh năm: " + cat.getYearOfBirth());
        System.out.println(fox.getName() + " sinh năm: " + fox.getYearOfBirth());

        System.out.println("\n=== So sánh màu sắc ===");
        System.out.println(dog.getName() + " và " + cat.getName() + " cùng màu: " + dog.equalsColor(cat));
        System.out.println(dog.getName() + " và " + fox.getName() + " cùng màu: " + dog.equalsColor(fox));

        System.out.println("\n=== Tăng tuổi ===");
        System.out.println("Trước khi tăng: " + dog);
        dog.increaseAge();
        System.out.println("Sau khi tăng: " + dog);
    }
}
