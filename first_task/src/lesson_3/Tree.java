package lesson_3;

public class Tree {
    private int age;
    private String isAlive;
    private String name;

    public Tree(){
        System.out.println("Empty constructor without parameters is working");
    }
    public Tree(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Tree(String name, int age, String isAlive){
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;

    }
}
