package com.example.Pertemuan6;
//Praktikum 6.2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohInput {
    public static void main(String args[]){
        String nama = "";
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nama : ");
        try {
            nama = input.readLine();
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Nama Anda : " + nama);
    }
}
