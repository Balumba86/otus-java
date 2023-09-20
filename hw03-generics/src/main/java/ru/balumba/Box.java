package ru.balumba;

import java.util.ArrayList;

public class Box<F extends Fruit> {
    private ArrayList<F> fruits;
    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(F fruit) {
        this.fruits.add(fruit);
    }

    public int weight() {
        double res = 0.0;
        for (F fruit : fruits) {
            res += fruit.getWeight();
        }

        return (int) res;
    }

    public boolean compare(Box<? extends Fruit> box) {
        if (box == null) return false;

        return Math.abs(this.weight() - box.weight()) < 0.0001;
    }

    public void join(Box<? extends Fruit> otherBox) {
        if (!this.equals(otherBox)) {
            for (int i = 0; i < otherBox.fruits.size(); i++) {
                this.add((F) otherBox.fruits.get(i));

                otherBox.fruits.remove(i);
            }
        }
    }
}
