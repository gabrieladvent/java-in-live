/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandling2;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author hertada
 */
public class cthArrayListAngka {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    for (int i : myNumbers) {
      System.out.println(i);
    
    Collections.sort(myNumbers);  // Sort myNumbers
    for (int j : myNumbers) {
      System.out.println(i);
    }
    }
  }
    
}
