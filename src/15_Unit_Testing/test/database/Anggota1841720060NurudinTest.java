/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
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
public class Anggota1841720060NurudinTest extends TestCase{
    Anggota1841720060Nurudin mInstance;

    public Anggota1841720060NurudinTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        mInstance = new Anggota1841720060Nurudin("Nurudin", "Malang", "085456725425");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    @Test
    public void testSearchNurudin() {
        System.out.println("search test anggota");
        String keyword = "Nurudin";
        ArrayList<Anggota1841720060Nurudin> result = mInstance.searchNurudin(keyword);
        ArrayList<Anggota1841720060Nurudin> expResult = mInstance.getByNamaAndAlamatNurudin(keyword, "");
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSaveNurudin() {
        System.out.println("save test anggota");
        this.mInstance.saveNurudin();
        ArrayList<Anggota1841720060Nurudin> expResult = mInstance.getByNamaAndAlamatNurudin(mInstance.getNamaNurudin(), mInstance.getAlamatNurudin());
        assertTrue(expResult.size()>0);
    }

}
