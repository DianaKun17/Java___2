package lesson_3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<String, Integer>();

        Collections.addAll(arrayList, new String[]{"Яблоко","Апельсин","Банан","Морковь",
                "Яблоко","Вишня","Малина","Вишня","Апельсин","Абрикос","Мандарин","Ежевика","Банан","Ананас"});

        HashSet<String> unique = new HashSet<String>(arrayList);

        for (String key : unique) {
            map.put(key, Collections.frequency(arrayList, key));
        }

        System.out.println(arrayList);
        System.out.println(map);

    }


}

