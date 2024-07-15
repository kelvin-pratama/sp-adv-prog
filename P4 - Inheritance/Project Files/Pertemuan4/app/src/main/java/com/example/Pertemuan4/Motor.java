package com.example.Pertemuan4;
//Bagian dari Tantangan
public class Motor extends Kendaraan{
    private int ukuranSilinder;
    private String model;
    public Motor(String merek, int tahunProduksi, int ukuranSilinder, String model){
        super(merek, tahunProduksi);
        this.ukuranSilinder = ukuranSilinder;
        this.model = model;
    }
    public int getUkuranSilinder(){
        return this.ukuranSilinder;
    }
    public String getModel(){
        return this.model;
    }
    public void tampilkanInformasi(){
        super.Informasi();
        System.out.println("Model: "+model);
        System.out.println("Ukuran silinder: " + ukuranSilinder + " cc");
    }
}
