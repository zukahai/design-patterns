package abstractFactoty;

public class Main {
    public static void main(String[] args) {
        AnimalAbstractFactory factoryWhite = new FactoryWhite();
        Cat catWhite = factoryWhite.createCat();
        Dog dogWhite = factoryWhite.createDog();
        catWhite.opration();
        dogWhite.opration();

        AnimalAbstractFactory factoryBlack = new FactoryBlack();
        Cat catBlack = factoryBlack.createCat();
        Dog dogBlack = factoryBlack.createDog();
        catBlack.opration();
        dogBlack.opration();
        
    }
}
