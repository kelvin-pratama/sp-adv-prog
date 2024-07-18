package com.example.Pertemuan5;

public class Contoh54 {
    public static void ulangiHalo(){
        for(int i = 1; i <= 3; i++)
            System.out.println("Halo");
    }
    public static void ulangiHalo(int berapakali){
        for(int i = 1; i <= berapakali; i++)
            System.out.println("Halo overloading");
    }
    public static void main(String args[]){
        ulangiHalo();
        System.out.println();
        
        ulangiHalo(4);
    }
}
