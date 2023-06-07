/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO;

/**
 *
 * @author Tak Bertuan
 */
//import java.util.Random;
//
//
//public class randa {
//    private static double[] anArray;
//    
//    public static double[] list(){
//        anArray = new double[10];   
//        return anArray;
//    }
//
//    public static void print(){
//        for(double n: anArray){
//        System.out.println(n+" ");
//        }
//    }
//
//
//    public static double randomFill(){
//    Random Rand = new Random();
//    int randomNum = Rand.nextInt();
//    return randomNum;
//    }
//
//    public static void main(String args[]) {
//        list();
//print();
//    }
//}
public class randa {
    public static void main(String[] args) {
        int[] _tamp = new int [10];
        for (int i = 0; i < _tamp.length; i++) {
            _tamp [i]= (int) (Math.random() * 100);// * range) + max;
            System.out.println(_tamp[i]);
        }
        for (int i = 0; i < _tamp.length; i++) {
            System.out.println(_tamp [i]);
        }
    }
}