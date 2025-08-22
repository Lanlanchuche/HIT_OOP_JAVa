package baitaptrenlop.bai2_4;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("a+ b = " +calculator.sum(1, 2));
        System.out.println("a + b = "+calculator.sum(3.6, 7.3));
        System.out.println("a + b = " +calculator.sum(5, 6, 7));
    }
}
