package frontend;
import backend.*;
public class TestBackend1841720060Nurudin {
    public static void main(String[] args) {
        Kategori1841720060Nurudin kat1 = new Kategori1841720060Nurudin("Novel", "Koleksi buku novel");
        Kategori1841720060Nurudin kat2 = new Kategori1841720060Nurudin("Referensi", "Buku referensi ilmiah");
        Kategori1841720060Nurudin kat3 = new Kategori1841720060Nurudin("Komik", "Komik anak-anak");
// test insert
        kat1.saveNurudin();
        kat2.saveNurudin();
        kat3.saveNurudin();
// test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.saveNurudin();
// test delete
        kat3.deleteNurudin();
// test select all
        for (Kategori1841720060Nurudin k : new Kategori1841720060Nurudin().getAllNurudin()) {
            System.out.println("Nama: " + k.getNama()+ ", Ket: " + k.getKeterangan());
        }
// test search
        for (Kategori1841720060Nurudin k : new Kategori1841720060Nurudin().searchNurudin("ilmiah")) {
            System.out.println("Nama: " + k.getNama()+ ", Ket: " + k.getKeterangan());
        }
    }
}
    