package com.homework.kirbasko.Lesson7;

public class Cat {
    private int appetite;
    private String name;
    private boolean satiety;

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }
    public void eat (Plate plate) {
        //plate.decreaseFood(appetite);
        if (satiety && plate.decreaseFood(appetite))
            satiety = false;
    }

    public void info() {
        System.out.println(name + ": " + isSatiety());
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }
}


