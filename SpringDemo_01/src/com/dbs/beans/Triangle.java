package com.dbs.beans;


public class Triangle {

//    point
    Point pointA;
    Point pointB;
    Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        System.out.println("setting a");
        this.pointA = pointA;
    }

    public Point getPointB() {

        return pointB;
    }

    public void setPointB(Point pointB) {
        System.out.println("setting b");
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        System.out.println("setting c");
        this.pointC = pointC;
    }


    @Override
    public String toString(){
        return "Triangle [pointA="+pointA+",pointB="+pointB+",pointC="+pointC+" ]";
    }
    public  Triangle (Point pointA, Point pointB, Point pointC){
    super();
    System.out.println("Constructor with Parrams");
    this.pointA=pointA;
        this.pointB=pointB;
        this.pointC=pointC;

    }
    public  Triangle(){
        super();
        System.out.println("Constructer without parrams");

    }
}
