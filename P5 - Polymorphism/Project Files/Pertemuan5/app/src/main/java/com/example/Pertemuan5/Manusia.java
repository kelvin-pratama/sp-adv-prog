package com.example.Pertemuan5;
//Bagian dari Praktikum 4.1
public class Manusia {
    protected String nama;
    protected int umur;
    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getUmur(){
        return this.umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void siapaKamu(){
        System.out.println("Saya manusia");
    }
}
