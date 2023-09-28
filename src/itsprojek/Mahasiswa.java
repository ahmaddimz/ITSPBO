/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsprojek;

/**
 *
 * @author Asus
 */
public class Mahasiswa {
    // Variabel instance private
    private String nama;
    private int umur;

    // Konstruktor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode getter untuk nama
    public String getNama() {
        return nama;
    }

    // Metode setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode getter untuk umur
    public int getUmur() {
        return umur;
    }

    // Metode setter untuk umur
    public void setUmur(int umur) {
        if (umur >= 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid.");
        }
    }

    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Lingga", 20);

        // Menggunakan metode getter
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Umur: " + mahasiswa.getUmur());

        // Menggunakan metode setter
        mahasiswa.setNama("Dimas Wahono");
        mahasiswa.setUmur(25);

        // Output setelah perubahan
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Umur: " + mahasiswa.getUmur());
    }
}