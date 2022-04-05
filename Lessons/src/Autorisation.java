import java.util.Scanner;

public class Autorisation{
    public static void main(String[] args) {

        String name;
        int age;

        Scanner scan = new Scanner(System.in);

        Identification person = new Identification();

        while(!person.getIsNameCorrect()){
            System.out.println("Введите Ваше имя: ");
            name = scan.nextLine();
            person.setName(name);
        }

        while(!person.getIsAgeCorrect()){
            System.out.println("Введите Ваш возраст: ");
            age = scan.nextInt();
            person.setAge(age);
        }

        System.out.println("Вас зовут - " + person.getName() + ". Ваш возраст - " + person.getAge() + " лет. Вы можете войти!!!");

    }
}
class Identification{
    private String userName;
    private int userAge;
    private boolean isNameCorrect = false;
    private boolean isAgeCorrect = false;


    public void setName(String n){
        if (n.isEmpty()){
            System.out.println("Вы ввели пустое имя!!! Введите имя еще раз!!!");
        }
        else{
            userName = n;
            isNameCorrect = true;}
    }
    public String getName(){
        return userName;
    }
    public Boolean getIsNameCorrect(){
        return isNameCorrect;
    }

    public void setAge(int a){
        if (a <= 0){
            System.out.println("Вас не существует!!! Введите возраст еще раз!!!");
        }
        else if (a < 16) {
            System.out.println("Вы еще слишком молоды для таких развлечений!!! До свидания!");
            System.exit(0);
        }
        else {
            userAge = a;
            isAgeCorrect = true;
        }
    }
    public int getAge(){
        return userAge;
    }
    public Boolean getIsAgeCorrect(){
        return isAgeCorrect;
    }
}

