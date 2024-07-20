package com.example.Pertemuan6;
//Praktikum 6.7
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P7_BacaFile {
    public static void main(String args[]){
        File file = new File(("java.txt"));
        try {
            Scanner input = new Scanner(file);
            input.useDelimiter("\n");
            while(input.hasNext()){
                String nama = input.next();
                String mk = input.next();
                String pt = input.next();
                System.out.println("Nama: " + nama);
                System.out.println("Mata Kuliah: " + mk);
                System.out.println("Perguruan Tinggi: " + pt);
            }
            input.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
