package lesson_6.ex2;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(10, "BMV", 'b', 160);
        Truck track1 = new Truck(100, "Mers", 'w', 100, 8, 1000);
        car1.outPut();
        track1.outPut();
        track1.newWheels(4);
        track1.outPut();
        Car test = new Truck(100, "Mers", 'w', 100, 8, 1000);
        test.outPut();
    }
}
