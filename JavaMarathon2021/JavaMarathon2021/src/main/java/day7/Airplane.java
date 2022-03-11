package day7;

public class Airplane {
    private String manufacture;
    private int year;
    private double length, weight, fuel;

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void fuelUp(double n) {
        fuel = n + fuel;
    }

    public Airplane(String manufacture, int year, double length, double weight, double fuel) {
        this.manufacture = manufacture;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void getInfo() {
        System.out.println("Изготовитель: " + manufacture + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel
        );
    }
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
       double compareLenght =  0;
       if (airplane2.length - airplane1.length > 0){
           System.out.println("второй самолет длиннее");
       }else {
           System.out.println("первый самолет длиннее");
       }
    }
}
