package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Emp{
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    Integer id;
    String name;
    int age;
    String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Emp(int i, String guna, int i1,String dept) {
        this.id=i;
        this.name=guna;
        this.age=i1;
        this.dept=dept;
    }
    public String toString(){
        return id.toString()+" name "+name+" dept="+dept +"Age="+age;
    }

}