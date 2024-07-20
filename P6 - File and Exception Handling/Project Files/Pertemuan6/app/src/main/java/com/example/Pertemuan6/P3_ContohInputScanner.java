package com.example.Pertemuan6;
//Praktikum 6.3
import java.util.Scanner;

public class P3_ContohInputScanner {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("Nama Anda : " + nama);
    }
}
