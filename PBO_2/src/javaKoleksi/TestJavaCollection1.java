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
import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection1 {
	public static void main(String args[]){  
		ArrayList<String> list = new ArrayList<String>();
		list.add("Yosefino"); 
		list.add("Mario");  
		list.add("Fernando");  
		list.add("Witin");  
		//Traversing list through Iterator  
		Iterator itr = list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
    
}
