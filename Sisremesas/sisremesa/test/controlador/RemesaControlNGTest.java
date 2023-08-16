/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.entidad.Remesa;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ruben Figueroa
 */
public class RemesaControlNGTest {
    
    public RemesaControlNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getListaRemesas method, of class RemesaControl.
     */
    @Test
    public void testGetListaRemesas() {
        System.out.println("getListaRemesas");
        RemesaControl instance = new RemesaControl();
        List expResult = null;
        List result = instance.getListaRemesas();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaRemesas method, of class RemesaControl.
     */
    @Test
    public void testSetListaRemesas() {
        System.out.println("setListaRemesas");
        List<Remesa> listaRemesas = null;
        RemesaControl instance = new RemesaControl();
        instance.setListaRemesas(listaRemesas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRemesa method, of class RemesaControl.
     */
    @Test
    public void testGetRemesa() {
        System.out.println("getRemesa");
        RemesaControl instance = new RemesaControl();
        Remesa expResult = null;
        Remesa result = instance.getRemesa();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRemesa method, of class RemesaControl.
     */
    @Test
    public void testSetRemesa() {
        System.out.println("setRemesa");
        Remesa remesa = null;
        RemesaControl instance = new RemesaControl();
        instance.setRemesa(remesa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoginControl method, of class RemesaControl.
     */
    @Test
    public void testGetLoginControl() {
        System.out.println("getLoginControl");
        RemesaControl instance = new RemesaControl();
        LoginControl expResult = null;
        LoginControl result = instance.getLoginControl();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoginControl method, of class RemesaControl.
     */
    @Test
    public void testSetLoginControl() {
        System.out.println("setLoginControl");
        LoginControl loginControl = null;
        RemesaControl instance = new RemesaControl();
        instance.setLoginControl(loginControl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiarRemesa method, of class RemesaControl.
     */
    @Test
    public void testLimpiarRemesa() {
        System.out.println("limpiarRemesa");
        RemesaControl instance = new RemesaControl();
        instance.limpiarRemesa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarRemesa method, of class RemesaControl.
     */
    @Test
    public void testAgregarRemesa() {
        System.out.println("agregarRemesa");
        RemesaControl instance = new RemesaControl();
        instance.agregarRemesa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarRemesa method, of class RemesaControl.
     */
    @Test
    public void testModificarRemesa() {
        System.out.println("modificarRemesa");
        RemesaControl instance = new RemesaControl();
        instance.modificarRemesa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarRemesa method, of class RemesaControl.
     */
    @Test
    public void testEliminarRemesa() {
        System.out.println("eliminarRemesa");
        RemesaControl instance = new RemesaControl();
        instance.eliminarRemesa();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaPaises method, of class RemesaControl.
     */
    @Test
    public void testGetListaPaises() {
        System.out.println("getListaPaises");
        RemesaControl instance = new RemesaControl();
        List expResult = null;
        List result = instance.getListaPaises();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaEstados method, of class RemesaControl.
     */
    @Test
    public void testGetListaEstados() {
        System.out.println("getListaEstados");
        RemesaControl instance = new RemesaControl();
        List expResult = null;
        List result = instance.getListaEstados();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaFormasPago method, of class RemesaControl.
     */
    @Test
    public void testGetListaFormasPago() {
        System.out.println("getListaFormasPago");
        RemesaControl instance = new RemesaControl();
        List expResult = null;
        List result = instance.getListaFormasPago();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaPersonasEnvian method, of class RemesaControl.
     */
    @Test
    public void testGetListaPersonasEnvian() {
        System.out.println("getListaPersonasEnvian");
        RemesaControl instance = new RemesaControl();
        List expResult = null;
        List result = instance.getListaPersonasEnvian();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaPersonasReciben method, of class RemesaControl.
     */
    @Test
    public void testGetListaPersonasReciben() {
        System.out.println("getListaPersonasReciben");
        RemesaControl instance = new RemesaControl();
        List expResult = null;
        List result = instance.getListaPersonasReciben();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
