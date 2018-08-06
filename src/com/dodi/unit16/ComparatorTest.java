package com.dodi.unit16;

import java.util.Arrays;
import java.util.Comparator;

class CompTypeComparator implements Comparator<CompType>{

    @Override
    public int compare(CompType o1, CompType o2) {
        return (o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1));
    }
}

public class ComparatorTest {

    public static void main(String[] args) {
        CompType[] a = new CompType[12];
        for(int i = 0; i < 12; i++){
            a[i] = CompType.generator().next();
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, new CompTypeComparator());
        System.out.println(Arrays.toString(a));

    }
}
