/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanusd;

/**
 *
 * @author Katharina Tyas
 */
public class Mahasiswa extends Peminjam {
    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getdenda(){
        return getTelatPengembalian() * 50000;
    }
}
