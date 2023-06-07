/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;
/**
 *
 * @author ACER
 */

public class enumSwitch {
    enum agama{Hindu, Budha, Yahudi, Katolik, Kristen, Islam}
    public static void main(String[] args) {
        
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
           
        }
    }
}
