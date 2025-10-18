package part8.oop.constructor;

public class Example10GameManagement {
    public static void main(String[] args) {
        // Tạo 2 người chơi (tái sử dụng class Player từ ví dụ 9)
        Player p1 = new Player("Ronaldo", 39, 10, 5);
        Player p2 = new Player("Messi", 37, 12, 7);

        // Tạo một trò chơi bằng constructor có tham số
        Game game1 = new Game(1, p1, p2);

        // In thông tin game
        System.out.println(game1);
    }
}
