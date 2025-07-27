package baitapvenha;

import java.util.Scanner;

public class Bai3_3 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*101);
        int b = (int)(Math.random()*101);
        int c = (int)(Math.random()*201);
        Scanner sc = new Scanner(System.in);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = a + b = " + c);
        boolean check = false;
        if (a + b == c) {
            check = true;
        }
        System.out.println("Nhap (dung/sai): ");
        String nhap = sc.nextLine();
        nhap = nhap.trim();
        if(check == true && nhap.equalsIgnoreCase("dung") || check == false && nhap.equalsIgnoreCase("sai")){
            System.out.println("Ban da tra loi dung!");
        }
        else{
            System.out.println("Ban da tra loi sai!");
        }
    }

}
