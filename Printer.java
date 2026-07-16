// Parent class
class Animal {
    public void sound() {
        System.out.println("Animals make different sounds.");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Bow Bow");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

// Child class 3
class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("Cow moos: Moo Moo");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}