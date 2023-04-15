package com.GeekVtb.Lesson5;

import java.util.*;

public class PhoneBook {
    private Map<String, HashSet<String>> map;

    PhoneBook() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phone) {
        HashSet<String> number;

        if(map.containsKey(lastName)) {
            number = map.get(lastName);
        }
        else {
            number = new HashSet<>();
        }
        number.add(phone);
        map.put(lastName,number);
    }

    Set<String> get(String lasName){
        return map.get(lasName);
    }
}
