package lesson_6.ex1;

public class Test {
    public static void main(String[] args) {
        Client clientTest1 = new Client("Ivan", "Ivamov", "Sber");
//        Client clientTest2 = new Client("Petr", "Petrov", "VTB");
        Employer clientTest2 = new Employer("Petr", "Petrov", "Alfa");
        System.out.println(clientTest1.getFirstName() + " " + clientTest1.getLastName()+ " " + clientTest1.getBankName());
        clientTest1.printInfo();
        clientTest2.printInfo();
    }
}
