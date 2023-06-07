/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praaktikumBerapa;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author Tak Bertuan
 */
public class Enkripsi {
public String makeHash(String message) throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    md.update(message.getBytes());
    byte[] digest = md.digest();
    StringBuffer hexString = new StringBuffer();
    for (int i = 0; i < digest.length; i++) {
        hexString.append(Integer.toHexString(0xFF & digest[i]));
    }
    return hexString.toString();
}
}
