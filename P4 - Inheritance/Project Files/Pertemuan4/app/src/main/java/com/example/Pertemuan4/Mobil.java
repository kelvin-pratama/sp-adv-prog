package com.example.Pertemuan4;
//Bagian dari Tantangan
public class Mobil extends Kendaraan{
    private String kategori;
    private String model;
    public Mobil(String merek, int tahunProduksi, String kategori, String model){
        super(merek, tahunProduksi);
        this.kategori = kategori;
        this.model = model;
    }
    public String getKategori(){
        return this.kategori;
    }
    public String getModel(){
        return this.model;
    }
    public void tampilkanInformasi(){
        super.Informasi();
        System.out.println("Model: "+model);
        System.out.println("Kategori: "+kategori);
    }
}
