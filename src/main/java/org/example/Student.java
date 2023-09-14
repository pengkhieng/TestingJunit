package org.example;

public class Student {

    int id;
    int age;
    String name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo(int id,int age,String name){
        this.name = name;
        this.age = age;
        this.id = id;
    }


}
