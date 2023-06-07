/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author ACER
 */
public class satelit_205314096 extends Telepon{
    private String paketSli;
    private String fitur;

satelit_205314096 (){}
public satelit_205314096 (String paketSli, String fitur){
    this.paketSli = paketSli;
    this.fitur = fitur;
}

    /**
     * @return the paketSli
     */
    public String getPaketSli() {
        return paketSli;
    }

    /**
     * @param paketSli the paketSli to set
     */
    public void setPaketSli(String paketSli) {
        this.paketSli = paketSli;
    }

    /**
     * @return the fitur
     */
    public String getFitur() {
        return fitur;
    }

    /**
     * @param fitur the fitur to set
     */
    public void setFitur(String fitur) {
        this.fitur = fitur;
    }

    @Override
    public String toString() {
        return "satelit_205314096{" + "paketSli=" + paketSli + ", fitur=" + fitur + '}';
    }

}
