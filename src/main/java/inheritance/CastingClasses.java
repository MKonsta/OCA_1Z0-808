package inheritance;

class Animal {
}

class Dog extends Animal {
}


public class CastingClasses {
    public static void main(String[] args) throws Exception {

        Animal animal = new Animal();

        Dog dog = new Dog();

        animal = dog; // a Dog  "IS A" Animal, so you don't need to cast it.

        dog = (Dog) animal; //But an Animal may not always be a Dog.
        // So you need to cast it to make it compile and during the runtime the actual object referenced by animal should be a Dog  otherwise it will throw a ClassCastException.

        System.out.println("a = " + animal.getClass());
        System.out.println("aa = " + dog.getClass());
    }
}

// A subclass can ALWAYS be assigned to a super class variable without any cast. It will always compile and run without any exception.