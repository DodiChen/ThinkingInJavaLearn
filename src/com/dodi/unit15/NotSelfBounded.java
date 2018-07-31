package com.dodi.unit15;

public class NotSelfBounded<T> {
    T element;
    NotSelfBounded<T> set(T arg){
        element = arg;
        return this;
    }
    T get(){
        return element;
    }
}

class A2 extends NotSelfBounded<A2>{}
class B2 extends NotSelfBounded<A2>{}
class C2 extends NotSelfBounded<C2>{}
class D2{}
class E2 extends NotSelfBounded<D2>{}
