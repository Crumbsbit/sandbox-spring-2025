package org.example.sandbox.inheritance;

public class Bird extends Aves
{
    public Bird()
    {
        super();
        count++;
    }

    @Override
    public void fly()
    {
        System.out.println("I am flying");
    }

    @Override
    public void eat(String food) {

    }
}
