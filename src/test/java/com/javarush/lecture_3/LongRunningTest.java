package com.javarush.lecture_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class LongRunningTest {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void shouldCompletePerOneSecond(){
        try{
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
