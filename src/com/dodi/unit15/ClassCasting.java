package com.dodi.unit15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ClassCasting {
    public void f(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
        List<Weight> lw2 = List.class.cast(in.readObject());
        //List<Weight> lw3 = List<Weight>.class.cast(in.readObject());
        List<Weight> lw4 = (List<Weight>)List.class.cast(in.readObject());
    }
}
