/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak2;

/**
 *
 * @author Tak Bertuan
 */
public class kantor {
    private Manager maneger;
    private Marketing marketing;
    private pegawai [] pegawai;
    private Honor [] honor;

    public Manager getManeger() {
        return maneger;
    }

    public void setManeger(Manager maneger) {
        this.maneger = maneger;
    }

    public Marketing getMarketing() {
        return marketing;
    }

    public void setMarketing(Marketing marketing) {
        this.marketing = marketing;
    }

    public pegawai[] getPegawai() {
        return pegawai;
    }

    public void setPegawai(pegawai[] pegawai) {
        this.pegawai = pegawai;
    }

    public Honor[] getHonor() {
        return honor;
    }

    public void setHonor(Honor[] honor) {
        this.honor = honor;
    }
    
    public double totalGaji (){
        return 0;
    }
}
