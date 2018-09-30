package com.dodi.test;

import java.util.HashSet;

public class TestHashSet {

    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<String>();
        boolean add = hash.add("1");
        System.out.println(add);
        add = hash.add("1");
        System.out.println(add);
        add = hash.add("2");
        System.out.println(add);

        Object n = null;

        String ss = (String)n;
        System.out.println(ss);

    }

}
