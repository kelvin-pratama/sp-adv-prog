package com.example.Pertemuan6;
//Praktikum 6.12
public class DemoThrows {
    public static void cobaEksepsi() throws IllegalAccessException{
        throw new IllegalAccessException("KESALAHAN: Illegal Access");
    }
    public static void main(String[] args){
        try{
            cobaEksepsi();
        }catch(Exception e){
            System.out.println("Eksepsi ditangkap disini....");
            System.out.println(e.getMessage());
        }
        System.out.println("Statement setelah blok try-catch");
    }
}
