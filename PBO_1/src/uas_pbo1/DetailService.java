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
public class DetailService {
    private String idService;
    private Pelanggan pelanggan;
    private Tagihan[] tagihan;
    private int maxTagihan;
    private int tagihanKe;
    private double totalPart;
    private double totalService;

    public DetailService(String idService, Pelanggan pelanggan) {
        this.idService = idService;
        this.pelanggan = pelanggan;
    }

    public DetailService(int maxTagihan) {
        tagihan = new Tagihan[maxTagihan];
    }
    public void addTagihan(Tagihan tagi) {
        if (tagi instanceof JasaService) {
            tagihan[tagihanKe] = (JasaService) tagi;
            tagihanKe++;
        }
        if (tagi instanceof SparePart) {
            tagihan[tagihanKe] = (SparePart) tagi;
            tagihanKe++;
        }
    }
    public void setIdService(String idService) {
        this.idService = idService;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
    public String getIdService() {
        return idService;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void printDetailService() {
        double total;
        double a, b = 0, c, d = 0;
        System.out.println("Bengkel Otomotif" +" Gabriel Advent "+" 205314096");
        System.out.println("=============================================");
        System.out.println("");
        System.out.println("Id Service : "+idService);
        System.out.println("Pelanggan  : Bpk/Ibu/Sdr "+pelanggan.getNama()+" No. Member : "+pelanggan.getNomor());
        System.out.println("");
        System.out.println("--------------------------- Detail Service ---------------------------");
        System.out.println("[Biaya Spare Part]");
        for(int i = 0; i < tagihan.length; i++){
            if(tagihan[i] instanceof SparePart){
                System.out.println(tagihan[i].toString());
            a = tagihan[i].getTagihan();
            b = b + a;
            }
        }
        System.out.println("----------------------------------");
        System.out.println("Total Spare Part : " + b);
        System.out.println("");
        System.out.println("[Biaya Service]");
        for(int i = 0; i < tagihan.length; i++){
            if(tagihan[i] instanceof JasaService){
                System.out.println(tagihan[i].toString());
            c = tagihan[i].getTagihan();
            d = d + c;
            }
        }
        System.out.println("----------------------------------");
        System.out.println("Total Service : " + d);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Grand Total : " + (b + d));
    }



  

}
