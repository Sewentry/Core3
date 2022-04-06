package lesson1.bigTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box<E extends Action>  {
    private List<E> box;


    public Box() {
        this.box = new ArrayList<>();
    }

    public double getWeight() {
       if(this.box.size()==0){
           return 0;
       }else{
          return this.box.size()*box.get(0).getWeight();
       }
    }
    public void addFruit(E fruit){
        box.add(fruit);
    }
    public boolean compareBox(Box compareBox){
        if(this.getWeight()==compareBox.getWeight()){
            return true;
        }
        return false;
    }

    public void trickle (Box<E> alternativeBox){
        alternativeBox.addAll(this.box);
        this.box.clear();
    }

    private void addAll(List<E> additionalBox) {
        box.addAll(additionalBox);
    }


}
