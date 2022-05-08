package com.homework.kirbasko;

import java.util.Arrays;

public class Employee {
    private String surname;
    private String name;
    private String putronymic;
    private String post;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public Employee(String surname, String name, String putronymic, String post, String email, String tel, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.putronymic = putronymic;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public void print(){
        System.out.println(this);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPutronymic() {
        return putronymic;
    }

    public void setPutronymic(String putronymic) {
        this.putronymic = putronymic;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Employee[] EmpArray = new Employee[5];
        EmpArray[0] = new Employee("Пушкин", "Александр", "Сергеевич", "Писатель", "pushkin@gmail.com", "+78800553535", 30000, 66);
        EmpArray[1] = new Employee("Савельев", "Иван", "Аристархович", "Слесарь", "ivansav@gmail.com", "+78800555555", 21000, 39);
        EmpArray[2] = new Employee("Соломанин", "Петр", "Иванович", "Танцор", "petyasolo@gmail.com", "+78800556666", 25000, 46);
        EmpArray[3] = new Employee("Моргунов", "Святослав", "Сергеевич", "Уборщик", "morgsv@gmail.com", "+79675667454", 16000, 40);
        EmpArray[4] = new Employee("Лобода", "Светлана", "Яковна", "Певец", "lobodas@gmail.com", "+79511322564", 56000, 35);
        for (int i = 0; i < 5; i++) {
            if (EmpArray[i].age >= 40) {
                System.out.println(Arrays.toString(EmpArray));
            }
        }

    }
}

