/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;
import backend.*;

/**
 *
 * @author peronal
 */
public class Kategori1841720060Nurudin {

    private int mIdKategori;
    private String mNama;
    private String mKeterangan;

    public int getIdKategori() {
        return mIdKategori;
    }

    public void setIdKategori(int mIdKategori) {
        this.mIdKategori = mIdKategori;
    }

    public String getNama() {
        return mNama;
    }

    public void setNama(String mNama) {
        this.mNama = mNama;
    }

    public String getKeterangan() {
        return mKeterangan;
    }

    public void setKeterangan(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720060Nurudin() {
    }

    public Kategori1841720060Nurudin(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720060Nurudin getByIdNurudin(int id) {
        Kategori1841720060Nurudin kat = new Kategori1841720060Nurudin();
        ResultSet rs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720060Nurudin();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720060Nurudin> getAllNurudin() {
        ArrayList<Kategori1841720060Nurudin> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720060Nurudin kat = new Kategori1841720060Nurudin();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }

    public ArrayList<Kategori1841720060Nurudin> searchNurudin(String keyword) {
        ArrayList<Kategori1841720060Nurudin> ListKategori = new ArrayList();

        String sql = "Select * from kategori where " + " nama like '%" + keyword + "%' " + " or keterangan like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720060Nurudin.selectQueryNurudin(sql);

        try {
            while (rs.next()) {
                Kategori1841720060Nurudin kat = new Kategori1841720060Nurudin();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }

    public String toStringNurudin(){
        return mNama;
    }
    
    public void saveNurudin() {
        if (getByIdNurudin(mIdKategori).getIdKategori() == 0) {
            String SQL = "Insert into kategori (nama,keterangan) values("
                    + " '" + this.mNama + "', "
                    + " '" + this.mKeterangan + "' "
                    + " )";
            this.mIdKategori = DBHelper1841720060Nurudin.insertQueryGetIdNurudin(SQL);
        } else {
            String SQL = "Update kategori set"
                    + " nama = '" + this.mNama + "', "
                    + " keterangan = '" + this.mKeterangan + "' "
                    + "Where idkategori = '" + this.mIdKategori + "'";
            DBHelper1841720060Nurudin.executeQueryNurudin(SQL);
        }
    }

    public void deleteNurudin() {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.mIdKategori + "'";
        DBHelper1841720060Nurudin.executeQueryNurudin(SQL);
    }
}
