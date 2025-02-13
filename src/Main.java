// Parent class
class Animal {
    Animal() {
        System.out.println("hello word !");
    }
     void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Eag extends Dog {
    void sum () {
       System.out.println(3+90);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
       // if we make this as a static then we can  call without creating an obj of the class
        Eag e = new Eag();
        // Inherited method from Animal
        e.sum();       // Method of Dog class
        e.bark();
        e.makeSound();

    }
}