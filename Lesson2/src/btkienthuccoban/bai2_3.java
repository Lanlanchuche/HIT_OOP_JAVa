package btkienthuccoban;

import java.util.Scanner;

public class bai2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dau tien: ");
        int number1 = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int number2 = sc.nextInt();
        System.out.println("Tong hai so la: " + (number1 + number2));
        System.out.println("Hieu hai so la: " + (number1 - number2));
        System.out.println("Tich hai so la: " + (number1 * number2));
        System.out.println("Thuong hai so la: " + (number1 / number2));
        if (number1 == number2) {
            System.out.println("Hai so bang nhau!");
        }
        else {
            System.out.println("Hai so khac nhau!");
        }
    }
}
