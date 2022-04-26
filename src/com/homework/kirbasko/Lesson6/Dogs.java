package com.homework.kirbasko.Lesson6;

public class Dogs extends Animals {

    private int maxLongRunDog = 500;
    private int maxLongSwimDog = 10;
    private static int count;

    public Dogs(String name, int age) {
        super(name, age);
        count++;
    }

    public String run() {
        if (maxLongRunDog > getObsLenght()) {
            return getName() + " пробежал " + getObsLenght() + " м";
        } else {
            return getName() + " не умеет так далеко бегать ";
        }
    }

    public String swim() {
        if (maxLongSwimDog > getObsLenght()) {
            return getName() + " проплыл " + getObsLenght() + " м";
        } else {
            return getName() + " не умеет так далеко плавать ";
        }
    }

    public static int getCount() {
        return count;
    }
}
