package com.baolt2008110151.tuan7;
public class animalTestDrive {
    public static void main(String[] args){
        Caterpillar caterpillar = new Caterpillar();
        caterpillar.evolution();
        caterpillar.eat();
        caterpillar.sleep();
        caterpillar.walk();

        Wolf wolf = new Wolf();
        wolf.makenoise();
        wolf.eat();
        wolf.sleep();
        wolf.hunting();
        wolf.bite();

        Lion lion = new Lion();
        lion.makenoise();
        lion.eat();
        lion.sleep();
        lion.walk();
        lion.hunting();
        lion.bite();

        Eagle eagle = new Eagle();
        eagle.makenoise();
        eagle.eat();
        eagle.sleep();
        eagle.fly();
        eagle.hunting();

        Dog dog = new Dog();
        dog.makenoise();
        dog.eat();
        dog.sleep();
        dog.walk();
        dog.chase();
        dog.bite();

        Cat cat = new Cat();
        cat.makenoise();
        cat.eat();
        cat.sleep();
        cat.walk();
        cat.chase();
        cat.bite();

    }
}
