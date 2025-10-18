package part8.oop.constructor;

public class Example07CarManagement {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor mặc định
        Car c1 = new Car();
        c1.setColor("Red");
        c1.setName("Toyota Vios");
        c1.setSeatingCapacity(5);
        c1.setYear(2022);

        // Tạo đối tượng bằng constructor có tham số
        Car c2 = new Car("Black", "Honda Civic", 4, 2023);

        // In thông tin xe
        System.out.println(c1);
        System.out.println(c2);
    }
}
