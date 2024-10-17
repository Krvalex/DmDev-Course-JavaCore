package com.dmdev.collesctions.practice;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        Map<Integer, Integer> map1 = Map.of(
                0, 5,
                1, 3,
                3, 2,
                5, 4,
                6, 7);
        Map<Integer, Integer> map2 = Map.of(
                0, 5,
                3, 4,
                5, 5,
                6, 1);
        System.out.println(convertToString(sum(map1, map2)));
    }

    public static String convertToString(Map<Integer, Integer> map) {
        TreeMap<Integer, Integer> convertMap = new TreeMap<>(Comparator.reverseOrder());
        convertMap.putAll(map);
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : convertMap.entrySet()) {
            String s = entry.getKey() == 0
                    ? String.valueOf(entry.getValue())
                    : entry.getValue() + "x^" + entry.getKey();
            list.add(s);
        }
        return String.join(" + ", list);
    }

    public static Map<Integer, Integer> sum(Map<Integer, Integer> map1,
                                            Map<Integer, Integer> map2) {
        Map<Integer, Integer> newMap = new HashMap<>(map1);
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            Integer value = newMap.getOrDefault(entry.getKey(), 0);
            newMap.put(entry.getKey(), value + entry.getValue());
        }
        return newMap;
    }
}
