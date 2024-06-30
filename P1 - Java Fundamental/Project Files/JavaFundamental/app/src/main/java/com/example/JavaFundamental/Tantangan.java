package com.example.JavaFundamental;
import java.util.Scanner;

public class Tantangan {
    public static float volumeBalok(float panjang, float lebar, float tinggi){
        float volume = panjang * lebar * tinggi;
        return volume;
    }
    
    public static float volumeKubus(float sisi){
        float volume = sisi * sisi * sisi;
        return volume;
    }
    
    public static double volumeKerucut(float jarijari, float tinggi){
        final double PI = 3.141592653d;
        double volume = (PI * jarijari * jarijari * tinggi) / 3;
        return volume;
    }
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        while(true){
            System.out.println("==========MENGHITUNG VOLUME BANGUN RUANG==========");
            System.out.println("Pilih jenis bangun ruang: ");
            System.out.println("1. Balok");
            System.out.println("2. Kubus");
            System.out.println("3. Kerucut");
            System.out.println("4. Keluar dari aplikasi ini");
            System.out.println("==================================================");
            System.out.print("Masukkan pilihan: ");
            int pilihan = console.nextInt();
            
            if(pilihan == 1){
                float panjang, lebar, tinggi;
                System.out.print("Masukkan panjang Balok: ");
                panjang = console.nextFloat();
                
                System.out.print("Masukkan lebar Balok: ");
                lebar = console.nextFloat();
                
                System.out.print("Masukkan tinggi Balok: ");
                tinggi = console.nextFloat();
                
                System.out.print("Volume balok adalah: ");
                System.out.println(volumeBalok(panjang,lebar,tinggi));
                System.out.println();
            } else if (pilihan == 2){
                float sisi;
                System.out.print("Masukkan sisi kubus: ");
                sisi = console.nextFloat();
                
                System.out.print("Volume kubus adalah: ");
                System.out.println(volumeKubus(sisi));
                System.out.println();
            } else if (pilihan == 3){
                float jarijari, tinggi;
                System.out.print("Masukkan jari-jari Kerucut: ");
                jarijari = console.nextFloat();
                
                System.out.print("Masukkan tinggi Kerucut: ");
                tinggi = console.nextFloat();
                
                System.out.print("Volume Kerucut adalah: ");
                System.out.println(volumeKerucut(jarijari, tinggi));
                System.out.println();
            } else if (pilihan == 4){
                System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        
    }
}
