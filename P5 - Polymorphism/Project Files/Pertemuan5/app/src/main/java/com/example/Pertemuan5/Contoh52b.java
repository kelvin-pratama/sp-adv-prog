package com.example.Pertemuan5;

class binatang {
    int umur = 12;
    int get_umur (){
        return umur;
    }
}
public class Contoh52b extends binatang {
    int umur = 20;
    int get_umur(){
        return 25;
    }
    public static void main (String args[]){
        Contoh52b h = new Contoh52b();
        System.out.println(h.get_umur());
    }
}
