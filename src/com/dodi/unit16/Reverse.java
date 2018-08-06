package com.dodi.unit16;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        CompType[] a = new CompType[12];
        for(int i = 0; i < 12; i++){
            a[i] = CompType.generator().next();
        }
        System.out.println(Arrays.toString(a));

        Arrays.sort(a, Collections.reverseOrder());

        System.out.println(Arrays.toString(a));

    }
}
