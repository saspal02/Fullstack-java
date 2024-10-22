package com.fullstackJava.learnspringframework.helloworld;

import java.io.Serializable;

public class Pojo {
    private String text;
    private int number;

    public String toString() {
        return text + ";" + number;
    }
}

 class JavaBean implements Serializable {
    //Public no-arg constructor
    public JavaBean() {

    }
     private String text;
     private int number;

     //2: getters and setters


     public int getNumber() {
         return number;
     }

     public void setNumber(int number) {
         this.number = number;
     }

     public String getText() {
         return text;
     }

     public void setText(String text) {
         this.text = text;
     }
 }

