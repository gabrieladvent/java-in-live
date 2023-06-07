package pertandinganSepakBola;

/**
 *
 * @author user
 */
public class Sekolah {
    private String nama;
    private Tim[] daftarTim;
    private int jumlahTim;

    public Sekolah(String nama) {
        this.nama = nama;
        this.jumlahTim = 0;
        this.daftarTim = new Tim[10];
    }

    public void tambahTim(Tim tim) {
        if (jumlahTim < 10) {
            daftarTim[jumlahTim] = tim;
            jumlahTim++;
        } else {
            System.out.println("Kuota tim sudah penuh.");
        }
    }

    public Tim cariTim(String nama) {
        for (int i = 0; i < jumlahTim; i++) {
            if (daftarTim[i].getNama().equals(nama)) {
                return daftarTim[i];
            }
        }
        return null;
    }

    public String getNama() {
        return nama;
    }
}
