import  Animal.*;
public class Main {
    public static void main(String[] args) {
        Animal[] zoo = {new Dog("dog1"), new Cat("cat1")};

        for (Animal a : zoo)
            a.makeSound();
    }
}