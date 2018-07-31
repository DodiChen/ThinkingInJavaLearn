package com.dodi.unit15;

interface GenericGetter<T extends  GenericGetter<T>>{
    T get();
}

interface Getter extends GenericGetter<Getter>{}

public class GenericsAndReturnTypes {
    void test(Getter g){
        Getter result = g.get();
        GenericGetter gg = g.get();
    }
}
