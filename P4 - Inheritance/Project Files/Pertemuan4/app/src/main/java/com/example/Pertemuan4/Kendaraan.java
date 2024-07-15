package com.example.Pertemuan4;
//Bagian dari Tantangan
public class Kendaraan {
    private String merek;
    private int tahunProduksi;
    public Kendaraan(String merek, int tahunProduksi){
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
    }
    public String getMerek(){
        return this.merek;
    }
    public int getTahunProduksi(){
        return this.tahunProduksi;
    }
    public void Informasi(){
        System.out.println("Merek: " + merek + ", Tahun Produksi: " + tahunProduksi);
    }
}
