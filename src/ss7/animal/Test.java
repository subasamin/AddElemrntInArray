package ss7.animal;

import ss7.animal.Animal.Animal;
import ss7.animal.Animal.Chicken;
import ss7.animal.Animal.Tiger;
import ss7.animal.Fruit.Apple;
import ss7.animal.Fruit.Fruit;
import ss7.animal.Fruit.Orange;

public class Test {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Chicken();
        animal[1] = new Tiger();
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        animal[0].makeSound();
        animal[1].makeSound();
        animal[0].howToEat();
        fruit[0].howToEat();
        fruit[1].howToEat();
        animal[1].howToEat();
        fruit[0].howToEat();
        fruit[1].howToEat();
    }
}
