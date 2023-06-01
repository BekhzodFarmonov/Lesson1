package uz.pdp.task1;

import java.util.Iterator;
import java.util.List;
public class CarIteratorByColor implements Iterator<Car> {
    List<Car> cars;
    private int counter = 0;
    private String color= null;
    public CarIteratorByColor(List<Car> cars, String color) {
        this.cars = cars;
        this.color = color;
    }
    @Override
    public boolean hasNext() {
        while (counter<cars.size()){
            if(cars.get(counter).getColor().equals(color)){
            counter++;
                return true;
        }
        counter++;}
        return false;

    }
    @Override
    public Car next() {
        return cars.get(counter-1);
    }
}
