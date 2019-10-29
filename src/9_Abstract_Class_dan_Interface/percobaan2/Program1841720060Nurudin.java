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
public class Program1841720060Nurudin {
    public static void main(String[] args) {
        Rektor1841720060Nurudin pakRektor = new Rektor1841720060Nurudin();
        
        Mahasiswa1841720060Nurudin mahasiswaBiasa = new Mahasiswa1841720060Nurudin("Charlie");
        Sarjana1841720060Nurudin sarjanaCumlaude = new Sarjana1841720060Nurudin("Dini");
        PascaSarjana1841720060Nurudin masterCumlaude = new PascaSarjana1841720060Nurudin("Elok");
        
        /*  pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);*/
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
    }
}
