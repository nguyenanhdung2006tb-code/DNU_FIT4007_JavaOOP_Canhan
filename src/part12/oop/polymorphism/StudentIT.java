package part12.oop.polymorphism;

import java.util.Scanner;

public class StudentIT extends Student {
    private float scoreCPP;
    private float scoreJava;

    // Constructor mặc định
    public StudentIT() {
        super();
        this.scoreCPP = 0;
        this.scoreJava = 0;
    }

    // Constructor đầy đủ
    public StudentIT(String studentID, String name, int age, float scoreCPP, float scoreJava) {
        super(studentID, name, age);
        setScoreCPP(scoreCPP);
        setScoreJava(scoreJava);
    }

    // Getter & Setter
    public float getScoreCPP() {
        return scoreCPP;
    }

    public void setScoreCPP(float scoreCPP) {
        this.scoreCPP = (scoreCPP >= 0 && scoreCPP <= 10) ? scoreCPP : 0;
    }

    public float getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(float scoreJava) {
        this.scoreJava = (scoreJava >= 0 && scoreJava <= 10) ? scoreJava : 0;
    }

    // Ghi đè input()
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input(); // gọi lại input() của lớp cha

        System.out.print("Nhập điểm C++ (0-10): ");
        setScoreCPP(sc.nextFloat());

        System.out.print("Nhập điểm Java (0-10): ");
        setScoreJava(sc.nextFloat());
    }

    // Ghi đè toString()
    @Override
    public String toString() {
        return super.toString() +
                String.format(", C++: %.2f, Java: %.2f, Avg: %.2f",
                        scoreCPP, scoreJava, calculateAverage());
    }

    // Ghi đè copyObject()
    @Override
    public StudentIT copyObject() {
        return new StudentIT(getStudentID(), getName(), getAge(), scoreCPP, scoreJava);
    }

    // Tính điểm trung bình
    public float calculateAverage() {
        return (scoreCPP + scoreJava) / 2;
    }
}
