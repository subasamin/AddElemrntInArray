package ss7.animal.Animal;

import ss7.animal.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public void makeSound() {
        System.out.println("Chicken: cluck cluck");
    }

    @Override
    public void howToEat() {
        System.out.println("Chicken: tao an may duoc khong?");
    }
}
