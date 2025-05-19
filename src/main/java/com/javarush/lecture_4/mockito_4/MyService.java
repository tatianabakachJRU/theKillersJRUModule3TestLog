package com.javarush.lecture_4.mockito_4;

public class MyService {
    public String fetchData(){
        if(true){
            throw new RuntimeException("Exception fetching data");
        }
        return "Real Data";
    }
}
