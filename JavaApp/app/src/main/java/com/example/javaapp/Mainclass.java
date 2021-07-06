package com.example.javaapp;

public class Mainclass implements Intt, Int1{
    public static void main(String []args){
        Int1 i=new Mainclass();
        i.all();
        i.hi();
        Intt i2=new Mainclass();
        i2.all();
    }
    @Override
    public void all() {
        Intt.super.all();
        Int1.super.all();
    }


    @Override
    public void hi() {

    }


}
