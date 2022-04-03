package lesson_3;

public class House {
    private int floor;
    private int buildyear;
    private String name;

    public House(String name, int floor, int buildyear){
        this.name = name;
        this.floor = floor;
        this.buildyear = buildyear;
    }

    String getName(){
        return name;
    }

    int getFloor(){
        return floor;
    }

    int getBuildyear(){
        return buildyear;
    }

    int getyearfrom(){
        return 2022 - buildyear;
    }
}









