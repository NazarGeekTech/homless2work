package com.company;

public class Main {
    public static void main(String[] args) {
        greatObject("Class1").print();
        greatObject("Class9").print();
        greatObject("class11").print();

    }


    public static Printtable greatObject(String classname) {
        return switch (classname) {
            case "Class1" -> new Class1("А.Tуратбеков ",
                    "К.Гульнара", 20, "15");
            case "Class9" -> new Class9("A.Tуратбеков", "Г.Тазагуль "
                    , 20, "10");
            case "class11" -> new class11("A.Tуратбеков",
                    "Б.Айтурган", 20, "14");

            default -> null;
        };

    }


}
