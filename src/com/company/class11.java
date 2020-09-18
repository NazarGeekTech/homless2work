package com.company;

public class class11 extends School {

    private String boys;

    public String getBoys() {
        return boys;
    }

    public class11(String director, String tisher, int number, String boys) {
        super(director, tisher, number);
        this.boys = boys;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Он биринчи класс");
        System.out.println("boys " + getBoys());
        System.out.println("____________");
    }
}
