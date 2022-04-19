package lesson_7;

public class planeinfo {
    public static void main(String[] args) {
        plane.Wing wingLeft = new plane.Wing(20);
        plane.Wing wingRight = new plane.Wing(34);
        wingLeft.infoWing();
        wingRight.infoWing();
    }
}
