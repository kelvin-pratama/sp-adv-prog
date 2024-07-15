package com.example.Pertemuan4;

public class Contoh42 {
    public static void main(String args[]){
        //bentuk objek superclass
        System.out.println("Objek superclass");
        superKlas sup = new superKlas(5);
        System.out.println("Nilai super: "+sup.getNilaiSuper());
        sup.methodProtected();
        
        //bentuk objek subclass
        System.out.println("\nObjek Subclass");
        subKelas sub = new subKelas(10, 9.5);
        System.out.println("Pemanggilan method superclass dari objek subclass");
        System.out.println("Nilai super: "+sub.getNilaiSuper());
        sub.methodProtected();
        System.out.println("Pemanggilan method superclass dari subclass");
        sub.methodSub();
    }
}
