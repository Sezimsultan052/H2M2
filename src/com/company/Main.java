package com.company;

public class Main {

    public static void main(String[] args) {
	Animal[] animals = { createObjects("Dog"), createObjects("Snake"), createObjects("Cat")};
	for(Animal animal: animals){
	    animal.print();
	    }
    }

    public static Animal createObjects(String className) {
        switch (className){
            case "Cat": Cat cat = new Cat("Cat", "египетская клеопатра");
            return cat;
            case "Dog": Dog dog = new Dog("Dog", 5);
            return dog;
            case "Snake": Snake snake = new Snake("Snake", 12);
            return snake;
            default: return null;
        }

    }
}
