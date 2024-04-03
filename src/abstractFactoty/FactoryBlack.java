package abstractFactoty;

public class FactoryBlack implements AnimalAbstractFactory{

    @Override
    public Cat createCat() {
        return new CatBlack();
    }

    @Override
    public Dog createDog() {
        return new DogBlack();
    }
    
}
