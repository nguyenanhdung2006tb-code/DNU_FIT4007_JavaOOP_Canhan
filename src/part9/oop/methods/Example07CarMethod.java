package part9.oop.methods;

public class Example07CarMethod {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Toyota Camry", 5, 2020);
        Car car2 = new Car("Black", "Ford Ranger", 4, 2018);
        Car car3 = new Car("Blue", "Kia Morning", 4, 2024);

        System.out.println("=== Thông tin xe ===");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println("\n=== Tuổi của xe ===");
        System.out.println(car1.getName() + " có tuổi thọ: " + car1.getAge() + " năm");
        System.out.println(car2.getName() + " có tuổi thọ: " + car2.getAge() + " năm");
        System.out.println(car3.getName() + " có tuổi thọ: " + car3.getAge() + " năm");
    }
}
