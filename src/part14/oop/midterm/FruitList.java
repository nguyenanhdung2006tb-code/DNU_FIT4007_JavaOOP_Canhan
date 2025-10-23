package part14.oop.midterm;

import java.util.ArrayList;

public class FruitList {
    private ArrayList<Fruit> list = new ArrayList<>();

    public void addFruit(Fruit f) {
        list.add(f);
    }

    public void displayAll() {
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng.");
            return;
        }
        for (Fruit f : list) {
            System.out.println(f);
        }
    }

    public void displayHighPriceFruits() {
        boolean found = false;
        for (Fruit f : list) {
            if (f.priceForSale() > 20) {
                System.out.println(f);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có trái cây nào có giá bán > 20.");
        }
    }

    public int countFruits() {
        return list.size();
    }
}
