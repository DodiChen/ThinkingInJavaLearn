package com.dodi.unit17;

public class AssociativeArray<K, V> {
    private Object[][] pairs;
    private int index;

    public AssociativeArray(int length){
        pairs = new Object[length][2];
    }
}
