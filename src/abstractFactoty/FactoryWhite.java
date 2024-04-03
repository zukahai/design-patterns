package abstractFactoty;

public class FactoryWhite implements AnimalAbstractFactory{

    @Override
    public Cat createCat() {
        return new CatWhite();
    }

    @Override
    public Dog createDog() {
        return new DogWhite();
    }
    
}
