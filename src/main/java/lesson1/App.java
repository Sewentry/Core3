package lesson1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        GenericStorage<Integer> intStorage = new GenericStorage<>(20);
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        intStorage.add(1);
        intStorage.add(2);
        intStorage.add(3);
        intStorage.add(0);
        intStorage.add(0);
        intStorage.exchange(5,3);
        intStorage.display();
        intStorage.toArrayList(arrayList);
    }

}
