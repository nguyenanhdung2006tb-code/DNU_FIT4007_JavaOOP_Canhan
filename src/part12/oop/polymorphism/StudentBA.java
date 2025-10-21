package part12.oop.polymorphism;

import java.util.Scanner;

public class StudentBA extends Student {
    private float scorePM;
    private float scoreBA;

    public StudentBA() {}

    public StudentBA(String studentID, String name, int age, float scorePM, float scoreBA) {
        super(studentID, name, age);
        this.scorePM = validateScore(scorePM);
        this.scoreBA = validateScore(scoreBA);
    }

    public float getScorePM() {
        return scorePM;
    }

    public void setScorePM(float scorePM) {
        this.scorePM = validateScore(scorePM);
    }

    public float getScoreBA() {
        return scoreBA;
    }

    public void setScoreBA(float scoreBA) {
        this.scoreBA = validateScore(scoreBA);
    }

    private float validateScore(float score) {
        return (score >= 0 && score <= 10) ? score : 0;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Project Management score (0-10): ");
        this.scorePM = validateScore(sc.nextFloat());
        System.out.print("Enter Business Analysis score (0-10): ");
        this.scoreBA = validateScore(sc.nextFloat());
    }

    public float calculateAverage() {
        return (scorePM + scoreBA) / 2;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", Project Management=%.2f, Business Analysis=%.2f, Average=%.2f",
                        scorePM, scoreBA, calculateAverage());
    }

    @Override
    public StudentBA copyObject() {
        return new StudentBA(getStudentID(), getName(), getAge(), scorePM, scoreBA);
    }
}
