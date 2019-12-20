package database;

import database.Kategori1841720060Nurudin;

public class TestBackendKategori1841720060Nurudin {

    public static void main(String[] args) {
        Kategori1841720060Nurudin kat1 = new Kategori1841720060Nurudin("Novel", "Koleksi buku novel");
        Kategori1841720060Nurudin kat2 = new Kategori1841720060Nurudin("Referensi", "Buku referensi ilmiah");
        Kategori1841720060Nurudin kat3 = new Kategori1841720060Nurudin("Komik", "Komik anak-anak");

        // test insert
        kat1.saveNurudin();
        kat2.saveNurudin();
        kat3.saveNurudin();

        // test update
        kat2.setKeteranganNurudin("Buku referensi");
        kat2.saveNurudin();

        // test delete
        kat3.deleteNurudin();
//
        // test select all
        for (Kategori1841720060Nurudin k : new Kategori1841720060Nurudin().getAllNurudin()) {
            System.out.println("Nama: " + k.getNamaNurudin()+ ", Ket: " + k.getKeteranganNurudin());
        }

        // test search
        for (Kategori1841720060Nurudin k : new Kategori1841720060Nurudin().searchNurudin("ilmiah")) {
            System.out.println("Nama: " + k.getNamaNurudin()+ ", Ket: " + k.getKeteranganNurudin());
        }
    }
}
