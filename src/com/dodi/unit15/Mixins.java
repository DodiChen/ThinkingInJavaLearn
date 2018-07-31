package com.dodi.unit15;

import java.util.Date;

interface TimeStamped{
    long getStamp();
}

class TimeStampedImp implements TimeStamped{
    private final long timeStamp;
    public TimeStampedImp(){
        timeStamp = new Date().getTime();
    }
    @Override
    public long getStamp() {
        return timeStamp;
    }
}

interface SerialNumbered{
    long getSerialNumber();
}

class SerialNumberedImp implements SerialNumbered{
    private static long counter = 1;
    private final long serialNumber = counter++;
    public long getSerialNumber(){
        return serialNumber;
    }
}

interface Basic{}

class BasicImp implements Basic{
    private String value;
    public void set(String val){
        value = val;
    }
    public String get(){
        return value;
    }
}

class Mixin extends BasicImp implements TimeStamped, SerialNumbered{

    private TimeStamped timeStamp = new TimeStampedImp();
    private SerialNumbered serialNumbered = new SerialNumberedImp();
    @Override
    public long getSerialNumber() {
        return serialNumbered.getSerialNumber();
    }

    @Override
    public long getStamp() {
        return timeStamp.getStamp();
    }
}

public class Mixins {
    public static void main(String[] args) {
        Mixin mixin1 = new Mixin();
        Mixin mixin2 = new Mixin();
        mixin1.set("test string 1");
        mixin2.set("test string 2");
        System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
        System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());
    }
}
