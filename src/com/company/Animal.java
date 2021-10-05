package com.company;

public abstract class Animal implements IPrintable{
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
}
