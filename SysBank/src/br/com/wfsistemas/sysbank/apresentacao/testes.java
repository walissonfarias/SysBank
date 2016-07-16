package br.com.wfsistemas.sysbank.apresentacao;

import br.com.wfsistemas.sysbank.entidade.Agencia;
import br.com.wfsistemas.sysbank.entidade.Conta;
import br.com.wfsistemas.sysbank.entidade.ContaCorrente;
import br.com.wfsistemas.sysbank.negocio.ContaBO;
import java.sql.SQLException;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walisson
 */
public class testes {
    public static void main(String[] args) throws SQLException { 
        /*int[] vetor = new int[8]; //cria o vetor com 100 posições
        for(int i = 0; i < vetor.length; i++) {
            int numeroConta = (int) (1 + Math.random()*9); // gera um valor randomico de 0.0 ate menores q 1.0, multiplica por 100 e soma 1. Convertendo o resultado para int.
            vetor[i] = numeroConta; // atribui o valor a cada indice do vetor
        }
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        Random r = new Random();
        int numero = r.nextInt(9999999);
        System.out.println(numero);
        
        Agencia agencia = new Agencia();
        int num = agencia.getNumeroAgencia();
        System.out.println(num);
        
        boolean status = false;
        int numeroConta = 0;
        ContaBO contaBO = null;
        do{
            Random ra = new Random();
            numeroConta = ra.nextInt(9999999);      
            contaBO.verificarNumeroConta(numeroConta,status);
            System.out.println(numeroConta);
        }while(status == true); */         
    }
}