package com.example.Pertemuan4;

public class Praktikum41 {
    public static void main(String args[]){
        Dosen dosen = new Dosen();
        dosen.setNama("Fhatiah Adiba");
        dosen.setUmur(30);
        dosen.setNIP("0228079202");
        dosen.setMatakuliah("Pemrograman Lanjut");
        System.out.println("NIP dosen: "+ dosen.getNIP());
        dosen.mengajarApa();
        System.out.println();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Kelvin Pratama");
        mahasiswa.setUmur(21);
        mahasiswa.setNIM("20021050016");
        mahasiswa.setKelas("Network and Security");
        System.out.println("NIM Mahasiswa: "+ mahasiswa.getNIM());
        mahasiswa.kelasApa();
    }
}
