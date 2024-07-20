package com.example.Pertemuan6;
//Praktikum 6.5
public class P5_ContohFile {
    public static void main(String args[]){
        java.io.File file = new java.io.File(("java.txt"));
        try{
            if (file.createNewFile())
                System.out.println("File berhasil dibuat");
            else
                System.out.println("File Gagal di Buat");
        } catch (Exception e){
            System.out.println("Error");
        }
        System.out.println("Apakah file ada? " + file.exists());
        System.out.println("Apakah file bisa dibaca? " + file.canRead());
        System.out.println("Apakah file bisa ditulis? " + file.canWrite());
        System.out.println("Apakah berupa direktori? " + file.isDirectory());
        System.out.println("Apakah berupa file? " + file.isFile());
        System.out.println("Apa namanya? " + file.getName());
        System.out.println("Dimana lokasinya? " + file.getPath());
        System.out.println("Dimana lokasi lengkapnya? " + file.getAbsolutePath());
    }
}
