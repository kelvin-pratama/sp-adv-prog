package com.example.Pertemuan6;
//Praktikum 6.9
public class ContohEksepsi2 {
    public static void main(String[] args){
        int pembilang = 7;
        int penyebut = 0;
        try {
            int hasil = pembilang / penyebut;
            System.out.println("Hasil = " + hasil);
        } catch (Exception e){
            System.out.println("KESALAHAN: " + "Terdapat pembagian dengan nol");
        }
        System.out.println("Statement setelah blok trycatch");
    }
}
