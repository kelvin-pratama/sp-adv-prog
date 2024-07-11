package com.example.Pertemuan3;

class mahasiswa3 {
    private int nim;
    private String nama;
    public mahasiswa3(String m){
        nim = 0;
        nama = "";
    }
    
    public mahasiswa3(int n, String m){
        nim = n;
        nama = m;
    }
}
public class Contoh33 {
    public static void main(String args[]){
        mahasiswa3 mhsa = new mahasiswa3("Kelvin");
        mahasiswa3 mhsb = new mahasiswa3(5122, "Kelvin");
    }
}
