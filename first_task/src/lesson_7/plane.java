package lesson_7;

public class plane {
    private String name;
    private int places;

    public plane() {
    }

    public plane(String name, int places) {
        this.name = name;
        this.places = places;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public void getInfo() {
        System.out.println("Plane name: " + name);
        System.out.println("aircraft capacity - " + places);
    }


    static class Wing {
        private double weight;


        public double getWeightLeft() {
            return weight;
        }

        public void setWeightLeft(double weight) {
            this.weight = weight;
        }

        public  Wing(double weight) {
            this.weight = weight;
        }

        public void infoWing() {
            System.out.println("Wing weight - " + this.weight);
        }

        ;
    }
}
