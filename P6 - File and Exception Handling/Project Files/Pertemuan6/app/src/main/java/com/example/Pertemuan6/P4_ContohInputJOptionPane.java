package com.example.Pertemuan6;
//Praktikum 6.4
import javax.swing.JOptionPane;

public class P4_ContohInputJOptionPane {
    public static void main(String args[]){
        String nama = JOptionPane.showInputDialog(null, "Nama : ");
        JOptionPane.showMessageDialog(null, "Nama Anda : " + nama);
    }
}
