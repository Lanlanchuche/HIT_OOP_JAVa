package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService {
    ArrayList<Product> products;

    public ProductServiceImpl() {
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public void addProduct(Product p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Electronic product");
        System.out.println("2.Food product");
        System.out.println("3.Clothing product");
        System.out.println("CHON:");
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                p = new ElectronicProduct();
                p.input();
                break;
            case 2:
                p = new FoodProduct();
                p.input();
                break;
            case 3:
                p = new ClothingProduct();
                p.input();
                break;


        }

        products.add(p);
    }

    @Override
    public void updateProduct(String id, Product newInfo) {

    }

    @Override
    public void deleteProduct(String id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id muon xoa:");
        String id1 = sc.nextLine();
        boolean found = false;
        int mark = -1;
        for (Product p : products) {
            if (p.getId().equals(id1)) {
                found = true;
                mark = products.indexOf(p);
            }
        }
        if(found){
            products.remove(mark);
        }
    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public void sortByPriceAsc() {

    }

    @Override
    public void sortByPriceDesc() {

    }

    @Override
    public void printProducts() {


    }
}
