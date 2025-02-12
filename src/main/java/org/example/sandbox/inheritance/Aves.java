package org.example.sandbox.inheritance;

public abstract class Aves implements Animal {
    protected static int count = 0;

    protected int numberOfWings;

    public Aves()
    {
        count++;
    }

    public abstract void fly();

    public void layEggs()
    {
        System.out.println("I am laying eggs");
    }
}
