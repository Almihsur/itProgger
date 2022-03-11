package day6;

public class Motorbike {
    private String model, color;
    private int year;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public Motorbike(String model, int year, String color) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public int yearDifference(int inputYear){
        year = Math.abs(year - inputYear);
        System.out.println(year);
        return year;
    }
}
