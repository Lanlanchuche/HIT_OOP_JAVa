package btkienthuccoban;

import java.util.Scanner;

public class bai2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int [5];
        int summary = 0;
        for (int i = 0; i < 5; i++)
        {
            System.out.print("arr[" +  i + "] = ");
            array[i] = sc.nextInt();
            summary += array[i];

        }
        int max = array[0];
        for (int i = 0; i < 5; i++){
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        System.out.print("Mang vua nhap la: ");
        for (int i = 0; i < 5; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Tong cac phan tu cua mang la: " + summary);
        System.out.print("Gia tri lon nhat cua mang la: " + max);
    }
}
