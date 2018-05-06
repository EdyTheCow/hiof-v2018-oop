package io.edy.oblig2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        TVSeries blackmirror = new TVSeries("Black Mirror ", "TV Series about technology", 2010, 1);

        // Creating some episodes
        Episode bmS1E1 = new Episode(01, 01, "The National Anthem", 44);
        Episode bmS1E2 = new Episode(02, 01, "Fifteen Million Merits", 44);
        Episode bmS1E3 = new Episode(03, 01, "The Entire History of You", 44);

        // Adding episodes to array
        blackmirror.addEpisode(bmS1E1);
        blackmirror.addEpisode(bmS1E2);
        blackmirror.addEpisode(bmS1E3);

        System.out.println(blackmirror);

        TVSeries poopInSpace = new TVSeries("Poop", "Poop in space", 2020, 10);

        // generate 20 episodes with random play time
        int a;
        int b;
        for( a=1; a <= 5; a++ ){

            for ( b=1; b <= 20; b++ ){

                Random random = new Random();
                Episode poop = new Episode(b, a,"poop", random.nextInt(10 ) + 21 );
                poopInSpace.addEpisode(poop);
            }
        }

        // print out all episodes of poop in space from season 4
        System.out.println(poopInSpace.ListEpisodesFromSeason(4));

        // print out average play time for episodes
        System.out.println("Average time: " + poopInSpace.getAverageTime());

    /*
    Class = Class can include different methods and functions to be used in code
    Object (konseptet, ikke klassen) = Everything extends from Object class, if a class doesn't have extend then it directly extends from Object.
    Member(field) variable = Variables that are only available inside a class
    Overloading = Overloading is when a class has multiple constructors
    Overriding = Overriding a method inside class, example: @Override toString
    Extends = Inheritance of a different class, copies all methods from class X to class Y. That way you no longer have to repeat all methods in class Y
    Polymorphism = Means object is going to become two forms, one with inheritance and other without it
    private,public,(protected) (class,variable,method) = Private methods are only accessible inside method while public can be accessed from outside the method
    this og super = this points to something inside the method. Super is used to give child class access to father class
     */

    }
}
