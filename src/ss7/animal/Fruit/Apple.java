package ss7.animal.Fruit;

import ss7.animal.Edible;

public class Apple extends Fruit implements Edible {
    @Override
    public void howToEat() {
        System.out.println("Apple: an duoc");
    }
}
