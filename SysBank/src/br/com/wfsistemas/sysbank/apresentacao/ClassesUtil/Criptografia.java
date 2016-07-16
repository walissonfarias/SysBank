/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wfsistemas.sysbank.apresentacao.ClassesUtil;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 *
 * @author wff
 */
public class Criptografia {
    
    static public String converterHexadecimalParaString(byte[] valorHexadecimal){
        StringBuilder valorConvertido = new StringBuilder();
          
        for(byte caracter : valorHexadecimal){
            valorConvertido.append(String.format("%02X", 0xFF & caracter));
        }
        return valorConvertido.toString();
    }
    static public String exemploMD5(String texto) throws NoSuchAlgorithmException, UnsupportedEncodingException{  
        MessageDigest algoritmo = MessageDigest.getInstance("MD5");
        byte[] codigoHashHexaDecimal = algoritmo.digest(texto.getBytes("UTF-8"));
        
        String codigoHashFinal = converterHexadecimalParaString(codigoHashHexaDecimal);
        
        return codigoHashFinal;
    }
    
    static public String exemploSHA256(String texto) throws NoSuchAlgorithmException, UnsupportedEncodingException{  
    
        MessageDigest algoritmo = MessageDigest.getInstance("SHA-256");
        byte[] codigoHashHexaDecimal = algoritmo.digest(texto.getBytes("UTF-8"));
        
        String codigoHashFinal = converterHexadecimalParaString(codigoHashHexaDecimal);
        
        return codigoHashFinal;
    }
}
