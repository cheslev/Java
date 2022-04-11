package lesson_5;

import java.util.Locale;

public class strng {
    public static void main(String[] args) {
    ex1("Are you starting a new job " +
            " Are you nervous about speaking English at your job " +
            " simple English sentences that will really help you out");

    ex2("deified");

    ex3("You are byaka", "byaka", "[Cencored]");

    ex4("This stroke go to bar, \n"+
            "This stroke go to bar, \n"+
            "This stroke exit bar, \n"+
            "This stroke go to bar, \n"+
            "This stroke go to bar", "bar");

    ex5("Hello world");
    }


    public static void ex1(String strEx1){
        String[] strArr = strEx1.split(" ");
        int count = 0;
        String longestWord = new String();
        for (String s : strArr){
            if(s.length() > count){
                longestWord = s;
                count = s.length();
            }
        }
        System.out.println(longestWord);
    }

    public static void ex2(String strEx2){
        String[] str = strEx2.toLowerCase().split("");
        boolean result = false;
        for(int i = 0; i < strEx2.length() / 2;i++){
            if(str[i].equals(str[strEx2.length() - 1 - i])){
                result = true;
            }
            else{
                result = false;
            }
        }
        System.out.println(result ? "Palindrome" : "Not palindrome");
    }

    public static void ex3(String text, String sens, String cencored){
        String cenc = text.replaceAll(sens, cencored);
        System.out.println(cenc);
    }

    public static void ex4(String text, String word){
        String[] str = text.toLowerCase().split(" ");
        int count = 0;
        for (String i : str) {
            if (word.equals(i))
                count++;
        }
        System.out.println(count);
    }

    public static void ex5(String text){
        String [] str = text.split(" ");
        StringBuilder reverseText = new StringBuilder();
        for(String i : str){
            reverseText.append(new StringBuilder(i).reverse().append(" "));
        }
        System.out.println(reverseText);
    }
}
