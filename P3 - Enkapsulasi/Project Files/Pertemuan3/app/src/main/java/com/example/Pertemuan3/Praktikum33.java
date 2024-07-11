package com.example.Pertemuan3;

public class Praktikum33 {
    public static void main(String args[]){
        enkapsulasi ob = new enkapsulasi();
        ob.setAlas(5);
        ob.setTinggi(7);
        System.out.println("Alas Segitiga : " + ob.getAlas());
        System.out.println("Tinggi Segitiga : " + ob.getTinggi());
        ob.setLuasSegitiga(ob.getAlas(), ob.getTinggi());
        System.out.println("Luas Segitiga : " + ob.getLuasSegitiga());
    }
}
