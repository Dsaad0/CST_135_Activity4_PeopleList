package com.example.peoplelist;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private int pictureNumber;

    public Person(String name, int age, int pictureNumber) {
        this.name = name;
        this.age = age;
        this.pictureNumber = pictureNumber;
    }

    //compareTo for sorting
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
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

    public int getPictureNumber() {
        return pictureNumber;
    }

    public void setPictureNumber(int pictureNumber) {
        this.pictureNumber = pictureNumber;
    }


}
