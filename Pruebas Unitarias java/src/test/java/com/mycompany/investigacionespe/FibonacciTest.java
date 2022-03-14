/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.investigacionespe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author arman
 */
public class FibonacciTest {
    
    public FibonacciTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of fibonacci method, of class Fibonacci.
     */
    @Test
    public void testFibonacci() {
        System.out.println("fibonacci");
        int n = 10;
        Fibonacci instance = new Fibonacci();
        int expResult = 55;
        int result = instance.fibonacci(n);
        assertTrue(result==expResult, "Dato recibido: "+String.valueOf(result)+", Valor esperado: "
                +String.valueOf(expResult));
    }

    /**
     * Test of SucesionFibonacci method, of class Fibonacci.
     */
    @Test
    public void testSucesionFibonacci() {
        System.out.println("SucesionFibonacci");
        int n = 10;
        Fibonacci instance = new Fibonacci();
        String expResult = "0, 1, 1, 2, 3, 5";
        String result = instance.SucesionFibonacci(n);
        assertEquals(expResult, result);
    }
    
}
