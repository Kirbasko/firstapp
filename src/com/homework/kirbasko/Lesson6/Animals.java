package com.homework.kirbasko.Lesson6;


public class Animals {
    private String name;
    private int age;
    private int obsLenght = 2; //длина препятствия для животных
    private static int count;


    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animals() {
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getObsLenght() {
        return obsLenght;
    }

    public void setObsLenght(int obsLenght) {
        this.obsLenght = obsLenght;
    }

    public static int getCount() {
        return count;
    }


    public String run() {
        return getName() + " пробежал " + getObsLenght() + " м";
        }
    public String swim() {
        return getName() + " проплыл " + getObsLenght() + " м";
    }
}
