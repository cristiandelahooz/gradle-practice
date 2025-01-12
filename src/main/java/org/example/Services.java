package org.example;

public class Services implements Service {

    @Override
    public void greetMethod(String message) {
        System.out.println("Hola: " + message);
    }
}
