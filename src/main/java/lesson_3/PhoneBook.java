package lesson_3;

import java.util.*;

public class PhoneBook  {
    static Map<String, Integer[]> phoneMap = new HashMap<>();


    public static void main(String[] args) {
        add("Sokolov", new Integer[]{544100, 458963});
        add("Durov", new Integer[]{145236, 258963});
        add("Ivanova", new Integer[]{896523, 147852, 565983});
        add("Sidorov", new Integer[]{147896});
        add("Leskov", new Integer[]{458963, 111222});

        get("Sokolov");
        get("Durov");
        get("Ivanova");
        get("Sidorov");
        get("Leskov");
    }

    public static void add(String firstName, Integer[] number){
        phoneMap.put(firstName,number);
    }

    public static void get(String firstName){
            System.out.println(firstName + " - " + Arrays.toString(phoneMap.get(firstName)));
    }

}
