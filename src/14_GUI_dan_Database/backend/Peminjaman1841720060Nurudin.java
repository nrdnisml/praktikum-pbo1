/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author personal
 */
public class Peminjaman1841720060Nurudin {

    private int idPeminjaman;
    private Anggota1841720060Nurudin anggota = new Anggota1841720060Nurudin();
    private Buku1841720060Nurudin buku = new Buku1841720060Nurudin();

    private String tanggalPinjam;
    private String tanggalKembali;

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Anggota1841720060Nurudin getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota1841720060Nurudin anggota) {
        this.anggota = anggota;
    }

    public Buku1841720060Nurudin getBuku() {
        return buku;
    }

    public void setBuku(Buku1841720060Nurudin buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman1841720060Nurudin() {
    }

    public Peminjaman1841720060Nurudin(Anggota1841720060Nurudin anggota,Buku1841720060Nurudin buku,String tanggalPinjam, String tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman1841720060Nurudin getById(int id) {
        Peminjaman1841720060Nurudin peminjaman = new Peminjaman1841720060Nurudin();
        ResultSet rs = DBHelper1841720060Nurudin.selectQueryNurudin("Select "
                + " p.idPeminjaman as idpeminjaman, "
                + " p.tanggalPinjam as TanggalPinjam,"
                + " p.tanggalKembali as TanggalKembali, "
                + " a.idAnggota as idAnggota, "
                + " a.nama as nama,"
                + " a.alamat as alamat,"
                + " a.telepon as telepon,"
                + " b.idBuku as idBuku, "
                + " b.judul as judul,"
                + " b.penerbit as penerbit,"
                + " b.penulis as penulis"
                + " FROM peminjaman p "
                + " left join anggota a on a.idAnggota = p.idAnggota "
                + " left join buku as b on b.idBuku = p.idBuku"
                + " where p.idPeminjaman= '" + id + "'");
        try {
            while (rs.next()) {
                peminjaman = new Peminjaman1841720060Nurudin();
                peminjaman.setIdPeminjaman(rs.getInt("idPeminjaman"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idAnggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idBuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalKembali(rs.getString("tanggalKembali"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalPinjam"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }

    public ArrayList<Peminjaman1841720060Nurudin> getAll() {
        ArrayList<Peminjaman1841720060Nurudin> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720060Nurudin.selectQueryNurudin("Select "
                + " p.idPeminjaman as idpeminjaman, "
                + " p.tanggalPinjam as TanggalPinjam,"
                + " p.tanggalKembali as TanggalKembali, "
                + " a.idAnggota as idAnggota, "
                + " a.nama as nama,"
                + " a.alamat as alamat,"
                + " a.telepon as telepon,"
                + " b.idBuku as idBuku, "
                + " b.judul as judul,"
                + " b.penerbit as penerbit,"
                + " b.penulis as penulis"
                + " FROM peminjaman p "
                + " left join anggota a on a.idAnggota = p.idAnggota "
                + " left join buku as b on b.idBuku = p.idBuku");
        try {
            while (rs.next()) {
                Peminjaman1841720060Nurudin peminjaman = new Peminjaman1841720060Nurudin();
                peminjaman.setIdPeminjaman(rs.getInt("idPeminjaman"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idAnggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idBuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalKembali(rs.getString("tanggalKembali"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalPinjam"));

                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPeminjaman;
    }

    public ArrayList<Peminjaman1841720060Nurudin> searchIdAnggota(String keyword) {
        ArrayList<Peminjaman1841720060Nurudin> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper1841720060Nurudin.selectQueryNurudin("Select "
                + " p.idPeminjaman as idpeminjaman, "
                + " p.tanggalPinjam as TanggalPinjam,"
                + " p.tanggalKembali as TanggalKembali, "
                + " a.idAnggota as idAnggota, "
                + " a.nama as nama,"
                + " a.alamat as alamat,"
                + " a.telepon as telepon,"
                + " b.idBuku as idBuku, "
                + " b.judul as judul,"
                + " b.penerbit as penerbit,"
                + " b.penulis as penulis"
                + " FROM peminjaman p "
                + " left join anggota a on a.idAnggota = p.idAnggota "
                + " left join buku as b on b.idBuku = p.idBuku"
                + " where a.idAnggota like '%" + keyword + "%' ");
        try {
            while (rs.next()) {
                Peminjaman1841720060Nurudin peminjaman = new Peminjaman1841720060Nurudin();
                peminjaman.anggota.getNama();

                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    
    public String searchNmAnggota(String keyword){
        String nama = "Sasa";
        ResultSet rs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT a.nama as nama FROM anggota a left join peminjaman p on p.idanggota=a.idanggota where p.idanggota like '%"+keyword+"%'");
        try {
            while (rs.next()) {                
                Peminjaman1841720060Nurudin peminjaman = new Peminjaman1841720060Nurudin();
                
                nama = peminjaman.anggota.getNama();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nama;
    }
    public ArrayList<Peminjaman1841720060Nurudin> searchIdBuku(String keyword) {
        ArrayList<Peminjaman1841720060Nurudin> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper1841720060Nurudin.selectQueryNurudin("Select "
                + " p.idPeminjaman as idpeminjaman, "
                + " p.tanggalPinjam as TanggalPinjam,"
                + " p.tanggalKembali as TanggalKembali, "
                + " a.idAnggota as idAnggota, "
                + " a.nama as nama,"
                + " a.alamat as alamat,"
                + " a.telepon as telepon,"
                + " b.idBuku as idBuku, "
                + " b.judul as judul,"
                + " b.penerbit as penerbit,"
                + " b.penulis as penulis"
                + " FROM peminjaman p "
                + " left join anggota a on a.idAnggota = p.idAnggota "
                + " left join buku as b on b.idBuku = p.idBuku"
                + " where b.idBuku like '%" + keyword + "%' ");
        try {
            while (rs.next()) {
                Peminjaman1841720060Nurudin peminjaman = new Peminjaman1841720060Nurudin();
                peminjaman.buku.getJudul();

                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }

    public void save() {
        if (getById(idPeminjaman).getIdPeminjaman() == 0) {
            String SQL = "INSERT INTO peminjaman (idAnggota,idBuku,tanggalPinjam,tanggalKembali) VALUES("
                    + " '" + this.getAnggota().getIdAnggota() + "', "
                    + " '" + this.getBuku().getIdBuku() + "', "
                    + " '" + this.tanggalPinjam + "', "
                    + " '" + this.tanggalKembali + "' "
                    + " )";
            this.idPeminjaman = DBHelper1841720060Nurudin.insertQueryGetIdNurudin(SQL);
        } else {
            String SQL = "UPDATE peminjaman set "
                    + " judul = '" + this.getBuku().getJudul() + "', "
                    + " nama = '" + this.getAnggota().getNama() + "', "
                    + " tanggalPinjam = '" + this.tanggalPinjam + "', "
                    + " tanggalKembali = '" + this.tanggalKembali + "', "
                    + " WHERE idPeminjaman = '" + this.idPeminjaman + "'";
            DBHelper1841720060Nurudin.executeQueryNurudin(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM buku where idPeminjaman = '" + this.idPeminjaman + "'";
        DBHelper1841720060Nurudin.executeQueryNurudin(SQL);
    }

}
