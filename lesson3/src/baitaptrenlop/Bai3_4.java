package baitaptrenlop;

import java.util.Scanner;

public class Bai3_4 {
    public static int fibonaci(int n){
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        int []a = new int[n];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < n; i++){
            int sum = a[i - 2] + a[i - 1];
            a[i]  = sum;
        }
        return a[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print(fibonaci(i) + "  ");
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            if(fibonaci(i) % 2 != 0){
                sum += fibonaci(i);
            }
        }
        System.out.println();
        System.out.println("Tong cac so le trong day: " + sum);
    }
}
