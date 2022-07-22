package lesson1;

import lesson1.Fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitBox<T extends Fruit> {
    private ArrayList<T> container;

    public FruitBox() {
        this.container = new ArrayList<>();
    }

    public FruitBox(T... fruits) {
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add(T... fruits) {
        this.container.addAll(Arrays.asList(fruits));
    }

    public void add(T fruit) {
        this.container.add(fruit);
    }

    public float getWeight() {
        if (container.size() == 0) {
            return 0.0f;
        }
        return container.size() * container.get(0).getWeight();
    }

    public boolean compare(FruitBox<?> box) {
        return this.getWeight() == box.getWeight();

    }

    public void transfer(FruitBox<? super T> box)  {
        if (this == box) {
            return;
        }
        box.container.addAll(this.container);
        this.container.clear();
    }

}
