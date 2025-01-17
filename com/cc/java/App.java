package com.cc.java;

public class App {
    
    public static void main(String[] args) {


        // Instanziierung + Wertzuweisung
        Cat cat = new Cat("Grizabella", "white", 29);
        // output("Blick von aussen: " + cat);
        // output("Blick von innen: " + cat.getInstanceVariable());

        // // Werte zuweisen
        // cat.firstName = "Grizabella";
        // cat.furColor = "white";
        // cat.age = 29;
        


        // Werte ausgeben
             output(cat.getFirstName());
             output(cat.getFurColor());
             output(Integer.toString(cat.getAge()));  // Explizite Typkonvertierung

        output("-----------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);
        // output("Blick von aussen: " + cat2);
        // output("Blick von innen: " + cat2.getInstanceVariable());

        // Werte zuweisen
        // cat2.firstName = "Alonzo";
        // cat2.furColor = "grey";
        // cat2.age = 35;

        // Werte ausgeben
        output(cat2.getFirstName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));
    }

  
    public static void output(String outputStr){
        System.out.println(outputStr);
    }


}

