package com.homework.kirbasko.Lesson7;

public class Plate {
    private int food;
    public Plate (int food){
        this.food = food;
    }
    public void info() {
        System.out.println("Еды в тарелке " + food);
    }
    public boolean decreaseFood(int amount) {
        int a = food - amount;
        if (a < 0) return true;
        food -= amount;
        return false;
    }

    public void increaseFood (int amount) {
        food += amount;
    }
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }

}
