package usd;

public class Civitas {
    protected String idCivitas;
    protected String nama;
    protected String alamat;
    protected String hobi;
    protected int lama;

    public Civitas() {
        this.idCivitas = "0000000";
        this.nama="noname";
        this.alamat="none";
        this.hobi="none";
        this.lama = 0;
    }

    public Civitas(String idCivitas, String nama, String alamat, String hobi, int lama) {
        this.idCivitas = idCivitas;
        this.nama = nama;
        this.alamat = alamat;
        this.hobi = hobi;
        this.lama = lama;
    }
    
}
