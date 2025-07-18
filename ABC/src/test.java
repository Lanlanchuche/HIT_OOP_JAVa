import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int number = sc.nextInt();
        System.out.println("n/2 = " + number/2);
        sc.nextLine();// bo lenh enter
        String name = sc.nextLine();// string lay luon lenh enter khi nhap so truoc do
        System.out.println(name);
    }

}
