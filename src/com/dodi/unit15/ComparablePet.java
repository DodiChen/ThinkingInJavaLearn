package com.dodi.unit15;

public class ComparablePet implements Comparable<ComparablePet> {
    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}

/*class Cat extends ComparablePet implements Comparable<Cat>{
    public int compateTo(Cat arg){
        return 0;
    }
}*/

class Hamster extends ComparablePet implements Comparable<ComparablePet>{
    public int compareTo(ComparablePet arg){
        return 0;
    }
}

class Gecko extends ComparablePet{
    public int compareTo(ComparablePet arg){
        return 0;
    }
}