package lesson_6.ex4;

public class Child extends Parent {

    @Override
    public void setName() {
        System.out.println("Name");
        String name = scan.nextLine();
        super.setName(name);
    }
}
