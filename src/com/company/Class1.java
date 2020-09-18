package com.company;


public class Class1 extends School {

    private String  children ;

    public String getChildren() {
        return children;
    }

    public Class1(String director, String tisher, int number, String children) {
        super(director, tisher, number);
        this.children = children;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Биринчи класс");
        System.out.println("children " + getChildren());
        System.out.println("____________");
    }
}
