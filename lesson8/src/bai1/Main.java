package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        int [] mark= new int[str.length()];
        int demchu = 0;
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            demchu++;
            if(str.charAt(i)==' ')
            {
                dem++;
            }
        }
        String str2 = "";
        for(int i=str.length() - 1;i>= 0;i--){
            str.charAt(i);
            str2+=str.charAt(i);
        }
        System.out.println("So khoanh trang la: " + dem);
        System.out.println("So ki tu la: " + demchu);
        System.out.println("Chuoi sau khi dao la: " + str2);
    }
}
