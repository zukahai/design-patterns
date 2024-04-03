package abstractFactoty;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }

    @Override
    public void opration() {
        System.out.println("Dog is doing operation");
    }
}
