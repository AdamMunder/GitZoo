package Animal;

public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name ){
        this.name = name;
        age = 0;
        massage();
    }
    public abstract void makeSound();
    public void massage(){
        System.out.println("new Animal is Born!")
    }
}
