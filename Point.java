package com.company;

import java.util.Scanner;

public class Point {

    Double width;
    Double height;
    Scanner s = new Scanner(System.in);
    //banai
    public Point(Double width, Double height){
        this.width = width;
        this.height = height;
    }
    //method 1
    public Point middle(Point x){
        Point y = new Point(s.nextDouble(),s.nextDouble());
        double width = (x.width + y.width)/2;
        double height = (x.height + y.height)/2;
        Point z = new Point(width, height);
        return z;
    }
    // method 2
    public Double distance(Point x){
        Point y = new Point(s.nextDouble(),s.nextDouble());
        return Math.sqrt(Math.pow((x.height - y.height),2)+Math.pow((x.width - y.width),2));
    }
    //method 3
    public Double areaSize(Point x, Point y){
        Point z = new Point(s.nextDouble(),s.nextDouble());
        return (x.width*(y.height-z.height)+y.width*(x.height-z.height)+ z.width*(x.height-y.height))/2;
    }
    //method 4
    public Double slope(){
        Point x = new Point(s.nextDouble(),s.nextDouble());
        return x.height/x.width;
    }
}
