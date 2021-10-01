package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class getSumOfPeoplesBudget {
    public static void main(String[] args) {
//        double[] a = {{ name: "John", age: 21, budget: 23000 },
//        { name: "Steve",  age: 32, budget: 40000 },
//        { name: "Martin",  age: 16, budget: 2700 }};
//        System.out.println(getBudgets(a));
    }
    public static double getBudgets(Person[] persons) {
        double total=0;
        for(int i=0;i<persons.length;i++)
        {
            total+=persons[i].getBudget();
        }
        return total;
    }

}
//Class Person {
//    private String name;
//    private int age;
//    private double budget;
//
//    public Person(String name, int age, double budget) {
//        super();
//        this.name = name;
//        this.age = age;
//        this.budget = budget;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public double getBudget() {
//        return budget;
//    }
//    public void setBudget(double budget) {
//        this.budget = budget;
//    }


//    getBudgets([
//    { name: "John", age: 21, budget: 23000 },
//        { name: "Steve",  age: 32, budget: 40000 },
//        { name: "Martin",  age: 16, budget: 2700 }
//        ]) ➞ 65700
//
//        getBudgets([
//        { name: "John",  age: 21, budget: 29000 },
//        { name: "Steve",  age: 32, budget: 32000 },
//        { name: "Martin",  age: 16, budget: 1600 }
//        ]) ➞ 62600