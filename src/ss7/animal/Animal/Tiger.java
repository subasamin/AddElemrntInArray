package ss7.animal.Animal;

import ss7.animal.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public void makeSound() {
        System.out.println("Tiger: grum grum grum grum grum grum grum");
    }

    @Override
    public void howToEat() {
        System.out.println("Tiger: tao an may duoc khong?");
    }
}
