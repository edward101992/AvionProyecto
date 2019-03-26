/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.proyectoaviones.Inicio;
import static com.oracle.nio.BufferSecrets.instance;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SuperUs
 */
public class TestAvion {
    
    public TestAvion() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void TestAgregar() {
        System.out.println("Agregar Usuario");
        int tipo = 100;
        String nom = "Camilo";
        String ape = "Gutierrez";
        String fecha = "28/12/1996";
        Inicio ini = new Inicio();
        String expResult = "Cliente Insertado";
        String result = ini.agregaCliente(tipo, nom, ape, fecha);
        assertEquals(expResult,result);
        
        if(expResult != result  )
        {
            fail("The Test");
        }
     }
}
