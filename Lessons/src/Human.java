public class Human {

    private String name;
    private int age;
    /* // создаем конструктор
        public Human (){

        }
        public Human(String name){
            this.name = name;
            System.out.println("Hello from 2st constructor!");
        }
        public Human(String name,int age){
            this.name = name;
            this.age = age;
            System.out.println("Hello from 3th constructor!");
        }
    */
    public void setName (String name){
        if (name.isEmpty()){
            System.out.println("Tis field mast be entered!");
        } else{
            this.name = name;
        }
    }
    public void setAge(int age){
if (age>0){
    this.age = age;
} else {
    System.out.println("Age must be > 0");
}

    }
    public void getInfo(){
        System.out.println("I'm "+name+" and I'm "+age);
    }
}

