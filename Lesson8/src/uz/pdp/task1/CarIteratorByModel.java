package uz.pdp.task1;
import java.util.Iterator;
import java.util.List;
public class CarIteratorByModel implements Iterator<Car> {
    List<Car> cars;
    private int counter = 0;
    private String model = null;
    public CarIteratorByModel(List<Car> cars, String model) {
        this.cars = cars;
        this.model = model;
    }
    @Override
    public boolean hasNext() {
        while (counter < cars.size()) {
            if (cars.get(counter).getModel().equals(model)) {
                counter++;
                return true;
            }
            counter++;
        }
        return false;
    }
    @Override
    public Car next() {
        return cars.get(counter-1);
    }
}
