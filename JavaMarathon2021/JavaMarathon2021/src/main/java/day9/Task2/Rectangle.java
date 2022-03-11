package day9.Task2;

public class Rectangle extends Figure{
    int wide, hight;

    public Rectangle(String color, int wide, int hight) {
        super(color);
        this.wide = wide;
        this.hight = hight;
    }

    public int getWide() {
        return wide;
    }

    public int getHight() {
        return hight;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
