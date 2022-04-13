package lesson_6.ex2;

public class Truck extends Car {
    private int wheels;
    private int maxWeight;

    public void newWheels(int wheelsNew) {
        this.wheels = wheelsNew;
        System.out.println("New wheels " + wheels);
    }

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Max weight - " + maxWeight  + wheels + " wheels");
    }
}
