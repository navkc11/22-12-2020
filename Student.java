package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    ArrayList<Integer> grades;
    Scanner s = new Scanner(System.in);


    public Student(String name) {
        this.name = name;
        this.grades = grades;
    }
    //method 1
    public Double studentAvg(){
        double total = 0;
        for(int i = 0; i<grades.size();i++){
            total += grades.get(i);
        }
        return total/grades.size();
    }
    //method 2
    public Boolean isTop(){
        if(studentAvg() >= 90) return true;
        else return false;
    }
    //method 3
    public Student better(Student other){
        Student a = new Student(s.next());
        if (a.studentAvg() > other.studentAvg()) return a;
        else return other;
    }
    //method 4
    public ArrayList<Integer> failures(){
        ArrayList<Integer> failures = new ArrayList<Integer>();
        for(int i = 0; i<grades.size();i++){
            if(grades.get(i)<=55) {
                failures.add(grades.get(i));
            }
        }
        return failures;
    }
}
