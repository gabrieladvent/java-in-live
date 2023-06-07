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
public class Main {
    public static void main(String[] args){
        Pelanggan pelanggan1 = new Pelanggan("Gabriel", 212);
        Pelanggan pelanggan2 = new Pelanggan();
        pelanggan2.setNama("Gabriel Advent");
        pelanggan2.setNomor(112);
        
        DetailService detailService1  = new DetailService("Id_Service_1", pelanggan1);
        detailService1.setPelanggan(pelanggan1);
        
        Mekanik mekanik1 = new Mekanik ("507", "Sertifikat_Otomotif_1");
        Administrasi admin1 = new Administrasi();
        admin1.setNIK("NIK_Admin_1");
        admin1.setSertifKompt("Sertifikat Komputer 1 ");
        
        SparePart sparePart1 = new SparePart("Spare_Part_1", 75000, 2);
        JasaService jasaService1 = new JasaService(mekanik1, "Service_Ringan", 200000);
        DetailService detailService2 = new DetailService(10);
        detailService2.setIdService("Id Service 2");
        detailService2.setPelanggan(pelanggan2);
        
        detailService2.addTagihan(sparePart1);
        detailService2.addTagihan(jasaService1);
        SparePart sparePart2 = new SparePart("Spare Part 2", 15000, 1);
        JasaService jasaService2 = new JasaService(mekanik1, "Service_AC", 300000);
        detailService2.addTagihan(sparePart2);
        detailService2.addTagihan(jasaService2);
        SparePart sparePart3 = new SparePart("Spare Part 3", 5000, 5);
        JasaService jasaService3 = new JasaService(mekanik1, "Service_Rem", 100000);
        detailService2.addTagihan(sparePart3);
        detailService2.addTagihan(jasaService3);
        SparePart sparePart4 = new SparePart("Spare Part 4", 15000, 1);
        detailService2.addTagihan(sparePart4);
        detailService2.printDetailService();
    }
}

