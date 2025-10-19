package part9.oop.methods;

public class Game {
    private int id;
    private Player player1;
    private Player player2;

    // Constructor mặc định
    public Game() {
    }

    // Constructor có tham số
    public Game(int id, Player player1, Player player2) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    // Lấy người thắng
    public Player getWinner() {
        boolean p1Wins = player1.isWinner();
        boolean p2Wins = player2.isWinner();

        if (p1Wins) return player1;
        if (p2Wins) return player2;
        return null;
    }

    // Reset game: set điểm 2 người chơi về 0
    public void resetGame() {
        player1.setScore(0);
        player2.setScore(0);
    }

    // Hoán đổi 2 người chơi
    public void swapPlayers() {
        Player temp = player1;
        player1 = player2;
        player2 = temp;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", player1=" + player1 +
                ", player2=" + player2 +
                '}';
    }
}
