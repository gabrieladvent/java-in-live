/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_2;
public class segitiga1 {
public double x1, y1, x2, y2, x3, y3, tinggi;

/*segitiga1() {
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.x3 = x3; this.y3 = y3;
        this.tinggi = tinggi;
}

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

public double getx1 () {
    return x1;
}
    public void setx1 (double x1) {
    this.x1 = x1;
}
public double gety1 () {
    return y1;
}
    public void sety1 (double y1) {
    this.y1 = y1;
}
public double getx2 () {
    return x2;
}
    public void setx2 (double x2) {
    this.x2 = x2;
}
public double gety2 () {
    return y2;
}
    public void sety2 (double y2) {
    this.y2 = y2;
}
public double getx3 () {
    return x3;
}
    public void setx3 (double x3) {
    this.x3 = x3;
}
public double gety3 () {
    return y3;
}
    public void sety3 (double y3) {
    this.y3 = y3;
} */
    public double hitungSisi (double xa, double ya, double xb, double yb){
        return Math.sqrt( Math.pow(xa-xb, 2) + Math.pow(ya-yb,2));
 }

 public double hitungKelilingalas(){
        return hitungSisi(x1,y1,x2,y2) + hitungSisi(x2,y2,x3,y3)+ hitungSisi(x3,y3,x1,y1);
 }

 public double hitungLuasalas(){
        double s = hitungKelilingalas();
        return Math.sqrt(s * (s-hitungSisi(x1,y1,x2,y2)) * (s-hitungSisi(x2,y2,x3,y3)) * (s-hitungSisi(x3,y3,x1,y1)));
 }
 public double luasPrisma(){
     double total;
    return total = (2 * hitungLuasalas() + hitungKelilingalas() * tinggi);
 }
}
