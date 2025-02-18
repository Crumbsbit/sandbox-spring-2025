package org.example.sandbox.exception;

//This is so I can push again

public class Calculator
{
    public static void main( String[] args )
    {
        Calculator calc = new Calculator();

        System.out.println(calc.divide(2,2));

        try
        {
            System.out.println(calc.divide(2.0f, 0.0f));
        }
        catch(DivideByZeroException e)
        {
            System.err.println("Cannot divide by zero");
        }

    }

    public int divide(int a, int b)
    {
        int returnValue = 0;

        try
        {
            returnValue = a / b;
        }
        catch(ArithmeticException e)
        {
            System.err.println("Cannot divide by zero");
        }

        return returnValue;
    }

    public float divide(float a, float b) throws DivideByZeroException
    {
        if(b == 0.0)
        {
            throw new DivideByZeroException();
        }

        return a / b;
    }
}
