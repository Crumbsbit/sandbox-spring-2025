package org.example.sandbox.exception;

import java.util.Scanner;

//This is so I can push again

public class HelloException
{
    public static void main( String[] args ) {
        //try-catch
        try {
            // do something
            throw new Exception("Hello Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //do something else

        //try-catch-catch - order of catch blocks matters per hierarchy
        try
        {
            // do something awesome
        } catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        try
        {
            // do something
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            //finally do something
        }

        //java 7 mutil-try-catch
        try
        {
            // do something
        }
        catch(ArithmeticException | NullPointerException e)
        {
            e.printStackTrace();
        }

        //try-with-resources
        try(Scanner scanner = new Scanner(System.in))
        {
            // do something
        }

    }
}
