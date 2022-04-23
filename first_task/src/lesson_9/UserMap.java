package lesson_9;


import java.util.*;

public class UserMap {
    public static void main(String[] args) {
        User jack = new User("Jack");
        User tatyana = new User("Tatyana");
        User alex = new User("Alex");


        Map<User, Integer> map = new HashMap<>();
        map.put(jack, 10);
        map.put(tatyana, 11);
        map.put(alex, 11);

        showUsers(map);

        System.out.println("Name of gamer:");
        Scanner scan = new Scanner(System.in);
        String foundName = scan.nextLine();

        showScore(map, foundName);
    }

    private static void showScore(Map<User, Integer> map, String foundName) {
        Integer score = null;
        for (Map.Entry<User, Integer> pair : map.entrySet()) {
            if (pair.getKey().getName().equals(foundName)) {
                score = pair.getValue();
                break;

            }
        }
        System.out.println((score == null ? "Not register" : "Gamer score " +  score));

    }
    public static void showUsers (Map < User, Integer > map){
        for (Map.Entry<User, Integer> pair : map.entrySet()) {
            System.out.print(pair.getKey().getName() + ", ");
        }
        System.out.println("");
    }
}
