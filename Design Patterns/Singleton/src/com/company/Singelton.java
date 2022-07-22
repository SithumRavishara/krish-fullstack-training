package com.company;

public class Singelton {
    private static Singelton instance = new Singelton ();

    private Singelton() {
    }

    ;

    public static Singelton getInstance() {
        if (instance == null ){
            instance = new Singelton ();

        }
        return instance;

    }

    public void showMessage(){
        System.out.println ("Miau" );
    }
}
