package com.dodi.unit15;

import java.util.ArrayList;
import java.util.List;

public class ListOfInt {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            li.add(i);
        }
        System.out.println(li);
    }
}
