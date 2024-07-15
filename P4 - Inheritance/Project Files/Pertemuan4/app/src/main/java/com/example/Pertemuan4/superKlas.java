package com.example.Pertemuan4;
//Bagian dari Contoh 4.2 - Super dan Sub Class
public class superKlas {
    private int nilaiSuper;
    public superKlas(int nilaiSuper){
        this.nilaiSuper = nilaiSuper;
    }
    public int getNilaiSuper(){
        return nilaiSuper;
    }
    private void methodPrivate(){
        System.out.println("Ini method private");
    }
    protected void methodProtected(){
        System.out.println("Ini method protected");
    }
}
