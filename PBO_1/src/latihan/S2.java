/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author ACER
 */
public class S2 extends Mahasiswa {

    @Override
    public String getTampilHuruf() {
        for (int i = 0; i < super.getHitungNilai(); i++) {
            if (super.getHitungNilai() >= 85) {
                tampilHuruf = "A";
            } else if ((super.getHitungNilai() <= 70) && (super.getHitungNilai() < 85)) {
                tampilHuruf = "B";
            } else if ((super.getHitungNilai() <= 56) && (super.getHitungNilai() < 70)) {
                tampilHuruf = "C";
            } else if ((super.getHitungNilai() <= 45) && (super.getHitungNilai() < 56)) {
                tampilHuruf = "D";
            } else if (super.getHitungNilai() < 45) {
                tampilHuruf = "E";
            }
        }
        return tampilHuruf;
    }

    @Override
    public double getCourseGrade() {
    return getHitungNilai();
    }
}
