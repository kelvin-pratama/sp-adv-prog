package com.example.Pertemuan5;

class binatang3 {
    int umur = 12;
    int get_umur(){
        return umur;
    }
}
public class Contoh53 extends binatang3 {
    @Override
    int get_umur(){
        return super.get_umur();
    }
    public static void main(String args[]){
        Contoh53 h = new Contoh53();
        System.out.println(h.get_umur());
    }
}
