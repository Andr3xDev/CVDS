package edu.eci.cvds.patterns.archetype;

/**
 *
 */
public class App {
    public static void main( String[] args ) {
        if (args == null) {
            System.out.println("Hello World!");
        } else {
            System.out.println( "Hello " + args[0] + " " + args[1]);
        } 
    }
}