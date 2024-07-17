package ss7.animal.Fruit;

import ss7.animal.Edible;

public class Orange extends Fruit implements Edible {
    @Override
    public void howToEat() {
        System.out.println("Orange: chen tao di");
    }
}
