package com.javarush.lecture_4.mockito_3;

public class MyService {
    private DependencyService dependencyService;

    public MyService(DependencyService dependencyService) {
        this.dependencyService = dependencyService;
    }

    public String execute(){
        return dependencyService.someMethod();
    }
}
