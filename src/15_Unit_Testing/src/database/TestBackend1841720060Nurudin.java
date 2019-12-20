package database;

import database.Anggota1841720060Nurudin;
import database.Kategori1841720060Nurudin;

public class TestBackend1841720060Nurudin {

    public static void main(String[] args) {
        Anggota1841720060Nurudin anggota1 = new Anggota1841720060Nurudin("Nurudin", "Landungsari", "085766566560");
        Anggota1841720060Nurudin anggota2 = new Anggota1841720060Nurudin("Udean", "Batu", "085331456789");
        Anggota1841720060Nurudin anggota3 = new Anggota1841720060Nurudin("Ella", "Kepanjen", "081445335267");
        
        anggota1.saveNurudin();
        anggota2.saveNurudin();
        anggota3.saveNurudin();
       
        // test update
        anggota2.setAlamatNurudin("Probolinggo");
        anggota2.saveNurudin();

        // test delete
        anggota3.deleteNurudin();

        // test select all
        for (Anggota1841720060Nurudin a : new Anggota1841720060Nurudin().getAllNurudin()) {
            System.out.println("Nama: " + a.getNamaNurudin()+ ", Alamat: " + a.getAlamatNurudin()
                    + ", Telepon: "+ a.getTeleponNurudin());
        }

        // test search
        for (Anggota1841720060Nurudin a : new Anggota1841720060Nurudin().searchNurudin("udean")) {
            System.out.println("Nama: " + a.getNamaNurudin()+ ", Alamat: " + a.getAlamatNurudin()
                    + ", Telepon: "+ a.getTeleponNurudin());
        }
    }
}
