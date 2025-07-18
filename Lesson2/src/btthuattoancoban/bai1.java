package btthuattoancoban;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bai1 {
    public static final double PI = 3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        double r = sc.nextDouble();
        double perimeter = 2*PI*r;
        double area = PI*r*r;
        System.out.printf("Chu vi hinh tron: %.3f\n", perimeter );
        System.out.printf("Dien tich hinh tron la: %.3f\n", area);
    }
}
