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
 * @author personal
 */
public class Anggota1841720060Nurudin {

    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public int getIdAnggota() {
        return mIdAnggota;
    }

    public void setIdAnggota(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public String getNama() {
        return mNama;
    }

    public void setNama(String mNama) {
        this.mNama = mNama;
    }

    public String getAlamat() {
        return mAlamat;
    }

    public void setAlamat(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getTelepon() {
        return mTelepon;
    }

    public void setTelepon(String mTelepon) {
        this.mTelepon = mTelepon;
    }

    public Anggota1841720060Nurudin() {
    }

    public Anggota1841720060Nurudin(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public Anggota1841720060Nurudin getByIdNurudin(int id) {
        Anggota1841720060Nurudin ang = new Anggota1841720060Nurudin();
        ResultSet rs2 = DBHelper1841720060Nurudin.selectQueryNurudin("Select * from anggota " + " where idanggota = '" + id + "'");

        try {
            while (rs2.next()) {
                ang = new Anggota1841720060Nurudin();
                ang.setIdAnggota(rs2.getInt("idanggota"));
                ang.setNama(rs2.getString("nama"));
                ang.setAlamat(rs2.getString("alamat"));
                ang.setTelepon(rs2.getString("alamat"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ang;
    }

    public ArrayList<Anggota1841720060Nurudin> getAllNurudin() {
        ArrayList<Anggota1841720060Nurudin> ListAnggota = new ArrayList();

        ResultSet rs2 = DBHelper1841720060Nurudin.selectQueryNurudin("Select * from anggota");

        try {
            while (rs2.next()) {
                Anggota1841720060Nurudin ang = new Anggota1841720060Nurudin();
                ang.setIdAnggota(rs2.getInt("idanggota"));
                ang.setNama(rs2.getString("nama"));
                ang.setAlamat(rs2.getString("alamat"));
                ang.setTelepon(rs2.getString("telepon"));

                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720060Nurudin> searchNurudin(String keyword) {
        ArrayList<Anggota1841720060Nurudin> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota where " + " nama like '%" + keyword + "%' " + " or alamat like '%" + keyword + "%' or telepon like '%" + keyword + "%' ";

        ResultSet rs2 = DBHelper1841720060Nurudin.selectQueryNurudin(sql);

        try {
            while (rs2.next()) {
                Anggota1841720060Nurudin ang = new Anggota1841720060Nurudin();
                ang.setIdAnggota(rs2.getInt("idanggota"));
                ang.setNama(rs2.getString("nama"));
                ang.setAlamat(rs2.getString("alamat"));
                ang.setTelepon(rs2.getString("telepon"));

                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public void saveNurudin() {
        if (getByIdNurudin(mIdAnggota).getIdAnggota() == 0) {
            String SQL = "Insert into anggota (nama,alamat,telepon) values("
                    + " '" + this.mNama + "', "
                    + " '" + this.mAlamat + "', "
                    + " '" + this.mTelepon + "' "
                    + " )";
            this.mIdAnggota = DBHelper1841720060Nurudin.insertQueryGetIdNurudin(SQL);
        } else {
            String SQL = "Update anggota set"
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + "Where anggota = '" + this.mIdAnggota + "'";
            DBHelper1841720060Nurudin.executeQueryNurudin(SQL);
        }
    }

    public void deleteNurudin() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdAnggota + "'";
        DBHelper1841720060Nurudin.executeQueryNurudin(SQL);
    }
}
