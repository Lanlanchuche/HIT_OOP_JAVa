package btkienthuccoban;

import java.util.Scanner;

public class bai2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten: ");
        String name = sc.nextLine();
        System.out.println("Tuoi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Lop: ");
        String lop = sc.nextLine();
        System.out.println("Diem trung binh: ");
        double mark = sc.nextDouble();
        System.out.println("Ten: " + name + " - Tuoi: " + age + " - Lop: " + lop + " - Diem: " + mark);


    }
}
