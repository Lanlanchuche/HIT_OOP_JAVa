package baitapvenha.bai2;

import java.util.Scanner;

public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public May() {
    }

    public May(String maMay, String tenMay, String tinhTrang) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.tinhTrang = tinhTrang;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "Ma may: "+ maMay +
                ", ten may: " + tenMay +
                ", tinhTrang: " + tinhTrang ;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma may:");
        maMay = sc.nextLine();
        System.out.println("Nhap ten may:");
        tenMay = sc.nextLine();
        System.out.println("Nhap tinh trang:");
        tinhTrang = sc.nextLine();
    }
    public void Xuat(){
        System.out.println(toString());
    }

}
