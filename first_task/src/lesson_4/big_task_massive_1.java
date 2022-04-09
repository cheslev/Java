package lesson_4;

import java.util.Scanner;
public class big_task_massive_1 {
    public static void main(String[] args) {
        ex_1();
        ex_2();
        ex_3();
        ex_4();

    }
    //Задание 1
    public  static  void ex_1(){
        for (int i = 1; i < 99; i += 2) {
            System.out.println(i);
        }
    }

    //Задание 2
    public static void ex_2() {
        int q = 1;
        while (q < 100) {
            if (q % 3 == 0 || q % 5 == 0) {
                if (q % 3 == 0) {
                    System.out.println("Delitsa na three:" + q);
                } else if (q % 3 == 0 && q % 5 == 0) {
                    System.out.println("Delitsa na three and five:" + q);
                } else if (q % 5 == 0) {
                    System.out.println("Delitsa na five:" + q);
                }
                q++;
            }
        }
    }

    //Задание 3
    public static void ex_3(){
        Scanner in = new Scanner(System.in);
        int numb1 = in.nextInt();
        int numb2 = in.nextInt();
        int numb_sum = in.nextInt();

        if (numb1 + numb2 == numb_sum){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
//задание 4
    public static void ex_4(){
        {
            Scanner in = new Scanner(System.in);
            int first = in.nextInt();
            int second = in.nextInt();
            int third = in.nextInt();

            if (second > first && third > second){
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
    }
    // задание 5
    public static void ex_5(){
        int[] arr = new int[]{4, 5, 2, 3};
        if(arr[0] == 3 || arr[arr.length - 1] == 3){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    //задание 6
    public static void ex_6(){
        int[] arr = new int[]{6, 1, 4, 5};
            for(int i = 1; i < arr.length - 1; i++){
                if(arr[i] == 1 || arr[i] == 3){
                    System.out.println("True");
                }
        }
    }

}



