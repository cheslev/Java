package lesson_6.ex1;

public abstract class Human {
    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void printInfo();
}
