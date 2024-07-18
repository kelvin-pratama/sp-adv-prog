package com.example.Pertemuan5;

class binatang {
    int umur = 12;
    int get_umur (){
        return umur;
    }
}
public class Contoh52a extends binatang {
    int umur = 20;
    public static void main(String args[]) {
        Contoh52a h = new Contoh52a();
        System.out.println(h.umur);
    }
}
