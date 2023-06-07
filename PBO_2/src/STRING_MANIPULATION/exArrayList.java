/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package STRING_MANIPULATION;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
import java.util.List;
 
public class exArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(3);
        list.add(5);
        list.add(0);
         
        try{
            int x = (int) list.get(1);
            int y = (int) list.get(2);
            System.out.println("Pembagian "+ x + "/" +y+ " adalah: "+(x/y));
                         
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally{
            System.out.println("I will be executed, no matter what :-)");
        }
         
    }
}
