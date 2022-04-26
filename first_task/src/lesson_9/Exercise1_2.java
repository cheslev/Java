package lesson_9;
import java.util.*;

public class Exercise1_2 {
    public static void main(String[] args) {
        List list = Arrays.asList(1, 2, "Hff", 1, 2);
        System.out.println(ex2(list));

    }

    public static Set ex2(List arList) {
        Set set = new HashSet();
        for (int i = 0; i < arList.size(); i++) {
            set.add(arList.get(i));
        }
        return set;


    }


}
