package org.example.test;

import org.example.figures.Cercle;
import org.example.figures.Point;

public class App {
    public static void main(String[] args) {
        Cercle c1=new Cercle(new Point(100,100),50);
        Cercle c2=new Cercle(new Point(120,120),new Point(400,400));
        System.out.println("perimetre de c1 est :   "+c1.getPerimetre());
        System.out.println("surface de "+c2+" est :"   +c2.getSurface());
        Point p1=new Point(125,125);
        if((c1.appartient(p1)&&(c2.appartient(p1)))){
            System.out.println(p1+"n'apprtient pas à "+c1+ "et"+c2);}
        else {System.out.println(p1+"apprtient  à "+c1+ "et"+c2);}
        Point p2=new Point(20,20);
        if((c1.appartient(p2)&&(c2.appartient(p2)))){
            System.out.println(p2+"napprtient pas à "+c1+ "et"+c2);}
        else {System.out.println(p2+"apprtient  à "+c1+ "et"+c2);}




    }


}
