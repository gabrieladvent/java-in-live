/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pbo1;

/**
 *
 * @author ACER
 */
public class JasaService implements Tagihan{
    private Mekanik mekanik;
    private String jenisService;
    private double harga;
    
    public JasaService(Mekanik mekanik, String jenisService, double harga) {
        this.mekanik = mekanik;
        this.jenisService = jenisService;
        this.harga = harga;
    }
    public String getJenisService() {
        return jenisService;
    }
    public void setJenisService(String jenisService) {
        this.jenisService = jenisService;
    }
    
    @Override
    public double getTagihan() {
        return harga;
    }
    public String toString(){
        return jenisService+ " \tRp." +harga;
    }
}
