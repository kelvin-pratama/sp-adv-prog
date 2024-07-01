package com.example.Pertemuan2;
import java.util.Scanner;

public class Praktikum22 {
    final double PHI = 3.14d;
    double jariJari;
    double tinggi;
    
    public static void main(String[] args){
        Praktikum22 kerucut = new Praktikum22();
        Scanner bacaInput = new Scanner(System.in);
        
        System.out.print("Masukkan nilai jari-jari alas kerucut: ");
        kerucut.jariJari = bacaInput.nextDouble();
        
        System.out.print("Masukkan nilai tinggi kerucut: ");
        kerucut.tinggi = bacaInput.nextDouble();
        
        double nilaiVolume = kerucut.volumeKerucut(kerucut.PHI, kerucut.jariJari, kerucut.tinggi);
        System.out.print("Volume kerucut: " + nilaiVolume);
    }
    
    public double alasKerucut(double phi, double r){
        double luasAlas = phi * Math.pow(r, 2);
        return luasAlas;
    }
    
    public double volumeKerucut(double phi, double r, double tinggi){
        double volume = (alasKerucut(phi, r)*tinggi)/3.0;
        return volume;
    }
}
