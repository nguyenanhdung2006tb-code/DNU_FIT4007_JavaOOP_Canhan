package part9.oop.methods;

public class Example10GameMethod {
    public static void main(String[] args) {
        Player p1 = new Player("Alice", 20, 105, 0, 0);
        Player p2 = new Player("Bob", 22, 95, 5, 5);

        Game game = new Game(1, p1, p2);

        System.out.println("=== Trạng thái game ban đầu ===");
        System.out.println(game);

        System.out.println("\n=== Người thắng ===");
        Player winner = game.getWinner();
        System.out.println(winner != null ? winner.getName() : "Chưa có người thắng");

        System.out.println("\n=== Reset game ===");
        game.resetGame();
        System.out.println(game);

        System.out.println("\n=== Hoán đổi người chơi ===");
        game.swapPlayers();
        System.out.println(game);
    }
}
