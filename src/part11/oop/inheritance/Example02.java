package part11.oop.inheritance;

public class Example02 {
    public static void main(String[] args) {
        System.out.println("=== Input Cat 1 ===");
        Cat cat1 = new Cat();
        cat1.input();

        System.out.println("=== Input Cat 2 ===");
        Cat cat2 = new Cat();
        cat2.input();

        System.out.println("\nCat 1: " + cat1);
        System.out.println("Cat 2: " + cat2);

        System.out.println("Year of birth of Cat 2: " + cat2.getYearOfBirth());
        System.out.println("Do Cat 1 and Cat 2 have the same breed? " + cat1.equalBreed(cat2));
    }
}
