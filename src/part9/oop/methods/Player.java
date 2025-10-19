package part9.oop.methods;

public class Player {
    private String name;
    private int age;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor mặc định
    public Player() {
    }

    // Constructor có tham số
    public Player(String name, int age, int score, int positionX, int positionY) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Tăng/giảm điểm số
    public void increaseScore() {
        score++;
    }

    public void decreaseScore() {
        score--;
    }

    public void increaseScore(int n) {
        score += n;
    }

    public void decreaseScore(int n) {
        score -= n;
    }

    // Kiểm tra thắng: score >= 100
    public boolean isWinner() {
        return score >= 100;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }
}
