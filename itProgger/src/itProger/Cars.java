package itProger;

public class Cars {
    private String color, name;
    private double weight;

    public Cars() {}
    public Cars(String name, String color, double weight ) {
        this.color = color;
        this.weight = weight;
        this.name = name;
    }

    public Cars(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Cars(String color) {
        this.color = color;
    }

    public void carInfo(){
        System.out.println("Nmame = "+this.name+"\n Color = "+this.color+"\n Wight = "+this.weight);
    }
}
