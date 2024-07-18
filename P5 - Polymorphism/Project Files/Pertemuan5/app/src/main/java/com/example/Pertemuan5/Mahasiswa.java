package com.example.Pertemuan5;
//Bagian dari Praktikum 4.1
public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;
    public String getNIM(){
        return this.nim;
    }
    public void setNIM(String nim){
        this.nim = nim;
    }
    public String getKelas(){
        return this.kelas;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public void kelasApa(){
        System.out.println("Saya " + nama + 
                           " umur " + umur +
                           " mahasiswa di kelas " + kelas);
    }
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
}
