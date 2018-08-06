package com.dodi.unit17;

import com.dodi.unit16.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDAtaGeneration {

    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(
                CollectionData.list(new RandomGenerator.String(9), 10)
        ));
        System.out.println(new HashSet<Integer>(new CollectionData<Integer>(
                new RandomGenerator.Integer(), 10
        )));
    }

}
