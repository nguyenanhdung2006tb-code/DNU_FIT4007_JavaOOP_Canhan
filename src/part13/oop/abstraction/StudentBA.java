package part13.oop.abstraction;

import java.util.Scanner;

public class StudentBA extends Student {
    private float scorePm;
    private float scoreBA;

    public StudentBA() {
    }

    public StudentBA(String masv, String name, int age, float scorePm, float scoreBA) {
        super(masv, name, age);
        this.scorePm = scorePm;
        this.scoreBA = scoreBA;
    }

    public float getScorePm() {
        return scorePm;
    }

    public void setScorePm(float scorePm) {
        this.scorePm = scorePm;
    }

    public float getScoreBA() {
        return scoreBA;
    }

    public void setScoreBA(float scoreBA) {
        this.scoreBA = scoreBA;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm Quản lý dự án: ");
        scorePm = sc.nextFloat();
        System.out.print("Nhập điểm Quản trị kinh doanh: ");
        scoreBA = sc.nextFloat();
    }

    @Override
    public float calculateAverage() {
        return (scorePm + scoreBA) / 2;
    }

    @Override
    public String toString() {
        return "StudentBA{" +
                "masv='" + masv + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", scorePm=" + scorePm +
                ", scoreBA=" + scoreBA +
                ", average=" + calculateAverage() +
                '}';
    }
}
