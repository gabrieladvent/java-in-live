/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL_6A;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class aganabinput {
        enum agama{Hindu, Budha, Yahudi, Katolik, Kristen, Islam}
    public static void main(String[] args) {
    Scanner bie = new Scanner(System.in);
    
        agama agamaString = agama.Katolik;
        System.out.println(agamaString);
        switch (agamaString) {
            case Hindu:
                System.out.println("Kitab Suci: Veda");
                System.out.println("Nabi      : -");
                break;
                
            case Budha:
                System.out.println("Kitab suci: Tripitaka");
                System.out.println("Nabi      : Sidarta Gautama");
                break;
                
            case Yahudi:
                System.out.println("Kitab suci: Taurat");
                System.out.println("Nabi      : Musa");
                break;
                
            case Katolik:
                System.out.println("Kitab suci: Injil");
                System.out.println("Nabi      : Yesus");
                break;
                
            case Kristen:
                System.out.println("Kitab suci: Injil");
                System.out.println("Nabi      : Yesus");
                break;
                
            case Islam:
                System.out.println("Kitab suci: Al-Quran");
                System.out.println("Nabi      : Muhammad");
                break;
            
            default: System.out.println("INVALID!!!");
        }
    }
}

