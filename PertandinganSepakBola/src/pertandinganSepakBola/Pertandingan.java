package pertandinganSepakBola;

/**
 *
 * @author user
 */
public class Pertandingan {
    private Tim tim1;
    private Tim tim2;
    private int skor1;
    private int skor2;

    public Pertandingan(Tim tim1, Tim tim2) {
        this.tim1 = tim1;
        this.tim2 = tim2;
        this.skor1 = 0;
        this.skor2 = 0;
    }

    public void gol(Tim tim) {
        if (tim == tim1) {
            skor1++;
            System.out.println("Skor Berhasil Ditambahkan ke " + tim1.getNama());
        } else if (tim == tim2) {
            skor2++;
            System.out.println("Skor Berhasil Ditambahkan ke " + tim2.getNama());
        }
    }

    public void hasil() {
        System.out.println(tim1.getNama() + " " + skor1 + " - " + skor2 + " " + tim2.getNama());
        if (skor1 > skor2) {
            System.out.println("----------------------------");
            System.out.println("PEMENANGNYA ADALAH " + tim1.getNama() + "!!!");
            System.out.println("----------------------------");
        } else if ( skor1 == skor2){
            System.out.println("---------------------");
            System.out.println("PERTANDINGAN SERI!!!");
            System.out.println("---------------------");
        } else {
            System.out.println("----------------------------");
            System.out.println("PEMENANGNYA ADALAH " + tim2.getNama() + "!!!");
            System.out.println("----------------------------");
        }
}
    
    public void hasilSementara(){
        System.out.println(tim1.getNama() + " " + skor1 + " - " + skor2 + " " + tim2.getNama());
    }

    @Override
    public String toString() {
        return tim1.toString() + tim2.toString();
    }
}
