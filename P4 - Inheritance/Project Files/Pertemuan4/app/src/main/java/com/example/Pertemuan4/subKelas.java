package com.example.Pertemuan4;
//Bagian dari Contoh 4.2 - Super dan Sub Class
public class subKelas extends superKlas{
   private double nilaiSub;
   public subKelas(int nilaiSuper, double nilaiSub){
       super(nilaiSuper);
       this.nilaiSub = nilaiSub;
   }
   public void methodSub(){
       super.methodProtected();
       System.out.println("Nilai Super: "+super.getNilaiSuper());
       System.out.println("Nilai sub: "+this.nilaiSub);
   }
}
