package com.javarush.lecture_4.mockito_5;

public class MyService {

    public void processDo(String input){
        System.out.println("Processing: " + input);
    }

    public String processThen(String input){
        return "Processing: " + input;
    }
}
