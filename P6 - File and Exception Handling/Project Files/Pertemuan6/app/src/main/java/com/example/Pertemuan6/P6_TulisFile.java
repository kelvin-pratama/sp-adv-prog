package com.example.Pertemuan6;
//Praktikum 6.6
import java.io.File;
import java.io.FileNotFoundException;

public class P6_TulisFile {
    public static void main(String args[]){
        File file = new File("java.txt");
        try{
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            output.println("Kelvin Pratama");
            output.println("Pemrograman Lanjut");
            output.println("Universitas Negeri Makassar");
            output.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

