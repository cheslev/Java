package lesson_3;

public class NewHouse {
    public static void main(String[] args) {
        House house1 = new House("Hrushevka", 5, 1963);
        House house2 = new House("Big", 9, 2002);

        System.out.println(house1.getyearfrom());
        System.out.println(house2.getName());
        System.out.println(house2.getFloor());
    }



}
