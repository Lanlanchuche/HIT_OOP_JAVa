package baitapvenha;

import java.util.Scanner;
public class Bai3_1 {
    public static final String SQUARE = "square";
    public static final String TRIANGLE = "triangle";
    public static final String CIRCLE = "circle";
    public static final double PI = 3.1415;

    private String square;
    private String triangle;
    private String circle;

    public Bai3_1() {
        this(Bai3_1.SQUARE, Bai3_1.TRIANGLE, Bai3_1.CIRCLE);
    }
    public Bai3_1(String square, String triangle, String circle) {
        this.square = square;
        this.triangle = triangle;
        this.circle = circle;
    }

    public String getSquare() {
        return square;
    }
    public void setSquare(String square) {
        this.square = square;
    }
    public String getTriangle() {
        return triangle;
    }
    public void setTriangle(String triangle) {
        this.triangle = triangle;
    }
    public String getCircle() {
        return circle;
    }
    public void setCircle(String circle) {
        this.circle = circle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai3_1 b = new Bai3_1();
        System.out.print("Nhap hinh dang muon tinh: ");
        String hinh  = sc.nextLine();
        if (hinh.equalsIgnoreCase(b.getSquare())) {
            System.out.print("Nhap canh hinh vuong: ");
            double canh = sc.nextDouble();
            double dt1 = canh*canh;
            System.out.println("Dien tich hinh vuong la: " + dt1);
        }else if (hinh.equalsIgnoreCase(b.getTriangle())) {
            System.out.print("Nhap canh day tam giac: ");
            double d = sc.nextDouble();
            System.out.print("Nhap chieu cao tam giac: ");
            double h = sc.nextDouble();
            double dt2 = 0.5*d*h;
            System.out.println("Dien tich hinh tam giac la: " + dt2);
        }
        else if (hinh.equalsIgnoreCase(b.getCircle())) {
            System.out.print("Nhap ban kinh: ");
            double r = sc.nextDouble();
            double dt3 = PI*r*r;
            System.out.println("Dien tich hinh tron la: " + dt3);
        }
    }
}
