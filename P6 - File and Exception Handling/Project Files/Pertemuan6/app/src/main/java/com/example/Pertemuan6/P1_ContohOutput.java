package com.example.Pertemuan6;
//Praktikum 6.1
public class P1_ContohOutput {
    public static void main(String[] args) {
        int varInt = 45;
        double varDouble = 7.98845d;
        float varFloat = 6.97f;
        char varChar = 'X';
        String varString = "ini sebuah String";
        
        System.out.printf("%d\n", varInt);
        System.out.printf("%e\n", varDouble);
        System.out.printf("%f\n", varFloat);
        System.out.printf("%.2f\n", varFloat);
        System.out.printf("%c\n", varChar);
        System.out.printf("%.3s\n", varString);
        System.out.printf("%s\n", varString);
        
        System.out.println("======================");
        System.out.print("ini adalah ");
        System.out.print("contoh penggunaan print");
        
        System.out.println();
        System.out.println("======================");
        System.out.println("ini adalah ");
        System.out.println("contoh penggunaan print");
    }
}
