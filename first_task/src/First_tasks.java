import java.util.Scanner;

public class First_tasks {
    public static void main(String[] args) {

        //Задание №1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        //Задание №2
        System.out.println((46 + 10)*(10/3));
        System.out.println((29) * (4) * (-15));

        //Задание #3
        int number = 10500;
        double result = (number / 10)/10;
        System.out.println(result);

        //Задание №4
        float a = 3.6f;
        float b = 4.1f;
        float c = 5.9f;
        System.out.println(a*b*c);

        //Задание №5
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        //Задание №6
        int bnumber = in.nextInt();
        if(bnumber % 2 > 0 && bnumber <= 100){
            System.out.println("Chetnoe");
        }
        else if (bnumber % 2 == 0 && bnumber <= 100){
            System.out.println("Nechetnoe");
        }
        else if(bnumber % 2 == 0 && bnumber > 100){
            System.out.println("Vihod za predeli diapazona");
        }




    }
}
