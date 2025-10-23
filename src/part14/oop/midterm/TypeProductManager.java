package part14.oop.midterm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TypeProductManager implements IManager<TypeProduct>, ISort {
    private ArrayList<TypeProduct> typeProducts = new ArrayList<>();

    @Override
    public void add(TypeProduct t) {
        typeProducts.add(t);
    }

    @Override
    public TypeProduct search(int id) {
        for (TypeProduct tp : typeProducts)
            if (tp.getId() == id) return tp;
        return null;
    }

    @Override
    public void remove(int id) {
        typeProducts.removeIf(tp -> tp.getId() == id);
    }

    @Override
    public ArrayList<TypeProduct> search(String name) {
        ArrayList<TypeProduct> result = new ArrayList<>();
        for (TypeProduct tp : typeProducts)
            if (tp.getName().equalsIgnoreCase(name)) result.add(tp);
        return result;
    }

    @Override
    public ArrayList<TypeProduct> getAll() {
        return typeProducts;
    }

    @Override
    public void displayAll() {
        if (typeProducts.isEmpty()) {
            System.out.println("Danh sách loại sản phẩm rỗng.");
            return;
        }
        for (TypeProduct tp : typeProducts)
            System.out.println(tp);
    }

    @Override
    public void sortById() {
        Collections.sort(typeProducts, Comparator.comparing(TypeProduct::getId));
    }

    @Override
    public void sortById(boolean reverse) {
        if (reverse)
            typeProducts.sort((a, b) -> b.getId() - a.getId());
        else
            sortById();
    }
}
