package baitaptrenlop.bai3_1;

public class Manager extends Employee{
    private double phuCap;

    public Manager() {
    }

    public Manager(String name, double salary, double phuCap) {
        super(name, salary);
        this.phuCap = phuCap;
    }

    @Override
    public double getSalary() {
        return salary + phuCap;
    }
}
