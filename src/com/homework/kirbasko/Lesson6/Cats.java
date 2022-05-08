package com.homework.kirbasko.Lesson6;

public class Cats extends Animals {

    private int maxLongRunCat = 200;
    private static int count;

    public Cats(String name, int age) {
        super(name, age);
        count++;
    }

    public String run() {
        if (maxLongRunCat > getObsLenght()) {
            return getName() + " пробежал " + getObsLenght() + " м";
        } else {
            return getName() + " не умеет так далеко бегать ";
        }
    }
    public String swim() {
            return getName() + " не умеет плавать ";
        }

    public static int getCount() {
        return count;
    }
}

