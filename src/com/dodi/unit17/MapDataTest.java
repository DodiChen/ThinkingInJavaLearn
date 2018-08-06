package com.dodi.unit17;

import com.dodi.unit15.Generator;
import com.dodi.unit16.CountingGenerator;
import com.dodi.unit16.RandomGenerator;

import java.util.Iterator;

class Letter implements Generator<Pair<Integer,String>>, Iterable<Integer> {

    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    @Override
    public Pair<Integer, String> next() {
        return new Pair<Integer, String>(number++, "" + letter++);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number < size;
            }

            @Override
            public Integer next() {
                return number++;
            }

            @Override
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
}

public class MapDataTest {
    public static void main(String[] args) {
        System.out.println(MapData.map(new Letter(), 11));
        System.out.println(MapData.map(new CountingGenerator.Character(), new CountingGenerator.String(3),8));
        System.out.println(MapData.map(new CountingGenerator.Character(), "Value", 6));
        System.out.println(MapData.map(new Letter(), new RandomGenerator.String(3)));
        System.out.println(MapData.map(new Letter(), "Pop"));
    }
}
