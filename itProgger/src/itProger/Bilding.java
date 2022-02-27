package itProger;

import java.text.SimpleDateFormat;
import java.util.Date;

//Создайте класс Дом. Добавьте в него следующие данные:
//поля: количество этажей, год постройки, наименование;
//метод для установки всех значений;
//метод для вывода всех значений;
//метод, возвращающий количество лет с момента постройки.
//На основе класса создайте два объекта и пропишите для каждого характеристики. Добавление характеристик реализуйте через метод класса.
//Выведите информацию про каждый объект.
public class Bilding {
  private int floors;
  private int year;
  private String name;

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void countYears(){
        Date date = new Date();
        String nowYear = new SimpleDateFormat("YYYY").format(date);
        int newYear = Integer.parseInt(nowYear);
        int difYears = newYear - this.year;
        System.out.println("С момента постройки прошло "+ difYears +" лет");
    }

    public void printAll () {
        System.out.println(this.name + " построена в " + this.year + " году.");
        System.out.println("В " + this.name + " " + this.floors + " этажа.");
    }
}
