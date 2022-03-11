package day6;

public class Task2 {
    public static void main(String[] args) {
       Airplane airplane1 = new Airplane("Unknow",1990,20,30,0);
        airplane1.setYear(2000);
        airplane1.setManufacture("Boing");
        airplane1.setLength(50.3);
        airplane1.setWeight(5347.4);
        airplane1.fuelUp(100);
        airplane1.fuelUp(200);
        airplane1.fuelUp(50);
        airplane1.getInfo();
    }
}
