package lesson_6.ex1;

public class Client extends Human{
    private String bankName;

    public Client(String firstname, String lastname, String bankName){
        super(firstname, lastname);
        this.bankName = bankName;
    }

    @Override
    public String getBankName(){
        return bankName;
    }

    @Override
    public void printInfo(){
        System.out.println(getFirstName() + getLastName() + getBankName());
    }
}
