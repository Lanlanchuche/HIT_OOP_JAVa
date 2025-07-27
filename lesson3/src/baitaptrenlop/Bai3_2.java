package baitaptrenlop;

import java.util.Scanner;

public class Bai3_2 {
    public static final double PI = 3.14159265;
    public static double ChuVi(double r){
        return 2*PI*r;
    }
    public static double DienTich(double r){
        return 2*PI*Math.pow(r,2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        double r = sc.nextDouble();
        System.out.print("Nhap so mu: ");
        int k = sc.nextInt();
        System.out.println("Chu vi hinh tron la: " + ChuVi(r));
        System.out.println("Dien tich hinh tron la: " + DienTich(r));
        System.out.println("Can bac 2 cua (r + k) la: " + Math.sqrt(r+k));
        System.out.println("Gia tri tuyet doi cua (r - k) la: " + Math.abs(r-k));

    }
}
