package baitaptrenlop.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

    public void themNhanVien(NhanVien nv){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon loai nhan vien:");
        System.out.println("1.NHAN VIEN FULL TIME");
        System.out.println("2.NHAN VIEN PART TIME");
        int chon = sc.nextInt();
        if (chon == 1){
            nv = new NhanVienFullTime();
            sc.nextLine();
            System.out.println("Ma nhan vien: ");
            nv.setMaNV(sc.nextLine());
            System.out.println("Ten nhan vien: ");
            nv.setTen(sc.nextLine());
            System.out.println("Email: ");
            nv.setEmail(sc.nextLine());
            System.out.println("So dien thoai: ");
            nv.setSoDienThoai(sc.nextLine());
            System.out.println("Nhap luong co ban: ");
            ((NhanVienFullTime) nv).setLuongCoBan(sc.nextDouble());
            System.out.println("Nhap tien thuong: ");
            ((NhanVienFullTime) nv).setTienThuong(sc.nextDouble());
            danhSachNhanVien.add(nv);
        }
        else if (chon == 2){
            nv = new NhanVienPartTime();
            sc.nextLine();
            System.out.println("Ma nhan vien: ");
            nv.setMaNV(sc.nextLine());
            System.out.println("Ten nhan vien: ");
            nv.setTen(sc.nextLine());
            System.out.println("Email: ");
            nv.setEmail(sc.nextLine());
            System.out.println("So dien thoai: ");
            nv.setSoDienThoai(sc.nextLine());
            System.out.println("Nhap so gio lam: ");
            ((NhanVienPartTime) nv).setSoGioLam(sc.nextInt());
            System.out.println("Nhap luong theo gio: ");
            ((NhanVienPartTime) nv).setLuongTheoGio(sc.nextDouble());
            danhSachNhanVien.add(nv);
        }


    }
    public void hienThiTatCa(){
        for (NhanVien nv : danhSachNhanVien) {
            nv.hienThiThongTin();
        }
    }
    public double tinhTongLuong(){
        double tong = 0;
        for (NhanVien nv : danhSachNhanVien) {
            tong += nv.tinhLuong();
        }
        return tong;
    }
}
