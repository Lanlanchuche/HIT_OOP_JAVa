package baitaptrenlop.bai3_5;

import java.text.spi.NumberFormatProvider;
import java.util.FormatterClosedException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("a = ");
                int a = sc.nextInt();
                System.out.println("b = ");
                int b = sc.nextInt();
                if(b == 0) {
                    throw new Exception("Loi chia cho 0");
                }
                double c = (double)a/b;
                System.out.println("a / b = " + c);
                break;

            }
            catch(InputMismatchException e){
                System.err.println("Loi sai dinh dang");
            }
            catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
    }
}
