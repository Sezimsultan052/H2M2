package com.company;

public class Cat extends Animal {

    private String breed;

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void print() {
        System.out.println("Name of " + getClass().getSimpleName() + " = " + getName()+ " " + "breed= "+ getBreed());
    }
}
