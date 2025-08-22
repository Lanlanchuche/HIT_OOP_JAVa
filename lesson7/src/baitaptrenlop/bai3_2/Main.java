package baitaptrenlop.bai3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong vat: ");
        int n = sc.nextInt();
        Animal []list = new Animal[n];
        int chon ;
        for (int i = 0; i < n; i++) {
            System.out.println("1.Dog");
            System.out.println("2.Cat");
            System.out.println("3.Bird");
            System.out.println("CHON: ");
            chon = sc.nextInt();

            switch(chon){
                case 1:
                    list[i] = new Dog();
                    list[i].makeSound();
                    break;
                case 2:
                    list[i] = new Cat();
                    list[i].makeSound();
                    break;
                case 3:
                    list[i] = new Bird();
                    list[i].makeSound();
                    break;

            }

        }
    }
}
