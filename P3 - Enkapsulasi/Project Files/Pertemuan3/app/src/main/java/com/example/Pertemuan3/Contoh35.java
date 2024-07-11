package com.example.Pertemuan3;

class mahasiswa5{
    String nama;
    String getNama(){
        return nama;
    }
}
public class Contoh35 {
    public static void main(String args[]){
        mahasiswa5 mhs = new mahasiswa5();
        mhs.nama = "Kelvin";
        System.out.println(mhs.getNama());
    }
}
