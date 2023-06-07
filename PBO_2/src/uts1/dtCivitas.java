package usd;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dtCivitas {
    ArrayList<Civitas> civitasList = new ArrayList<>();
        
    public dtCivitas(){

    }
    
    public void isi(Civitas data) {
        try {
            civitasList.add(data);
        } catch (Exception ex) {
            Logger.getLogger(dtCivitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void hapus(Civitas id) {
        try {
            civitasList.remove(id);
        } catch (Exception ex) {
            Logger.getLogger(dtCivitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean cari(Civitas id) {
        boolean ketemu = Boolean.FALSE;
        try {
            ketemu = civitasList.contains(id);
        } catch (Exception ex) {
            Logger.getLogger(dtCivitas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ketemu;
    }
 }
