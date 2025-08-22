package baitaptrenlop.bai3_3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Dien tich hinh tron la: " + circle.area());
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Dien tich hinh chu nhat la: " + rectangle.area());
    }
}
