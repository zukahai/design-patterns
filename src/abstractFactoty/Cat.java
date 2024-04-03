package abstractFactoty;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void sound() {
        System.out.println("Cat is meowing");
    }

    @Override
    public void opration() {
        System.out.println("Cat is doing operation");
    }
}
