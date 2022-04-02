package lesson_2;

public class Hero {
    private String name;
    private int hp;
    private int power;

    public Hero(String name){
        this.name = name;
    }

    public Hero(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public Hero(String name, int hp, int power){
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    String getName(){
        return name;
    }

    int getHp(){
        return hp;
    }

    int getPower(){
        return power;
    }

}
