package org.example.figures;

public class Cercle {
    private Point centre;
    private  double rayon;
    public Cercle(Point c,double r) {
        this.centre = c;
        this.rayon= r;
    }
    public Cercle(Point c,Point p){
        this.centre=c;
        int a=p.x;
        int b=p.y;
         this.rayon=centre.distance(p);
    }
    public double getSurface(){
        return Math.PI*rayon*rayon;
    }
    public double getPerimetre(){
        return 2*Math.PI*rayon;
    }
    public  String toString(){
        return ("Cercle("+centre.x+","+centre.y+","+rayon+")");
    }
    public boolean appartient(Point p){
        double d=centre.distance(p);
        return (d<rayon);
    }

}
