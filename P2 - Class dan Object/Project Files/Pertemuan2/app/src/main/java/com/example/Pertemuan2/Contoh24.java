package com.example.Pertemuan2;

class aritmatika {
    public static int penjumlahan(int a, int b){
        return a + b;
    }
}
public class Contoh24 {
    public static void main(String[] args){
        int x = 5, y = 6;
        int s = aritmatika.penjumlahan(x, y);
        System.out.print("hasil penjumlahan = " + s);
    }
}
