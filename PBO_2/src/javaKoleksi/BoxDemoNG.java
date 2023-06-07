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
public class BoxDemoNG {
	public static void main(String[] args) {
		Box integerBox = new Box();
		integerBox.set(new Integer(10));
 		Integer someInteger = (Integer)integerBox.get();
		System.out.println(someInteger);
	}
}
class Box {
    private Object object;
    public void set(Object object) { 
       this.object = object; 
    }
    public Object get() { 
       return object; 
    }
}
