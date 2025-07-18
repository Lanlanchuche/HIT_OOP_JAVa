package btthuattoancoban;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            array[i] = sc.nextInt();
        }
        // phan tu cuoi co chi so le
        if (n % 2 == 0) {
            array[n-1] = array[n-1] + array[n-2];
            for (int i = 1; i < n - 1; i++) {
                if (i % 2 != 0) {
                    array[i] = array[i] + Math.abs(array[i-1] - array[i+1]);
                }
            }
        }
        //phan tu cuoi co chi so chan
        else {
            for (int i = 1; i < n; i++) {
                if (i % 2 != 0) {
                    array[i] = array[i] + Math.abs(array[i-1] - array[i+1]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
