package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashSet<Cities> set = new HashSet<>();
        TreeSet<Cities> tree = new TreeSet<>();
        LinkedList<Cities> city = new LinkedList<>();

        city.add(new Cities(3948, "Ak-Suu"));
        city.add(new Cities(3736, "Bazar-Korgan"));
        city.add(new Cities(37, "Jalal-Abad"));
        city.add(new Cities(3746, "Kara-Kul"));
        city.add(new Cities(3745, "Tash-Kumyr"));
        city.add(new Cities(32, "Osh"));

//        HashMap<Integer, Cities> citiesHashMap = new HashMap<>();
//        citiesHashMap.put(3948, new Cities("Ak-Suu"));
//        citiesHashMap.put(3736, new Cities("Bazar-Korgan"));
//        citiesHashMap.put(37, new Cities("Jalal-Abad"));
//        citiesHashMap.put(3746, new Cities("Kara-Kul"));
//        citiesHashMap.put(3745, new Cities("Tash-Kumyr"));
//        citiesHashMap.put(32, new Cities("Osh"));
//        int s = 0;
//        Set<Integer> key = citiesHashMap.keySet();
//        //   System.out.println(citiesHashMap.keySet());
//       Iterator<Integer>it = key.iterator();
//       while (it.hasNext()){
//           if (key % 2 == 0) {
//                s=i;
//
//            }
//        }


        for (int i = 0; i < city.size(); i++) {
            if (city.get(i).name.length() > 5) {
                city.remove(i);
            }
        }

        for (int i = 0; i < city.size(); i++) {
            if (city.get(i).id % 2 != 0) {
                tree.add(city.get(i));
            } else {
                set.add(city.get(i));
            }
        }

        System.out.println("TreeSet: "+tree);
        System.out.println("Set: "+set);
        Iterator<Cities> it = ((TreeSet<Cities>) tree).descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
