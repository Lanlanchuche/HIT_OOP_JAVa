package baitaptrenlop;

import java.util.Scanner;

public class Bai3_1 {
    public static boolean isPrime(int n){
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = sc.nextInt();
        }
        int tongChan = 0;
        int tongLe = 0;
        int dem = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] % 2 == 0)
            {
                tongChan += array[i];
            }
            else{
                tongLe += array[i];
            }
            if (isPrime(array[i])){
                dem++;
            }

        }
        System.out.println("Tong cac so chan cua mang la: " + tongChan);
        System.out.println("Tong cac so le cua mang la: " + tongLe);
        System.out.println("So luong so nguyen to cua mang la: " + dem);

    }

}
