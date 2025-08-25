package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductServiceImpl manager = new ProductServiceImpl();
        ArrayList<Product> list = new ArrayList<>();
        manager.setProducts(list);
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();

        // fake data
        Product sp1 = new ElectronicProduct("001", "NAME1", 5.4, 6,"Electronics", new Manufacture("01", "name1", "address1", "email1"));
        Product sp2 = new FoodProduct("002", "NAME2", 7, 10, "Food",new Manufacture("02", "name2", "address2", "email2"));
        Product sp3 = new ClothingProduct("003", "NAME3", 5, 20,"Clothing" ,new Manufacture("03", "name3", "address3", "email3"));

        do{
            System.out.println("1.Them san pham");
            System.out.println("2.Sua san pham theo id");
            System.out.println("3.Xoa san pham theo ten");
            System.out.println("4.Tim san pham theo ten");
            System.out.println("5.In danh dach");
            System.out.println("6.Sap xep gia tang dan");
            System.out.println("7.Sap xep gia giam dan");
            System.out.println("0.Thoat");
            System.out.println("CHON: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    System.out.println("Nhap so san pham:");
                    int n = sc.nextInt();
                    for(int i = 0; i < n; i++){
                        Product sp = null;
                        manager.addProduct(sp);
                    }
                    break;
                case 2: break;

            }


        }
        while(chon!= 0);
    }
}
