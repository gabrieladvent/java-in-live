/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaKoleksi;

/**
 *
 * @author ACER
 */
public class BoxDemoGS {
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		integerBox.set(new Integer (10));
 		Integer someInteger = integerBox.get();    //tanpa casting
		System.out.println(someInteger);
	}    
}
class Box<T> {
    private T t;
    public void set(T t) { 
       this.t = t; 
    }
    public T get() { 
       return t; 
    }
}
