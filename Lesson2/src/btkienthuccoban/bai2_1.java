package btkienthuccoban;

import java.util.Scanner;

public class bai2_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = input.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = input.nextInt();
        System.out.println("Nhap chieu cao:");
        int height = input.nextInt();
        System.out.println("Xin chao " + name + ",ban " + age +" tuoi va cao " + height + " met.");
    }
}
