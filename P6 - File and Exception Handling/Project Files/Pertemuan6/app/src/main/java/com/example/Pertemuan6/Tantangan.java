package com.example.Pertemuan6;

import java.io.*;
import java.util.regex.*;

class Biodata{
    private String nomor_hp, nomor_ktp, email;
    public void setNomorHP(String nomor_hp){
        try{
            long nomor = Long.parseLong(nomor_hp);
            this.nomor_hp = nomor_hp;
        } catch(NumberFormatException e){
            System.out.println("KESALAHAN: Bukan format nomor! (String: " + nomor_hp + ")");
        }
    }
    public void setNomorKTP(String nomor_ktp){
        try{
            if(nomor_ktp.length() != 16){
                throw new Exception("Panjang nomor KTP harus 16 digit! (String: " + nomor_ktp + ")");
            }
            this.nomor_ktp = nomor_ktp;
        }catch(Exception e){
            System.out.println("KESALAHAN: " + e.getMessage());
        }
    }
    public void setEmail(String email){
        try{
            if(!adalahEmailValid(email)){
                throw new Exception("Bukan format email! (String: " + email + ")");
            }
            this.email = email;
        } catch(Exception e){
            System.out.println("KESALAHAN: " + e.getMessage());
        }
    }
    public String getNomorHP(){
        return this.nomor_hp;
    }
    public String getNomorKTP(){
        return this.nomor_ktp;
    }
    public String getEmail(){
        return this.email;
    }
    public static boolean adalahEmailValid(String email){
        String emailregex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        Pattern pat = Pattern.compile(emailregex);
        return pat.matcher(email).matches();
    }
}
public class Tantangan {
    public static void main(String[] args){
        Biodata kelvin = new Biodata();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Masukkan nomor HP: ");
            String nomor_hp = input.readLine();
            
            System.out.print("Masukkan nomor KTP: ");
            String nomor_ktp = input.readLine();
            
            System.out.print("Masukkan email: ");
            String email = input.readLine();
            
            kelvin.setNomorHP(nomor_hp);
            kelvin.setNomorKTP(nomor_ktp);
            kelvin.setEmail(email);
        }catch (IOException e){
            System.out.println("KESALAHAN: "+ e.getMessage());
        }
        
        System.out.println("\nNomor HP: " + kelvin.getNomorHP());
        System.out.println("Nomor KTP: " + kelvin.getNomorKTP());
        System.out.println("E-mail: " + kelvin.getEmail());
    }
}
