package baitaptrenlop;

import java.util.Scanner;

public class Bai3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi bat ki: ");
        String chuoi = sc.nextLine();

        String xoaCach = chuoi.trim();

        String chuoiDaDao = "";
        for (int i=xoaCach.length() - 1; i >= 0; i--){
            chuoiDaDao += xoaCach.charAt(i);
        }
        if (chuoiDaDao.equalsIgnoreCase(xoaCach)){
            System.out.println("Chuoi doi xung! ");
        }
        else{
            System.out.println("Chuoi KHONG doi xung!");
        }
        System.out.println("Chuoi sau khi xoa cach 2 dau: " + xoaCach);
        System.out.println("Chuoi sau khi dao: " + chuoiDaDao);
    }
}
