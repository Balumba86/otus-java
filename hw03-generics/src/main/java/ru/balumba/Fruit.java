package ru.balumba;

public abstract class Fruit {
    private int weight = 0;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
