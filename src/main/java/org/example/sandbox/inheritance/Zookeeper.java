package org.example.sandbox.inheritance;

public class Zookeeper {

    public static void main(String[] args)
    {
        Zookeeper zookeeper = new Zookeeper();

        Crow bird = new Crow();

        bird.fly();
        bird.layEggs();
        bird.count();
    }
}
