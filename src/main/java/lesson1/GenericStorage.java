package lesson1;

import java.util.ArrayList;

public class GenericStorage<E> implements Storage<E> {
    private E[] data;
    private static final int DEFAULT_SIZE = 10;
    private int currentSize;

    public GenericStorage(int size) {
        this.data =  (E[])new Object[size];
        currentSize = 0;
    }

    public GenericStorage() {
        this(DEFAULT_SIZE);
    }
    @Override
    public void add(E value) {
        add(value, currentSize);
    }

    @Override
    public void add(E value, int index) {
        data[index] = value;
        currentSize++;
    }

    @Override
    public void remove(int index) {
        data[index] = null;
        currentSize--;
    }

    @Override
    public E get(int index) {
        return data[index];
    }

    @Override
    public boolean find(E value) {
        for (int i = 0; i < currentSize; i++) {
            if (value.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void display() {
        for (E datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }

    @Override
    public void sort() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                Comparable a = (Comparable) data[i];
                Comparable b = (Comparable) data[j];
                if (a.compareTo(b) > 0) {
                    exchange(i, j);
                }
            }
        }
    }
    public void exchange(int indexFirst, int indexSecond){
        if(!(indexFirst>currentSize || indexSecond>currentSize)) {
            E temp = data[indexFirst];
            data[indexFirst] = data[indexSecond];
            data[indexSecond] = temp;
        }else{
            throw new IndexOutOfBoundsException("Index is too big");
        }

    }

    public void toArrayList (ArrayList<E> arrayList){
        for (E arrayIndex: this.data) {
            arrayList.add(arrayIndex);
        }
    }

    @Override
    public int getCurrentSize() {
        return currentSize;
    }

    public void removeLast() {
        remove(--currentSize);
    }
}