package Com.oopsencapsulation.Inheritance;

public class Animal extends Object {

    String species;

    public void makesound() {

        System.out.println("Animal makes a sound");
    }

    public void dancing() {

        System.out.println("Default behaviour");
    }

}

class Dog extends Animal {
    @Override
    public void makesound() {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal {

    @Override
    public void makesound() {
        System.out.println("Cat is meow");

    }

}
class Lion extends Animal {
    @Override
    public void makesound() {
        System.out.println("Lion is roaring");
    }

}
class Hippo extends Animal {

    public void dancing() {
        System.out.println("Hippo is dancing");
    }
}

class Crocodile extends Animal {
    @Override
    public void dancing() {
        System.out.println("Crocodile is dancing");

    }
}
class Runner {


    public static void main(String[] args) {
        Animal Jimmy = new Dog();
        Animal Kitty = new Cat();
        Animal King = new Lion();
        Animal Crocs = new Crocodile();




        Jimmy.makesound();
        Kitty.makesound();
        King.makesound();

        Crocs.makesound();
        Crocs.dancing();

        Animal animal = new Hippo();
        animal.dancing();
    }
}
