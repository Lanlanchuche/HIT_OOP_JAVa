package baitaptrenlop.bai3_3;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return 4.14*r*r;
    }
}
