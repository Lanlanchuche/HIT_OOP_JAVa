package baitapvenha.bai2;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;

    public QuanLy() {
    }

    public QuanLy(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    @Override
    public String toString() {
        return "Ma quan ly: " + maQL + ", ho ten: " + hoTen ;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma quan ly: ");
        maQL = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();

    }
    public void Xuat(){
        System.out.println(toString());
    }
}
