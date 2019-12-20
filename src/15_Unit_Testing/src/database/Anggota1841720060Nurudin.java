package database;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Anggota1841720060Nurudin {

    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720060Nurudin() {

    }

    public Anggota1841720060Nurudin(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public Anggota1841720060Nurudin getByIdNurudin(int mId) {
        Anggota1841720060Nurudin mKat = new Anggota1841720060Nurudin();
        ResultSet mRs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT * FROM anggota "
                + "WHERE idanggota = '" + mId + "'");

        try {
            while (mRs.next()) {
                mKat = new Anggota1841720060Nurudin();
                mKat.setIdAnggotaNurudin(mRs.getInt("idanggota"));
                mKat.setNamaNurudin(mRs.getString("nama"));
                mKat.setAlamatNurudin(mRs.getString("alamat"));
                mKat.setTeleponNurudin(mRs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mKat;
    }

    public ArrayList<Anggota1841720060Nurudin> getAllNurudin() {
        ArrayList<Anggota1841720060Nurudin> mListAnggota = new ArrayList();

        ResultSet mRs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT * FROM anggota");

        try {
            while (mRs.next()) {
                Anggota1841720060Nurudin mKat = new Anggota1841720060Nurudin();
                mKat.setIdAnggotaNurudin(mRs.getInt("idanggota"));
                mKat.setNamaNurudin(mRs.getString("nama"));
                mKat.setAlamatNurudin(mRs.getString("alamat"));
                mKat.setTeleponNurudin(mRs.getString("telepon"));

                mListAnggota.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListAnggota;
    }

    public ArrayList<Anggota1841720060Nurudin> searchNurudin(String mKeyword) {
        ArrayList<Anggota1841720060Nurudin> mListAnggota = new ArrayList();

        String mSql = "SELECT * FROM anggota WHERE "
                + " nama LIKE '%" + mKeyword + "%' "
                + " OR alamat LIKE '%" + mKeyword + "%' "
                + " OR telepon LIKE '%" + mKeyword + "%' ";

        ResultSet mRs = DBHelper1841720060Nurudin.selectQueryNurudin(mSql);

        try {
            while (mRs.next()) {
                Anggota1841720060Nurudin mKat = new Anggota1841720060Nurudin();
                mKat.setIdAnggotaNurudin(mRs.getInt("idanggota"));
                mKat.setNamaNurudin(mRs.getString("nama"));
                mKat.setAlamatNurudin(mRs.getString("alamat"));
                mKat.setTeleponNurudin(mRs.getString("telepon"));

                mListAnggota.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListAnggota;
    }
    
    public void saveNurudin() {
        if (getByIdNurudin(mIdAnggota).getIdAnggotaNurudin()== 0) {
            String mSql = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mAlamat + "', "
                    + " '" + this.mTelepon + "' "
                    + " )";
            this.mIdAnggota = DBHelper1841720060Nurudin.insertQueryGetIdNurudin(mSql);
        } else {
            String mSql = "UPDATE anggota SET "
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + " WHERE idanggota = '" + this.mIdAnggota + "'";
            DBHelper1841720060Nurudin.executeQueryNurudin(mSql);
        }
    }
    
    public void deleteNurudin() {
        String mSql = "DELETE FROM anggota WHERE idanggota = '" + this.mIdAnggota + "'";
        DBHelper1841720060Nurudin.executeQueryNurudin(mSql);
    }
    
    ArrayList<Anggota1841720060Nurudin> getByNamaAndAlamatNurudin(String nama, String alamat) {
        ArrayList<Anggota1841720060Nurudin> ListAnggota = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length()>0) && (alamat.trim().length()>0)){
            rs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT * FROM anggota Where nama = '"+
            nama +"' and alamat = '"+ alamat+"'");
        }else if ((nama.trim().length()>0) && (alamat.trim().length()==0)){
            rs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT * FROM anggota Where nama = '"+
            nama+"'");
        }else {
            rs = DBHelper1841720060Nurudin.selectQueryNurudin("SELECT * FROM anggota Where alamat = '"+ alamat+"'");
        }
        try {
            while (rs.next()) {
                Anggota1841720060Nurudin ang = new Anggota1841720060Nurudin();
                ang.setIdAnggotaNurudin(rs.getInt("idanggota"));
                ang.setNamaNurudin(rs.getString("nama"));
                ang.setAlamatNurudin(rs.getString("alamat"));
                ang.setTeleponNurudin(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public int getIdAnggotaNurudin() {
        return mIdAnggota;
    }

    public void setIdAnggotaNurudin(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public String getNamaNurudin() {
        return mNama;
    }

    public void setNamaNurudin(String mNama) {
        this.mNama = mNama;
    }

    public String getAlamatNurudin() {
        return mAlamat;
    }

    public void setAlamatNurudin(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getTeleponNurudin() {
        return mTelepon;
    }

    public void setTeleponNurudin(String mTelepon) {
        this.mTelepon = mTelepon;
    }

}
