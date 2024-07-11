package com.example.Pertemuan3;

class atas{
    public int a;
    protected int b;
    private int c;
}
public class Praktikum31 {
    public static void main(String args[]){
        atas objek = new atas();
        objek.a = 2;
        objek.b = 3;
        System.out.println("Nilai a : " + objek.a);
        System.out.println("Nilai b : " + objek.b);
    }
}
