
abstract class Fruit {
    public abstract void display();
}
 

class Apple extends Fruit {
    @Override
    public void display() {
        // Elma için mesaj gösteriliyor.
        System.out.println("Bu bir elma.");
    }
}
 
class Banana extends Fruit {
    @Override
    public void display() {
        // Muz için mesaj gösteriliyor.
        System.out.println("Bu bir muz.");
    }
}
 

abstract class FruitCreator {
    public abstract Fruit factoryMethod();
}
 

class AppleCreator extends FruitCreator {
    @Override
    public Fruit factoryMethod() {
        // Elma oluşturur.
        return new Apple();
    }
}
 
class BananaCreator extends FruitCreator {
    @Override
    public Fruit factoryMethod() {
        // Muz oluşturur.
        return new Banana();
    }
}
 

public class FactoryMethodExample {
    public static void main(String[] args) {
        
        FruitCreator appleCreator = new AppleCreator();
        Fruit apple = appleCreator.factoryMethod();
        
        apple.display();
 
        
        FruitCreator bananaCreator = new BananaCreator();
        Fruit banana = bananaCreator.factoryMethod();
        
        banana.display();
    }
}
