package part14.oop.midterm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager implements IManager<Product>, ISort, ISortPrice {
    private ArrayList<Product> products = new ArrayList<>();

    @Override
    public void add(Product p) {
        products.add(p);
    }

    @Override
    public Product search(int id) {
        for (Product p : products)
            if (p.getId() == id) return p;
        return null;
    }

    @Override
    public void remove(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    @Override
    public ArrayList<Product> search(String name) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product p : products)
            if (p.getName().equalsIgnoreCase(name)) result.add(p);
        return result;
    }

    @Override
    public ArrayList<Product> getAll() {
        return products;
    }

    @Override
    public void displayAll() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng.");
            return;
        }
        for (Product p : products)
            System.out.println(p);
    }

    @Override
    public void sortById() {
        Collections.sort(products, Comparator.comparing(Product::getId));
    }

    @Override
    public void sortById(boolean reverse) {
        if (reverse)
            products.sort((a, b) -> b.getId() - a.getId());
        else
            sortById();
    }

    @Override
    public void sortByPrice() {
        Collections.sort(products, Comparator.comparingLong(Product::priceForSale));
    }

    @Override
    public void sortByPrice(boolean reverse) {
        if (reverse)
            products.sort((a, b) -> Long.compare(b.priceForSale(), a.priceForSale()));
        else
            sortByPrice();
    }
}
