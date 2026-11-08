package pl.edu.wszib.java.strumienie.anonimowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    static void main() {
        List<Integer> numbers = new ArrayList<>(List.of(5,2,7,9,3,7,4,8,9,0));

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);


        List<Car> cars = List.of(
                new Car("Toyota", "Corolla", 85000),
                new Car("Skoda", "Octavia", 95000),
                new Car("Volkswagen", "Golf", 105000),
                new Car("Ford", "Focus", 78000),
                new Car("Hyundai", "i30", 82000)
        );

        cars = new ArrayList<>(cars);

        System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);
    }
}
