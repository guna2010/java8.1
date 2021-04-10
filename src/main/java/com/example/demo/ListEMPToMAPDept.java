package com.example.demo;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ListEMPToMAPDept {
    public static void main(String arg[]){
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.pop();
        Stack<Integer> s=new Stack();
        s.pop();
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee(10,"guna",11,"IT"));
        list.add(new Employee(11,"sankar",22,"Admin"));
        list.add(new Employee(11,"sankar",22,"Admin"));
        list.add(new Employee(11,"sankar",22,"BSA"));
        list.add(new Employee(11,"sankar",22,"IT"));
       Map<Object, List<Employee>> deptMap= list.stream().collect(Collectors.groupingBy(Employee::getDept));
 Set set=deptMap.keySet();
        List <String> depList= (List<String>) set.stream().collect(Collectors.toList());
        depList.forEach(System.out::println);
        for(int i=0;i<depList.size();i++){
            String key=(String) depList.get(i);
            List<Employee> empList=deptMap.get(key);
            for(int j=0;j<empList.size();j++){
                Employee e=empList.get(j);
                System.out.println(" DEpt="+key+"List="+e.getName()+" "+e.getDept()+" "+e.getName());
            }
        }

    }

}

class Employee{
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

    public Employee(int i, String guna, int i1,String dept) {
        this.id=i;
        this.name=guna;
        this.age=i1;
        this.dept=dept;
    }
}