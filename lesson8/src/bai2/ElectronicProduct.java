package bai2;

import java.util.Scanner;

public class ElectronicProduct extends Product{
    public ElectronicProduct() {
        super();
    }

    public ElectronicProduct(String id, String name, double price, int quantity, String category,  Manufacture manufacturer) {
        super(id, name, price, quantity, category, manufacturer);
    }

    @Override
    public double getDiscountPrice() {
        return 0.1*getPrice();
    }
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        setId(sc.nextLine());
        System.out.println("Name: ");
        setName(sc.nextLine());
        System.out.println("Price: ");
        setPrice(sc.nextDouble());
        System.out.println("Quantity: ");
        setQuantity(sc.nextInt());
        setCategory("Electronic");
        System.out.println("Manufacturer: ");
        Manufacture manufacturer = new Manufacture();
        System.out.println("ID manufacturer: ");
        manufacturer.setId(sc.nextLine());
        System.out.println("Name of manufacturer: ");
        manufacturer.setName(sc.nextLine());
        System.out.println("Address of manufacturer: ");
        manufacturer.setAddress(sc.nextLine());
        System.out.println("Email of manufacturer: ");
        manufacturer.setEmail(sc.nextLine());
        setManufacturer(manufacturer);





    }
}
