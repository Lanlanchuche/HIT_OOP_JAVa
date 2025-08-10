package baitapvenha.bai1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien muon nhap: ");
        int n = sc.nextInt();
        ArrayList <Student> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            Student sv = new Student();
            sv.Input();
            list.add(sv);
        }
        System.out.println("Xuat danh sach sinh vien:");
        for(Student sv: list){
            sv.Output();

        }
    }
}
