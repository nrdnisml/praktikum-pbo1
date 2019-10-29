/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet09.percobaan2;

/**
 *
 * @author personal
 */
public class Sarjana1841720060Nurudin extends Mahasiswa1841720060Nurudin implements ICumlaude1841720060Nurudin{

    public Sarjana1841720060Nurudin(String nama) {
        super(nama);
    }

    @Override
    public void lulusNurudin() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");  
    }

    @Override
    public void meraihIPKTinggiNurudin() {
        System.out.println("IPK-ku lebih dari 3,51");  
    }
}

