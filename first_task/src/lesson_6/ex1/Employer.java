package lesson_6.ex1;
public class Employer extends Human {
    private String bankName;

    public Employer(String firstName, String lastName, String Name) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }


    @Override
    public void printInfo() {
        System.out.println(getClass().getSimpleName() + " " + getFirstName() + " " + this.getLastName() + " " + getClass().getSimpleName().toLowerCase()  + " " + getBankName());
    }
}
