package jobsheet12.percobaan4;

import java.util.ArrayList;
public class InputData1841720060Nurudin {
    ArrayList<Mahasiswa1841720060Nurudin> ListMahasiswa;

    public InputData1841720060Nurudin() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataNurudin(String Nim, String Nama, String Alamat){
        Mahasiswa1841720060Nurudin mhs = new Mahasiswa1841720060Nurudin(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720060Nurudin> getDataNurudin(){
        return ListMahasiswa;
    }
    
}
