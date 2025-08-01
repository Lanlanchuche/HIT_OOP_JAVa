package baitaptrenlop.bai4_2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student hs1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        hs1.setName(ten);
        System.out.println("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        hs1.setAge(tuoi);
        System.out.println(hs1);

    }
}
