package day6;
/*
В классах Автомобиль и Мотоцикл реализуйте два метода:
void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
и возвращает разницу между переданным годом и годом выпуска транспортного средства
(возвращаться должно всегда положительное число).
 */
public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int carYear) {
        year = carYear;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String carClolr) {
        color = carClolr;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    public void getInfo() {
        System.out.println(model + " " + year + " year " + color + " color");
    }

    public void info(){
        System.out.println("Это автомобиль "+model);
    }

    public int yearDifference(int inputYear){
       year = Math.abs(year - inputYear);
        System.out.println(year);
        return year;
    }
}


