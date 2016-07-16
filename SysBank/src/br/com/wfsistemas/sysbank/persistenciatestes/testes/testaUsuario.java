/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.persistenciatestes.testes;
import junit.framework.*;
/**
 *
 * @author walisson
 */
public class testaUsuario extends TestCase{
    testaSoma testando = new testaSoma();
    public void testExecutaSoma() {
        int PassaValor1 = 10;
        int PassaValor2 = 5;
        int RetornoEsperado = 50;
        int RetornoFeito;
        RetornoFeito = testando.Soma(PassaValor1,PassaValor2);
        assertEquals(RetornoEsperado, RetornoFeito, 0);
    }
}
