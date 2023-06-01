package uz.pdp.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Lacetti", "oq", 2023);
        Car car2 = new Car("Nexia", "qora", 2021);
        Car car3 = new Car("Lacetti", "qora", 2020);
        Car car4 = new Car("Cobalt", "ko`k", 2022);
        Car car5 = new Car("Nexia", "qizil", 2021);
        Car car6 = new Car("Cobalt", "sariq", 2019);
        List<Car> cars = List.of(car1, car2, car3, car4, car5, car6);
        CarIteratorByModel iteratorByModel=new CarIteratorByModel(cars,"Nexia");
        while (iteratorByModel.hasNext())
            System.out.println(iteratorByModel.next());
        CarIteratorByColor iteratorByColor=new CarIteratorByColor(cars,"qora");

    }
}
