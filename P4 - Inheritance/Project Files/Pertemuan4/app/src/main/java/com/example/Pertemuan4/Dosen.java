package com.example.Pertemuan4;
//Bagian dari Praktikum 4.1
public class Dosen extends Manusia {
    private String nip;
    private String matakuliah;
    public String getNIP(){
        return this.nip;
    }
    public void setNIP(String nip){
        this.nip = nip;
    }
    public String getMatakuliah(){
        return this.matakuliah;
    }
    public void setMatakuliah(String matakuliah){
        this.matakuliah = matakuliah;
    }
    public void mengajarApa(){
        System.out.println("Saya " + nama + 
                           " umur " + umur + 
                           " mengajar " + matakuliah);
    }
}
