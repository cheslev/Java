package lesson_2;

public class Superman {
    public static void main(String[] args) {
        Hero superman = new Hero("Klark");
        Hero batman = new Hero("Bruce", 100);
        Hero flash = new Hero("Barry", 80, 120);
        System.out.println(superman.getName());
        System.out.println(batman.getHp());
        System.out.println(flash.getPower());
    }



}
