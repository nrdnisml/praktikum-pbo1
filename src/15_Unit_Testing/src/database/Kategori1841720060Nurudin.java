package database;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Kategori1841720060Nurudin {

    private int mIdKategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720060Nurudin() {

    }

    public Kategori1841720060Nurudin(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720060Nurudin getByIdNurudin(int mId) {
        Kategori1841720060Nurudin mKat = new Kategori1841720060Nurudin();
        ResultSet mRs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT * FROM kategori "
                + "WHERE idkategori = '" + mId + "'");

        try {
            while (mRs.next()) {
                mKat = new Kategori1841720060Nurudin();
                mKat.setIdKategoriNurudin(mRs.getInt("idkategori"));
                mKat.setNamaNurudin(mRs.getString("nama"));
                mKat.setKeteranganNurudin(mRs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mKat;
    }

    public ArrayList<Kategori1841720060Nurudin> getAllNurudin() {
        ArrayList<Kategori1841720060Nurudin> mListKategori = new ArrayList();

        ResultSet mRs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT * FROM kategori");

        try {
            while (mRs.next()) {
                Kategori1841720060Nurudin mKat = new Kategori1841720060Nurudin();
                mKat.setIdKategoriNurudin(mRs.getInt("idkategori"));
                mKat.setNamaNurudin(mRs.getString("nama"));
                mKat.setKeteranganNurudin(mRs.getString("keterangan"));

                mListKategori.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListKategori;
    }

    public ArrayList<Kategori1841720060Nurudin> searchNurudin(String mKeyword) {
        ArrayList<Kategori1841720060Nurudin> mListKategori = new ArrayList();

        String mSql = "SELECT * FROM kategori WHERE "
                + " nama LIKE '%" + mKeyword + "%' "
                + " OR keterangan LIKE '%" + mKeyword + "%' ";

        ResultSet mRs = DBHelper1841720060Nurudin.selectQueryNurudin(mSql);

        try {
            while (mRs.next()) {
                Kategori1841720060Nurudin mKat = new Kategori1841720060Nurudin();
                mKat.setIdKategoriNurudin(mRs.getInt("idkategori"));
                mKat.setNamaNurudin(mRs.getString("nama"));
                mKat.setKeteranganNurudin(mRs.getString("keterangan"));

                mListKategori.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListKategori;
    }

    public void saveNurudin() {
        if (getByIdNurudin(mIdKategori).getIdKategoriNurudin() == 0) {
            String mSql = "INSERT INTO kategori (nama, keterangan) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mKeterangan + "' "
                    + " )";
            this.mIdKategori = DBHelper1841720060Nurudin.insertQueryGetIdNurudin(mSql);
        } else {
            String mSql = "UPDATE kategori SET "
                    + " nama = '" + this.mNama + "', "
                    + " keterangan = '" + this.mKeterangan + "' "
                    + " WHERE idkategori = '" + this.mIdKategori + "'";
            DBHelper1841720060Nurudin.executeQueryNurudin(mSql);
        }
    }

    public void deleteNurudin() {
        String mSql = "DELETE FROM kategori WHERE idkategori = '" + this.mIdKategori + "'";
        DBHelper1841720060Nurudin.executeQueryNurudin(mSql);
    }
    
    ArrayList<Kategori1841720060Nurudin> getByNamaAndKeteranganNurudin(String nama, String keterangan) {
        ArrayList<Kategori1841720060Nurudin> ListKategori = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length()>0) && (keterangan.trim().length()>0)){
            rs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT * FROM kategori Where nama = '"+
            nama +"' and keterangan = '"+ keterangan+"'");
        }else if ((nama.trim().length()>0) && (keterangan.trim().length()==0)){
            rs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT * FROM kategori Where nama = '"+
            nama+"'");
        }else {
            rs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT * FROM kategori Where keterangan = '"+ keterangan+"'");
        }
        try {
            while (rs.next()) {
                Kategori1841720060Nurudin kat = new Kategori1841720060Nurudin();
                kat.setIdKategoriNurudin(rs.getInt("idkategori"));
                kat.setNamaNurudin(rs.getString("nama"));
                kat.setKeteranganNurudin(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public String toString(){
        return mNama;
    }

    public int getIdKategoriNurudin() {
        return mIdKategori;
    }

    public void setIdKategoriNurudin(int mIdKategori) {
        this.mIdKategori = mIdKategori;
    }

    public String getNamaNurudin() {
        return mNama;
    }

    public void setNamaNurudin(String mNama) {
        this.mNama = mNama;
    }

    public String getKeteranganNurudin() {
        return mKeterangan;
    }

    public void setKeteranganNurudin(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

}
