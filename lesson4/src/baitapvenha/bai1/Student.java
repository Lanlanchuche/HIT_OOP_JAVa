package baitapvenha.bai1;

import java.util.Scanner;

public class Student {
    private String ten;
    private int namSinh;
    private String diaChi;
    private double tx1, tx2, kthp;
    private int soTietNghi;

    public Student() {
    }

    public Student(String ten, int namSinh, double tx1, String diaChi, double tx2, double kthp, int soTietNghi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.tx1 = tx1;
        this.diaChi = diaChi;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.soTietNghi = soTietNghi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTx2() {
        return tx2;
    }

    public void setTx2(double tx2) {
        this.tx2 = tx2;
    }

    public double getKthp() {
        return kthp;
    }

    public void setKthp(double kthp) {
        this.kthp = kthp;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public void setSoTietNghi(int soTietNghi) {
        this.soTietNghi = soTietNghi;
    }

    public double getTx1() {
        return tx1;
    }

    public void setTx1(double tx1) {
        this.tx1 = tx1;
    }

    public int tuoi(){
        return 2025 - namSinh;
    }
    public double diemGPA(){
        return tx1*0.2 + tx2*0.3 + kthp*0.5;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten:");
        ten = sc.nextLine();
        System.out.print("Nhap nam sinh:");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap dia chi:");
        diaChi = sc.nextLine();
        System.out.print("Nhap tx1:");
        tx1 = sc.nextDouble();
        System.out.print("Nhap tx2:");
        tx2 = sc.nextDouble();
        System.out.print("Nhap kthp:");
        kthp = sc.nextDouble();
        System.out.print("Nhap so tiet nghi:");
        soTietNghi = sc.nextInt();
    }
    public void xuat(){

        System.out.printf("%-15s %-15d %-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15d %n", ten, tuoi(), diaChi, tx1, tx2, kthp, diemGPA(),soTietNghi);
    }

}
