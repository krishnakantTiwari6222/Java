package OOPs.Polimorphism;

public class test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();
        Animal dog = new Dog();
        dog.makeSound();

    }
}
// In Polimorphism we gave a refrence of a parent class in a subclass object in the main function to avoid overriding 