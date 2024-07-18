package com.example.Pertemuan5;

class Animal {
    private String nama, sifat;
    private int ukuran;
    public String getNama(){
        return nama;
    }
    public String getSifat(){
        return sifat;
    }
    public int getUkuran(){
        return ukuran;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setSifat(String sifat){
        this.sifat = sifat;
    }
    public void setUkuran(int ukuran){
        this.ukuran = ukuran;
    }
}
class Mamalia extends Animal{
    private String jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;
    public Mamalia(){
        super.setNama("Mamalia");
        super.setSifat("Menyusui, dan bertulang belakang");
        super.setUkuran(40);
    }
    public Mamalia(String nama){
        super.setNama(nama);
        super.setSifat("Menyusui, dan bertulang belakang");
        super.setUkuran(40);
    }
    public boolean getBisaJalan(){
        return bisaJalan;
    }
    public String getJenisMamalia(){
        return jenisMamalia;
    }
    public int getJumlahKaki(){
        return jumlahKaki;
    }
    public void setBisaJalan(boolean bisaJalan){
        this.bisaJalan = bisaJalan;
    }
    public void setJenisMamalia(String jenisMamalia){
        this.jenisMamalia = jenisMamalia;
    }
    public void setJumlahKaki(int jumlahKaki){
        this.jumlahKaki = jumlahKaki;
    }
}
class Aves extends Animal{
    private String jenisAves;
    private boolean bisaTerbang;
    public Aves(){
        super.setNama("Aves");
        super.setSifat("Memiliki bulu (bukan rambut)");
        super.setUkuran(20);
    }
    public Aves(String nama, double ukuran){
        super.setNama(nama);
        super.setUkuran((int)ukuran);
        super.setSifat("Memiliki bulu (bukan rambut)");
    }
    public String getJenisAves(){
        return jenisAves;
    }
    public boolean getBisaTerbang(){
        return bisaTerbang;
    }
    public void setJenisAves(String jenisAves){
        this.jenisAves = jenisAves;
    }
    public void setBisaTerbang(boolean bisaTerbang){
        this.bisaTerbang = bisaTerbang;
    }
}
class Ayam extends Aves{
    private String jenisAyam;
    private boolean bisaDiadu;
    public Ayam(){
        super.setBisaTerbang(false);
        super.setJenisAves("Unggas");
        super.setNama("Ayam");
        super.setSifat("Berbulu layaknya Aves, namun tidak bisa terbang");
        super.setUkuran(10);
    }
    public Ayam(String nama, double ukuran){
        super.setBisaTerbang(false);
        super.setJenisAves("Unggas");
        super.setNama(nama);
        super.setSifat("Berbulu layaknya Aves, namun tidak bisa terbang");
        super.setUkuran((int) ukuran);
    }
    public String getJenisAyam(){
        return jenisAyam;
    }
    public boolean getBisaDiadu(){
        return bisaDiadu;
    }
    public void setJenisAyam(String jenisAyam){
        this.jenisAyam = jenisAyam;
    }
    public void setBisaDiadu(boolean bisaDiadu){
        this.bisaDiadu = bisaDiadu;
    }
}
class Merpati extends Aves{
    public Merpati(){
        super.setBisaTerbang(true);
        super.setJenisAves("Columbiformes");
        super.setNama("Merpati");
        super.setSifat("Bisa terbang, dan punya kicauan merdu");
        super.setUkuran(5);
    }
    public Merpati(String nama, double ukuran){
        super.setBisaTerbang(true);
        super.setJenisAves("Columbiformes");
        super.setNama(nama);
        super.setSifat("Bisa terbang, dan punya kicauan merdu");
        super.setUkuran((int)ukuran);
    }
    public void setBisaTerbang(boolean bisaTerbang){
        super.setBisaTerbang(bisaTerbang);
    }
    public boolean getBisaTerbang(){
        return super.getBisaTerbang();
    }
}
public class Tantangan {
    public static void main(String args[]){
        Animal animal = new Animal();
        Mamalia mamal1 = new Mamalia();
        Mamalia mamal2 = new Mamalia("Kucing");
        Aves aves1 = new Aves();
        Aves aves2 = new Aves("Merak", 15.0d);
        Ayam ayam1 = new Ayam();
        Ayam ayam2 = new Ayam("Kate", 7.5d);
        Merpati merpati1 = new Merpati();
        Merpati merpati2 = new Merpati("Pigeon", 5.2d);
        
        //Animal
        animal.setNama("Anjing");
        animal.setSifat("Menyusui, dan bertulang belakang");
        animal.setUkuran(12);
        System.out.println("Nama: " + animal.getNama());
        System.out.println("Sifat: " + animal.getSifat());
        System.out.println("Ukuran: " + animal.getUkuran());
        //end
        System.out.println();
        
        //Mamalia 1
        mamal1.setNama("Manusia");
        mamal1.setSifat("Menyusui, dan bertulang belakang");
        mamal1.setUkuran(60);
        mamal1.setBisaJalan(true);
        mamal1.setJenisMamalia("Homo sapiens");
        mamal1.setJumlahKaki(2);
        System.out.println("Nama: " + mamal1.getNama());
        System.out.println("Sifat: " + mamal1.getSifat());
        System.out.println("Ukuran: " + mamal1.getUkuran());
        System.out.println("Bisa jalan?: " + mamal1.getBisaJalan());
        System.out.println("Jenis Mamalia: " + mamal1.getJenisMamalia());
        System.out.println("Jumlah Kaki: " + mamal1.getJumlahKaki());
        //end
        System.out.println();
        
        //Mamalia 2
        mamal2.setSifat("Menyusui, dan bertulang belakang");
        mamal2.setUkuran(11);
        mamal2.setBisaJalan(true);
        mamal2.setJenisMamalia("Felis catus");
        mamal2.setJumlahKaki(4);
        System.out.println("Nama: " + mamal2.getNama());
        System.out.println("Sifat: " + mamal2.getSifat());
        System.out.println("Ukuran: " + mamal2.getUkuran());
        System.out.println("Bisa jalan?: " + mamal2.getBisaJalan());
        System.out.println("Jenis Mamalia: " + mamal2.getJenisMamalia());
        System.out.println("Jumlah Kaki: " + mamal2.getJumlahKaki());
        //end
        System.out.println();
        
        //Aves 1
        aves1.setNama("Merak");
        aves1.setSifat("Memiliki bulu yang cantik pada bagian ekornya");
        aves1.setUkuran(15);
        aves1.setBisaTerbang(true);
        aves1.setJenisAves("Pavo muticus");
        System.out.println("Nama: " + aves1.getNama());
        System.out.println("Sifat: " + aves1.getSifat());
        System.out.println("Ukuran: " + aves1.getUkuran());
        System.out.println("Bisa terbang?: " + aves1.getBisaTerbang());
        System.out.println("Jenis Aves: " + aves1.getJenisAves());
        //end
        System.out.println();
        
        //Aves 2
        aves2.setSifat("Memiliki bulu yang cantik pada bagian ekornya");
        aves2.setUkuran(23);
        aves2.setBisaTerbang(true);
        aves2.setJenisAves("Pavo muticus");
        System.out.println("Nama: " + aves2.getNama());
        System.out.println("Sifat: " + aves2.getSifat());
        System.out.println("Ukuran: " + aves2.getUkuran());
        System.out.println("Bisa terbang?: " + aves2.getBisaTerbang());
        System.out.println("Jenis Aves: " + aves2.getJenisAves());
        //end
        System.out.println();
        
        //Ayam 1
        ayam1.setNama("Ayam");
        ayam1.setSifat("Punya visual yang indah dan sering digunakan untuk adu");
        ayam1.setUkuran(10);
        ayam1.setBisaTerbang(false);
        ayam1.setJenisAves("Gallus gallus domesticus");
        ayam1.setBisaDiadu(true);
        ayam1.setJenisAyam("Bangkok");
        System.out.println("Nama: " + ayam1.getNama());
        System.out.println("Sifat: " + ayam1.getSifat());
        System.out.println("Ukuran: " + ayam1.getUkuran());
        System.out.println("Bisa terbang?: " + ayam1.getBisaTerbang());
        System.out.println("Jenis Aves: " + ayam1.getJenisAves());
        System.out.println("Bisa diadu?: " + ayam1.getBisaDiadu());
        System.out.println("Jenis Ayam: " + ayam1.getJenisAyam());
        //end
        System.out.println();
        
        //Ayam 2
        ayam2.setSifat("Punya visual yang indah dan sering digunakan untuk adu");
        ayam2.setBisaTerbang(false);
        ayam2.setJenisAves("Gallus gallus domesticus");
        ayam2.setBisaDiadu(true);
        ayam2.setJenisAyam("Kate");
        System.out.println("Nama: " + ayam2.getNama());
        System.out.println("Sifat: " + ayam2.getSifat());
        System.out.println("Ukuran: " + ayam2.getUkuran());
        System.out.println("Bisa terbang?: " + ayam2.getBisaTerbang());
        System.out.println("Jenis Aves: " + ayam2.getJenisAves());
        System.out.println("Bisa diadu?: " + ayam2.getBisaDiadu());
        System.out.println("Jenis Ayam: " + ayam2.getJenisAyam());
        //end
        System.out.println();
        
        //Merpati 1
        merpati1.setNama("Pigeon");
        merpati1.setSifat("Tubuh yang kecil, sering ditemukan di jalan");
        merpati1.setUkuran(5);
        merpati1.setBisaTerbang(true);
        merpati1.setJenisAves("Columba livia");
        System.out.println("Nama: " + merpati1.getNama());
        System.out.println("Sifat: " + merpati1.getSifat());
        System.out.println("Ukuran: " + merpati1.getUkuran());
        System.out.println("Bisa terbang?: " + merpati1.getBisaTerbang());
        System.out.println("Jenis Aves: " + merpati1.getJenisAves());
        //end
        System.out.println();
        
        //Merpati 2
        merpati2.setSifat("Bisa terbang, dan punya kicauan merdu");
        merpati2.setBisaTerbang(true);
        merpati2.setJenisAves("Columba livia");
        System.out.println("Nama: " + merpati2.getNama());
        System.out.println("Sifat: " + merpati2.getSifat());
        System.out.println("Ukuran: " + merpati2.getUkuran());
        System.out.println("Bisa terbang?: " + merpati2.getBisaTerbang());
        System.out.println("Jenis Aves: " + merpati2.getJenisAves());
        //end
    }
}

