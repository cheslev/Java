package lesson_3;

public class Car {
    public static void main(String[] args) {
    Cars cars1 = new Cars();
    Cars cars2 = new Cars("Red");
    Cars cars3 = new Cars("Blue", 300);

    System.out.println(cars1);
    System.out.println(cars2.getColor());
    System.out.println(cars3.getWeight());
    }
}
class Cars{
    private String color;
    private int weight;

    public Cars(){

    }

    public Cars(String color){
        this.color = color;
    }
    public Cars(String color, int weight){
        this.color = color;
        this.weight = weight;
    }

    String getColor(){
        return color;
    }

    int getWeight(){
        return weight;
    }
}
