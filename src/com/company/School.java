package com.company;

public class School  implements Printtable {
    private String director;
    private String tisher;
    private int number;

    public String getDirector() {
        return director;
    }

    public String getTisher() {
        return tisher;
    }

    public int getNumber() {
        return number;
    }

    public School(String director, String tisher, int number) {
        this.director = director;
        this.tisher = tisher;
        this.number = number;


    }


    @Override
    public void print() {
        System.out.println("____________");
        System.out.println("Гимназия №9");
        System.out.println("директор " + getDirector() + "\nучитель "
                + getTisher() + "\nколичество " + getNumber());

    }
}
