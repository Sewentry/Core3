package lesson1.bigTask;

import java.util.ArrayList;

public class FruitApp {
    public static void main(String[] args) {
        Box<Apple> boxApple = new Box();
        Box<Apple> boxApple2 = new Box();
        Box<Orange> boxOrange = new Box();
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        boxOrange.addFruit(new Orange());
        System.out.println(boxApple.getWeight());
        System.out.println(boxApple.compareBox(boxOrange));
        boxApple.trickle(boxApple2);
        System.out.println(boxApple2.getWeight());
    }
}
