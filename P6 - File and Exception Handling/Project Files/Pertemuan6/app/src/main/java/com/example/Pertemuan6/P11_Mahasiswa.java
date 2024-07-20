package com.example.Pertemuan6;
//Praktikum 6.11
class DemoThrow {
    private String nim;
    private String nama;
    
    public void setNIM(String inputNIM){
        try{
            if(inputNIM == null){
                throw new NullPointerException();
            }
            nim = inputNIM;
        }catch (NullPointerException npe){
            System.out.println("KESALAHAN: NIM tidak boleh null");
        }
    }
    public String getNIM(){
        return nim;
    }
    public void setNama(String inputNama){
        try{
            if(inputNama == null){
                throw new NullPointerException();
            }
            nama = inputNama;
        }catch(NullPointerException npe){
            System.out.println("KESALAHAN: Nama mahasiswa tidak boleh null");
        }
    }
    public String getNama(){
        return nama;
    }
}
public class Mahasiswa{
    public static void main(String[] args){
        DemoThrow mhs = new DemoThrow();
        mhs.setNIM(null);
        mhs.setNama("Kelvin");
        System.out.println("\nNIM : " + mhs.getNIM());
        System.out.println("Nama: "+ mhs.getNama());
    }
}