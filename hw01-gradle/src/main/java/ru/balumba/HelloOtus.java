package ru.balumba;

import java.util.Optional;

public class HelloOtus {
    public static void main(String[] args) {
        Optional<Integer> possible = Optional.of(101);

        System.out.println("Hallow " + possible.get() + " " + possible.hashCode());
    }
}
