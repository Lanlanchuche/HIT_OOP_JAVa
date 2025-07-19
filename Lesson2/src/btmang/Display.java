package btmang;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student []students = Student.inputArray(n);
        Student.printArray(students);
        System.out.println("Diem trung binh: " + Student.average(students));
        System.out.println("Diem cao nhat la: " + Student.maxGPA(students));
    }
}
