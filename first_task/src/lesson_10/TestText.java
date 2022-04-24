package lesson_10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestText {
    public static void main(String[] args) {
        File file1 = new File("src/lesson_10/docs/ex_1.txt");
        File file2 = new File("src/lesson_10/docs/ex_2.txt");
        File file3 = new File("src/lesson_10/docs/ex_3.txt");
        String stringEx2 = "    @\t@@";


        System.out.println("Task 1");
        Exersice.ex1(file1).forEach(System.out::println);

        System.out.println("Task 2");
        Exersice.ex2(file2, stringEx2);

        System.out.println("Task 3");
        Exersice.ex3(file1, file2, file3);

        System.out.println("Task 4");
        Exersice.ex4(file3);
}
