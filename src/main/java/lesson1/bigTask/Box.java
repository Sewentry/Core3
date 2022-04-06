package lesson1.bigTask;

import java.util.ArrayList;
import java.util.Collection;

public class Box<E extends Action>  {
    private ArrayList <E> box;
    private int numberOfFruit=0;
    private double weightFruit=0;

    public Box() {
        this.box = new ArrayList<E>();
    }

    public double getWeight() {
       if(numberOfFruit==0){
           return 0;
       }else{
          return numberOfFruit*box.get(0).getWeight();
       }
    }
    public void addFruit(E fruit){
        box.add(fruit);
        numberOfFruit++;
    }
    public boolean compareBox(Box compareBox){
        if(box.get(0).getWeight()==compareBox.getWeight()){
            return true;
        }
        return false;
    }

    public void trickle (Box<E> alternativeBox){
        alternativeBox.addAll(box);
        box.clear();
    }

    private void addAll(ArrayList<E> additionalBox) {
        box.addAll(additionalBox);
    }


}
