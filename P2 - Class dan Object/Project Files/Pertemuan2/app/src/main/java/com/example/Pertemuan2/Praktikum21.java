package com.example.Pertemuan2;

class Lampu {
    boolean isOn;
    
    void turnOn(){
        isOn = true;
        System.out.println("Lampu menyala? " + isOn);
    }
    
    void turnOff(){
        isOn = false;
        System.out.println("Lampu menyala? " + isOn);
    }
}
public class Praktikum21 {
    public static void main(String[] args){
        Lampu led = new Lampu();
        Lampu halogen = new Lampu();
        
        led.turnOn();
        halogen.turnOff();
    }
}
