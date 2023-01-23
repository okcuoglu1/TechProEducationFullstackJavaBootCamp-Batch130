package day24accessmodifiersinheritance;

import day19listsvarargs.day23datetimestringbuilder.Snake;

public class AnimalsRunner {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.meow();
        myCat.drink();
        myCat.eat();
        //Cats meow....
        //Animals drink...
        //Animals eat...

        Bird myBird = new Bird();
        myBird.tweet();
        myBird.drink();
        myBird.eat();
        //Bird's tweet...
        //Animals drink...
        //Animals eat...

        Dog myDog = new Dog();
        myDog.bark();
        myDog.drink();
        myDog.eat();
        //Dog's bark...
        //Animals drink...
        //Animals eat...

        Snake yourSnake = new Snake();
        yourSnake.tiss();
        yourSnake.eat();
        //yourSnake.drink(); yok cunku default oldugu icin drink default oldugu icin
        //package private'dır.
    }



}
