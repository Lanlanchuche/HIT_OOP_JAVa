package baitaptrenlop.bai3_1;

public class Main {
    public static void main(String[] args) {
        Employee nv = new Employee("Nhan vien A", 4000000);
        System.out.println("Luong cua nhan vien A la :" + nv.getSalary());
        Manager ql = new Manager("Quan li A", 4000000, 200000);
        System.out.println("Luong cua quan li A la :" + ql.getSalary());
    }
}
