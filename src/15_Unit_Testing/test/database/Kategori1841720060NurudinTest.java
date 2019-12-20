/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oktavian
 */
public class Kategori1841720060NurudinTest {
    
    public Kategori1841720060NurudinTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetByIdNurudin() {
        System.out.println("getByIdNurudin");
        int mId = 0;
        Kategori1841720060Nurudin instance = new Kategori1841720060Nurudin();
        Kategori1841720060Nurudin expResult = null;
        Kategori1841720060Nurudin result = instance.getByIdNurudin(mId);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAllNurudin() {
        System.out.println("getAllNurudin");
        Kategori1841720060Nurudin instance = new Kategori1841720060Nurudin();
        ArrayList<Kategori1841720060Nurudin> expResult = null;
        ArrayList<Kategori1841720060Nurudin> result = instance.getAllNurudin();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearchNurudin() {
        System.out.println("searchNurudin");
        String mKeyword = "";
        Kategori1841720060Nurudin instance = new Kategori1841720060Nurudin();
        ArrayList<Kategori1841720060Nurudin> expResult = null;
        ArrayList<Kategori1841720060Nurudin> result = instance.searchNurudin(mKeyword);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSaveNurudin() {
        System.out.println("saveNurudin");
        Kategori1841720060Nurudin instance = new Kategori1841720060Nurudin();
        instance.saveNurudin();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDeleteNurudin() {
        System.out.println("deleteNurudin");
        Kategori1841720060Nurudin instance = new Kategori1841720060Nurudin();
        instance.deleteNurudin();
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Kategori1841720060Nurudin instance = new Kategori1841720060Nurudin();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdKategoriNurudin() {
        System.out.println("getIdKategoriNurudin");
        Kategori1841720060Nurudin instance = new Kategori1841720060Nurudin();
        int expResult = 0;
        int result = instance.getIdKategoriNurudin();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdKategoriNurudin() {
        System.out.println("setIdKategoriNurudin");
        int mIdKategori = 0;
        Kategori1841720060Nurudin instance = new Kategori1841720060Nurudin();
        instance.setIdKategoriNurudin(mIdKategori);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetNamaNurudin() {
        System.out.println("getNamaNurudin");
        Kategori1841720060Nurudin instance = new Kategori1841720060Nurudin();
        String expResult = "";
        String result = instance.getNamaNurudin();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetNamaNurudin() {
        System.out.println("setNamaNurudin");
        String mNama = "";
        Kategori1841720060Nurudin instance = new Kategori1841720060Nurudin();
        instance.setNamaNurudin(mNama);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetKeteranganNurudin() {
        System.out.println("getKeteranganNurudin");
        Kategori1841720060Nurudin instance = new Kategori1841720060Nurudin();
        String expResult = "";
        String result = instance.getKeteranganNurudin();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetKeteranganNurudin() {
        System.out.println("setKeteranganNurudin");
        String mKeterangan = "";
        Kategori1841720060Nurudin instance = new Kategori1841720060Nurudin();
        instance.setKeteranganNurudin(mKeterangan);
        fail("The test case is a prototype.");
    }
    
}
