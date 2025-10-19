package part9.oop.methods;

public class Example09PlayerMethod {
    public static void main(String[] args) {
        Player p1 = new Player("Alice", 20, 95, 0, 0);
        Player p2 = new Player("Bob", 22, 50, 5, 5);

        System.out.println("=== Thông tin người chơi ===");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\n=== Thao tác điểm số ===");
        p1.increaseScore();
        p2.increaseScore(30);
        System.out.println(p1.getName() + " sau khi tăng: " + p1.getScore());
        System.out.println(p2.getName() + " sau khi tăng: " + p2.getScore());

        p2.decreaseScore(10);
        System.out.println(p2.getName() + " sau khi giảm: " + p2.getScore());

        System.out.println("\n=== Kiểm tra thắng ===");
        System.out.println(p1.getName() + " thắng: " + p1.isWinner());
        System.out.println(p2.getName() + " thắng: " + p2.isWinner());
    }
}
