package com.example.Pertemuan2;

class Lingkaran {
    public double hitungLuas(float jarijari){
        final double PI = 3.141592653d;
        double luas = (PI * jarijari * jarijari);
        return luas;
    }
}

class Segitiga {
    public double hitungLuas(float alas, float tinggi){
        double luas = (alas * tinggi) / 2.0d;
        return luas;
    }
}

public class Tantangan {
    public static void main(String[] args){
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        
        double luasSegitigaBiru = segitiga.hitungLuas(6.74f, 6.74f);
        double luasSetengahLingkaranAbu = lingkaran.hitungLuas(4/2) / 2.0d;
        double luasLingkaranBiru = lingkaran.hitungLuas(2/2);
        
        //dari gambar tsb -> luasSegitigaBiru - luasSetengahLingkaranAbu + luasLingkaranBiru
        double hasil = luasSegitigaBiru - luasSetengahLingkaranAbu + luasLingkaranBiru;
        System.out.println("Luas area segitiga biru - setengah lingkaran abu: " + (luasSegitigaBiru - luasSetengahLingkaranAbu));
        System.out.println("Luas lingkaran biru: " + luasLingkaranBiru);
        System.out.println("Luas area yang berwarna biru adalah: "+ hasil);
    }
}
