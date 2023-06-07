package pertandinganSepakBola;

/**
 *
 * @author user
 */
public class Pemain {
    private String nama;
    private int nomorPunggung;
    private String posisi;

    public Pemain(String nama, int nomorPunggung, String posisi) {
        this.nama = nama;
        this.nomorPunggung = nomorPunggung;
        this.posisi = posisi;
    }

    public String getNama() {
        return nama;
    }

    public int getNomorPunggung() {
        return nomorPunggung;
    }

    public String getPosisi() {
        return posisi;
    }

    @Override
    public String toString() {
        return "Nama Pemain: " + nama + " | Nomor Punggung: " + nomorPunggung + " | Posisi: " + posisi;
    }
}
