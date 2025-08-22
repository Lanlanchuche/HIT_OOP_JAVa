package baitaptrenlop.bai1_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap a = ");
            int a = sc.nextInt();

            System.out.println("Nhap b = ");
            int b = sc.nextInt();
            if(b == 0){
                throw new Exception("Loi chia cho 0");
            }
            double result = 1.0* a/b;
            System.out.println("Ket qua a/b = " + result);
        }
        catch(NumberFormatException ex){
            System.err.println("Loi sai du lieu");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        finally{

        }
    }
}
