package pertandinganSepakBola;

/**
 *
 * @author user
 */
public class Tim {
    private String nama;
    private Pemain[] daftarPemain;
    private int jumlahPemain;
    
    public Tim(String nama) {
        this.nama = nama;
        this.jumlahPemain = 0;
        this.daftarPemain = new Pemain[11];
    }

    public void tambahPemain(Pemain pemain) {
        if (jumlahPemain < 11) {
            daftarPemain[jumlahPemain] = pemain;
            jumlahPemain++;
        } else {
            System.out.println("Kuota pemain sudah penuh.");
        }
    }

    public String getNama() {
        return nama;
    }

    public Pemain[] getDaftarPemain() {
        return daftarPemain;
    }

    public int getJumlahPemain() {
        return jumlahPemain;
    }

    @Override
    public String toString() {
        System.out.println("Nama Tim: " + nama + " | Jumlah Pemain: " + jumlahPemain);
        for (int i = 0; i < jumlahPemain; i++) {
            System.out.println(daftarPemain[i]);
        }
        System.out.println("");
        return "";
    }
}
