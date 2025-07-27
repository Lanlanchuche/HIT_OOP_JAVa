package baitapvenha;

import java.util.Scanner;
public class Bai3_2 {
    public static void kiemTraDoiXung(String str) {
        String chuoi = str.trim();
        String chuoiDao = "";
        for (int i = chuoi.length() - 1; i >= 0; i--) {
            chuoiDao += chuoi.charAt(i);
        }
        if (chuoiDao.equals(chuoi)) {
            System.out.println(chuoi.toUpperCase());
            System.out.println("Chuoi nay DOI XUNG!");
        }
        else {
            System.out.println(chuoi.toLowerCase());
            System.out.println("Chuoi nay KHONG DOI XUNG!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra: ");
        String str = sc.nextLine();
        kiemTraDoiXung(str);
    }

}
