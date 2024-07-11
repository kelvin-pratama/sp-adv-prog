package com.example.Pertemuan3;

class atas2 {
    public int a;
    protected int b;
    private String alamat;
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String tempString){
        alamat = tempString;
    }
}
public class Praktikum32 {
    public static void main(String args[]){
        atas2 objek = new atas2();
        objek.a = 2;
        objek.b = 3;
        objek.setAlamat("Makassar");
        System.out.println("Nilai a : " + objek.a);
        System.out.println("Nilai b : " + objek.b);
        System.out.println("Alamat : " + objek.getAlamat());
    }
}
