package com.company;

public class Snake extends Animal {
    private  int length;

    public Snake(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void print() {
        System.out.println("Name of " + getClass().getSimpleName() + " = " + getName()+" " + "length= "+ getLength());
    }
}
