package baitaptrenlop.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cage cage1 = new Cage();
        Cage cage2 = new Cage();
        ArrayList<Pet> all = new ArrayList<>();
        System.out.println("Nhap so thu cho long 1 (<=3):");
        int thu = sc.nextInt();

        for (int i = 1; i <= thu; i++) {
            Pet p = new Pet();
            cage1.addPet(p);
            all.add(p);

        }
        System.out.println("Nhap so thu cho long 2(<=3):");
        int thu2 = sc.nextInt();
        for (int j = 1; j <= thu2; j++) {
            Pet p = new Pet();
            cage2.addPet(p);
            all.add(p);
        }
        System.out.println("============");
        System.out.println("So long da tao la: " + Cage.totalCages);
        System.out.println("Danh sach thu long 1:");
        cage1.printAllPet();
        System.out.println("Danh sach thu long 2:");
        cage2.printAllPet();
        System.out.println("So thu nang >10 kg: ");
        for(Pet p : all){
            if(p.isOverWeight()){
                p.getBasicInfo();
            }
        }


    }
}
