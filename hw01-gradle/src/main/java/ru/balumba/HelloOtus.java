package ru.balumba;


import com.google.common.base.Strings;

public class HelloOtus {
    public static void main(String[] args) {
        System.out.println("Hello Otus!");

        String result = Strings.commonSuffix(
                "Information",
                "Education"
        );

        System.out.println("Слова, оканчивающиеся на \"" + result + "\"");
    }
}
