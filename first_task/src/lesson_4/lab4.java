package lesson_4;

import java.util.Arrays;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 6, 3, 4, 5};
        exer_1(arr1);
        exer_2();
        exer_3(arr1);
        exer_4();
        exer_5();
    }
    public static void exer_1(int[] arr)
    {
        boolean result = false;
       for(int i = 0; i < arr.length-1; i++){
           if(arr[i]<arr[i+1]){
               result = true;

           }
           else{
               result = false;
               System.out.println("Please try again");
               break;
           }
       }
       if(result){
           System.out.println("OK");
       }
    }

    public static void exer_2(){
        Scanner in = new Scanner(System.in);
        int arrLenght = in.nextInt();
        int[] arr = new int[arrLenght];
        for(int i = 0; i<arrLenght;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void exer_3(int[] arr){
        int first = arr[0];
        int last = arr[arr.length-1];
        first = arr[arr.length-1];
        last = arr[0];
        System.out.println(Arrays.toString(arr));
    }

    public static void exer_4(){
        int[] arr = new int[]{1, 2, 3, 1, 2, 4};
        for (int i = 0; i < arr.length;i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++){
                if (i==j){
                    count++;
                }
                if (count == 1){
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    private static void exer_5(){
        int lengthOfArray = (int) (Math.random()*20);
        int[] TempArray = new int[lengthOfArray];
        for (int i = 0; i < TempArray.length; i++) {
            TempArray[i] = (int) (Math.random()*20);
        }
        System.out.println("Random array:");
        System.out.println(Arrays.toString(TempArray));
    }
}
