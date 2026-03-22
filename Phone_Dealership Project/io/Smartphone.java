package io;
import java.util.*;
import java.util.Objects;
public class Smartphone {
    String ModelName;
    int price;
    String color;

    //creating Constructor
    public Smartphone(String ModelName,int price,String color){
        this.ModelName = ModelName;
        this.price = price;
        this.color = color;
    }
    @Override
    public String toString(){
        return this.ModelName+" "+this.color+" "+this.price;
    }

}

