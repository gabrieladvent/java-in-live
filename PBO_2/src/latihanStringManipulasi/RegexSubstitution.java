/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanStringManipulasi;

/**
 *
 * @author ACER
 */
public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "Saya suka pemrograman Jawa";
 String secondString = "Fany pergi ke pasar 3 jam lalu, bersama 4 temannya";

 System.out.printf( "Original String 1: %s\n", firstString );
 firstString = firstString.replaceAll( "\\bsuka\\b", "dan semua mahasiswa cinta" );
 System.out.printf("Original String 1 menjadi : %s\n\n", firstString );
 System.out.printf( "Original String 2: %s\n", secondString );
   secondString = secondString.replaceAll( "[a]", "o" );
 System.out.printf("Original String 2 menjadi : %s\n\n", secondString );
 System.out.printf( "Setiap kata diganti dengan \"kodok\": %s\n\n",
 firstString.replaceAll( "\\w+", "kodok" ));
 secondString = secondString.replaceFirst( "\\d", "angka" );
 System.out.printf("?? %s\n", secondString ); //isi ?? dengan kalimat yang sesuai
 String output = "String dipisah pada tanda koma: [";
 String[] results = secondString.split( ",\\s*" );
 for ( String string : results ) output += "\"" + string + "\", ";
 System.out.println( "Hasil split : "+output );
 output = output.substring( 0, output.length() - 2 ) + "]";
 System.out.println( output );

    }
}
