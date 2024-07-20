package com.example.Pertemuan6;
//Praktikum 6.13
public class DemoFinally {
    public static void cobaEksepsi(int pembilang, int penyebut){
        try{
            int hasil = pembilang / penyebut;
            System.out.println("Hasil bagi: " + hasil);
            int[] Arr = {1,2,3,4,5};
            Arr[10] = 23;
        }catch(ArithmeticException eksepsi1){
            System.out.println("Terdapat pembagian dengan 0");
        }catch(ArrayIndexOutOfBoundsException eksepsi2){
            System.out.println("Indeks di luar rentang");
        }finally {
            System.out.println("Ini adalah statement dalam blok finally");
        }
    }
    public static void main(String[] args){
        cobaEksepsi(4,0);
        System.out.println();
        cobaEksepsi(12,3);
    }
}
