package com.example.Pertemuan3;

class Biodata {
    public String nama;
    public long   nim;
    public String jurusan;
    public String fakultas;
    public String universitas;
    public String alamat;
    public String email;
    public String hobi;
    public String keahlian;
    
    public Biodata(String nama, 
                   long nim, 
                   String jurusan, 
                   String fakultas, 
                   String universitas, 
                   String alamat, 
                   String email, 
                   String hobi, 
                   String keahlian)
    {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.universitas = universitas;
        this.alamat = alamat;
        this.email = email;
        this.hobi = hobi;
        this.keahlian = keahlian;
    }
}


public class Tantangan {
    public static void main(String args[]){
        Biodata kelvin = new Biodata(
                            "Kelvianto Pratama Harum",
                            200210500016L,
                            "Teknik Informatika dan Komputer",
                            "Teknik",
                            "Universitas Negeri Makassar",
                            "di Rumah",
                            "kelvin@kelvin-pratama.my.id",
                            "Billiard",
                            "Network Technician"
                         );
        System.out.println("Nama: " + kelvin.nama);
        System.out.println("NIM: " + kelvin.nim);
        System.out.println("Jurusan: " + kelvin.jurusan);
        System.out.println("Fakultas: " + kelvin.fakultas);
        System.out.println("Universitas: " + kelvin.universitas);
        System.out.println("Alamat: " + kelvin.alamat);
        System.out.println("Email: " + kelvin.email);
        System.out.println("Hobi: " + kelvin.hobi);
        System.out.println("Keahlian: " + kelvin.keahlian);
    }
}
