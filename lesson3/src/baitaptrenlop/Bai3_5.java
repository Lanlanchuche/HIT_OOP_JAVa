package baitaptrenlop;

import java.util.Scanner;

public class Bai3_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1, tmp = 1;

        while (h1 <= h2 && c1 <= c2) {
            for (int i = c1; i <= c2; i++) {
                a[h1][i] = tmp;
                tmp++;
            }
            h1++;
            for (int i = h1; i <= h2; i++) {
                a[i][c2] = tmp;
                tmp++;

            }
            c2--;
            if (h1 < h2) {
                for (int i = c2; i >= c1; i--) {
                    a[h2][i] = tmp;
                    tmp++;
                }
                h2--;
            }
            if (c1 < c2) {
                for (int i = h2; i >= h1; i--) {
                    a[i][c1] = tmp;
                    tmp++;
                }
                c1++;
            }


        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(a[i][j] + "   ");
            }
            System.out.println();
        }
        //tong duong cheo chinh
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += a[i][j];
                }
            }
        }
        System.out.println("Tong duong cheo chinh la: " + sum);
        // tong duong cheo phu
        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - i - 1) {
                    s += a[i][j];
                }
            }
        }
        System.out.println("Tong duong cheo phu la: " + s);

    }
}
