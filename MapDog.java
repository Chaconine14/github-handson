package org.example;

import java.util.HashMap;

public class MapDog {
    public static void main(String[] args) {
        HashMap<String, String> population = new HashMap<>();
        population.put("クッキー", "15歳・♀");
        population.put("ハナちゃん", "5歳・♀");
        population.put("タロー", "6歳・♂");

        System.out.println(population.get("クッキー"));
        System.out.println(population.get("ハナちゃん"));
        System.out.println(population.get("タロー"));
    }
}
