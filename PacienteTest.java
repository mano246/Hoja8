/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manolo
 */
public class PacienteTest {
    
    public PacienteTest() {
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

    /**
     * Test of getNombre method, of class Paciente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Paciente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Paciente instance = new Paciente();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnfermedad method, of class Paciente.
     */
    @Test
    public void testGetEnfermedad() {
        System.out.println("getEnfermedad");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getEnfermedad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnfermedad method, of class Paciente.
     */
    @Test
    public void testSetEnfermedad() {
        System.out.println("setEnfermedad");
        String enfermedad = "";
        Paciente instance = new Paciente();
        instance.setEnfermedad(enfermedad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrioridad method, of class Paciente.
     */
    @Test
    public void testGetPrioridad() {
        System.out.println("getPrioridad");
        Paciente instance = new Paciente();
        String expResult = "";
        String result = instance.getPrioridad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrioridad method, of class Paciente.
     */
    @Test
    public void testSetPrioridad() {
        System.out.println("setPrioridad");
        String prioridad = "";
        Paciente instance = new Paciente();
        instance.setPrioridad(prioridad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Paciente.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Paciente paciente = null;
        Paciente instance = new Paciente();
        int expResult = 0;
        int result = instance.compareTo(paciente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
