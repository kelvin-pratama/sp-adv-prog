package com.example.Pertemuan5;

class BentukWajah {
    public String respons(){
        return "Perhatikan reaksi wajah saya";
    }
}
class Senyum extends BentukWajah {
    public String respons(){
        return "Senyum karena senang";
    }
}
class Tertawa extends BentukWajah {
    public String respons(){
        return "Tertawa karena gembira";
    }
}
class Marah extends BentukWajah {
    public String respons(){
        return "Kemarahan disebabkan bertengkar";
    }
}
class Sedih extends BentukWajah {
    public String respons(){
        return "Kesedihan disebabkan kecewa";
    }
}
public class Praktikum51 {
    public static void main(String args[]){
        BentukWajah objBentuk = new BentukWajah();
        Senyum objSenyum = new Senyum();
        Tertawa objTertawa = new Tertawa();
        Marah objMarah = new Marah();
        Sedih objSedih = new Sedih();
        
        BentukWajah[] Bentuk = new BentukWajah[5];
        Bentuk[0] = objBentuk;
        Bentuk[1] = objSenyum;
        Bentuk[2] = objTertawa;
        Bentuk[3] = objMarah;
        Bentuk[4] = objSedih;
        
        System.out.println("bentuk[0] : " + Bentuk[0].respons());
        System.out.println("bentuk[1] : " + Bentuk[1].respons());
        System.out.println("bentuk[2] : " + Bentuk[2].respons());
        System.out.println("bentuk[3] : " + Bentuk[3].respons());
        System.out.println("bentuk[4] : " + Bentuk[4].respons());
    }
}
