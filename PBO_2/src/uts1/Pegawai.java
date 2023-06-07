package usd;

public class Pegawai extends Civitas {
     private String nip;
     private double tinggibadan;
     
    public Pegawai() {
        super();
        this.nip="0000000";
        this.tinggibadan = 150.5;
    }
    
    public Pegawai(String idCivitas, String nama, String alamat, String hobi, int lama, String nip, double tinggibadan) {
        super(idCivitas, nama, alamat, hobi, lama);
        this.nip = nip;
        this.tinggibadan = tinggibadan;
    }
}
