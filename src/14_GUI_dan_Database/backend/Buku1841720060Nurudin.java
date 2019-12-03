/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JComboBox;


/**
 *
 * @author personal
 */
public class Buku1841720060Nurudin {

    private int idBuku;
    private Kategori1841720060Nurudin kategori = new Kategori1841720060Nurudin();
    private String judul;
    private String penerbit;
    private String penulis;

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public Kategori1841720060Nurudin getKategori() {
        return kategori;
    }

    public void setKategori(Kategori1841720060Nurudin kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public Buku1841720060Nurudin() {
    }

    public Buku1841720060Nurudin(Kategori1841720060Nurudin kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public Buku1841720060Nurudin getByIdNurudin(int id) {
        Buku1841720060Nurudin buku = new Buku1841720060Nurudin();
        ResultSet rs = DBHelper1841720060Nurudin.selectQueryNurudin("Select "
                + " b.idBuku as idBuku, "
                + " b.judul as judul,"
                + " b.penerbit as penerbit, "
                + " b.penulis as penulis, "
                + " k.idKategori as idkategori, "
                + " k.nama as nama, "
                + " k.keterangan as keterangan"
                + " FROM buku b "
                + " left join kategori k on b.idKategori = k.idKategori "
                + " where b.idBuku = '" + id + "'");
        try {
            while (rs.next()) {
                buku = new Buku1841720060Nurudin();
                buku.setIdBuku(rs.getInt("idBuku"));
                buku.getKategori().setIdKategori(rs.getInt("idKategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720060Nurudin> getAllNurudin() {
        ArrayList<Buku1841720060Nurudin> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720060Nurudin.selectQueryNurudin("Select "
                + " b.idBuku as idBuku, "
                + " b.judul as judul, "
                + " b.penerbit as penerbit,"
                + " b.penulis as penulis, "
                + " k.idKategori as idkategori, "
                + " k.nama as nama, "
                + " k.keterangan as keterangan "
                + " from buku b "
                + " left join kategori k on b.idKategori = k.idKategori ");
        try{
            while(rs.next()){
                Buku1841720060Nurudin buku = new Buku1841720060Nurudin();
                buku.setIdBuku(rs.getInt("idBuku"));
                buku.getKategori().setIdKategori(rs.getInt("idKategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return ListBuku;
    }
    
    public ArrayList<Buku1841720060Nurudin> searchNurudin(String keyword){
        ArrayList<Buku1841720060Nurudin> ListBuku = new ArrayList();
        
        ResultSet rs = DBHelper1841720060Nurudin.selectQueryNurudin("Select "
                + " b.idBuku as idbuku,"
                + " b.judul as judul,"
                + " b.penerbit as penerbit,"
                + " b.penulis as penulis,"
                + " k.idKategori as idkategori,"
                + " k.nama as nama,"
                + " k.keterangan as keterangan "
                + " FROM buku b "
                + " left join kategori k on b.idKategori = k.idKategori "
                + " where b.judul like '%"+keyword+"%' "
                + " OR b.penerbit like '%"+keyword+"%' "
                + " OR b.penulis LIKE '%"+keyword+"%' ");
        try{
            while(rs.next()){
                Buku1841720060Nurudin buku = new Buku1841720060Nurudin();
                buku.setIdBuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategori(rs.getInt("idKategori"));
                buku.getKategori().setNama(rs.getString("nama"));
                buku.getKategori().setKeterangan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenerbit(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public void saveNurudin(){
        if(getByIdNurudin(idBuku).getIdBuku() == 0){
            String SQL = "INSERT INTO buku (judul,idKategori, penulis, penerbit) VALUES("
                    + " '"+this.judul+"', "
                    + " '"+this.getKategori().getIdKategori()+"', "
                    + " '"+this.penulis+"', "
                    + " '"+this.penerbit+"' "
                    + " )";
            this.idBuku = DBHelper1841720060Nurudin.insertQueryGetIdNurudin(SQL);
        }else{
            String SQL = "UPDATE buku set "
                    + " judul = '"+this.judul+"', "
                    + " idKategori = '"+this.getKategori().getIdKategori()+"', "
                    + " penulis = '"+this.penulis+"', "
                    + " penerbit = '"+this.penerbit+"' "
                    + " WHERE idBuku = '"+this.idBuku+"'";
            DBHelper1841720060Nurudin.executeQueryNurudin(SQL);
        }
    }
    
    public void deleteNurudin(){
        String SQL = "DELETE FROM buku where idBuku = '"+this.idBuku+"'";
        DBHelper1841720060Nurudin.executeQueryNurudin(SQL);
    }
}
