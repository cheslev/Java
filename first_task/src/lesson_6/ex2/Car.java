package lesson_6.ex2;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;


    public void outPut () {
        System.out.println("Weight " + model + " is " + weight + "kg.");
        System.out.println("Color - " + color + " speed - " + speed);
    }

    public Car (int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car () {}
}
