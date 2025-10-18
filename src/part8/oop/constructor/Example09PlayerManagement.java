package part8.oop.constructor;

public class Example09PlayerManagement {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor mặc định
        Player p1 = new Player();
        p1.setName("Ronaldo");
        p1.setAge(39);
        p1.setPositionX(10);
        p1.setPositionY(5);

        // Tạo đối tượng bằng constructor có tham số
        Player p2 = new Player("Messi", 37, 12, 7);

        // In ra thông tin người chơi
        System.out.println(p1);
        System.out.println(p2);
    }
}
