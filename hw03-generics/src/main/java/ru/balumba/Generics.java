package ru.balumba;

public class Generics {
    public static void main(String[] args) {
        Apple apple = new Apple(112);
        Apple apple2 = new Apple(88);

        Orange orange = new Orange(425);
        Orange orange2 = new Orange(200);
        Orange orange3 = new Orange(325);

        Box<Apple> boxApples = new Box<>();

        boxApples.add(apple);
        boxApples.add(apple2);

        Box<Orange> boxOranges = new Box<>();

        boxOranges.add(orange);
        boxOranges.add(orange2);
        boxOranges.add(orange3);

        System.out.println("Box Apples = " + boxApples.weight());
        System.out.println("Box Oranges = " + boxOranges.weight());

        Box<Fruit> globalBox = new Box<>();

        globalBox.add(apple2);
        globalBox.add(orange);

        System.out.println("Compire " + globalBox.compare(boxApples));
        System.out.println("GlobalBox before join = " + globalBox.weight());
        globalBox.join(boxApples);
        System.out.println("GlobalBox after join = " + globalBox.weight());

        System.out.println("Box Apples = " + boxApples.weight());
        System.out.println("Box Oranges = " + boxOranges.weight());
    }

}
