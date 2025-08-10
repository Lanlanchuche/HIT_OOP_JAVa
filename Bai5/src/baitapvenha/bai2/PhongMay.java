package baitapvenha.bai2;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private May may;
    private QuanLy quanLy;

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, double dienTich, May may, QuanLy quanLy) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.may = may;
        this.quanLy = quanLy;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public May getMay() {
        return may;
    }

    public void setMay(May may) {
        this.may = may;
    }

    public QuanLy getQuanLy() {
        return quanLy;
    }

    public void setQuanLy(QuanLy quanLy) {
        this.quanLy = quanLy;
    }

    @Override
    public String toString() {
        return "Ma Phong: " + maPhong +
                ", Ten Phong: " + tenPhong +
                ", dien tich: " + dienTich + may + quanLy ;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.println("Nhap ten phong: ");
        tenPhong = sc.nextLine();
        System.out.println("Nhap dien tich: ");
        dienTich = sc.nextDouble();
        System.out.println("Nhap may: ");
        may = new May();
        may.Nhap();
        System.out.println("Nhap quan ly: ");
        quanLy = new QuanLy();
        quanLy.Nhap();
    }
    public void Xuat(){
        System.out.println(toString());
    }
}
