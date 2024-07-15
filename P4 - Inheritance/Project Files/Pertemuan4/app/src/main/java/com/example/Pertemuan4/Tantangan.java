package com.example.Pertemuan4;

public class Tantangan {
    public static void main(String args[]){
        Mobil mobil = new Mobil("Toyota", 2007, "Sedan", "Accord 7th Gen");
        Motor motor = new Motor("Honda", 2015, 110, "Beat Sporty");
        
        System.out.println("Informasi mobil: ");
        mobil.tampilkanInformasi();
        System.out.println();
        
        System.out.println("Informasi motor: ");
        motor.tampilkanInformasi();
    }
}
