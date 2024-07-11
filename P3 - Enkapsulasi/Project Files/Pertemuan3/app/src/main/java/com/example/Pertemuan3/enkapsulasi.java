package com.example.Pertemuan3;
//file ini bagian dari Praktikum 3.3
public class enkapsulasi {
    private int alas, tinggi;
    private double luasSegitiga;
    
    public void setAlas(int alas){
        this.alas = alas;
    }
    
    public int getAlas(){
        return this.alas;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public int getTinggi(){
        return this.tinggi;
    }
    
    public void setLuasSegitiga(int alas, int tinggi){
        this.luasSegitiga = 0.5 * (double)(alas * tinggi);
    }
    
    public double getLuasSegitiga(){
        return this.luasSegitiga;
    }
}
