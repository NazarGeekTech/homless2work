package com.company;

public class Class9 extends School{

    private String girls;

    public String getGirls() {
        return girls;
    }

    public Class9(String director, String tisher, int number, String girls) {
        super(director, tisher, number);
        this.girls = girls;


    }

    @Override
    public void print() {
        super.print();
        System.out.println("Тогузунчу класс ");
        System.out.println("girls " + getGirls());
        System.out.println("____________");
    }
}
