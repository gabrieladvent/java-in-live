/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO1;

/**
 *
 * @author Tak Bertuan
 */
public class teat {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public boolean am (int c){
        boolean u = true;
        do{
            if (a > c){
                u = false;
            }
        } while (a <= c);
        return u;
    }
    
    public static void main(String[] args) {
        
    }
}
