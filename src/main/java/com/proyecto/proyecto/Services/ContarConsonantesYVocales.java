package com.proyecto.proyecto.Services;
import org.springframework.stereotype.Service;

@Service
public class ContarConsonantesYVocales {
    

    public static boolean esVocal(char letra){
        return "aeiou".contains(String.valueOf(letra).toLowerCase());
    }
    
    public static String contarConsonantes(String palabra){

        int contadorConsonantes =0;
        int contadorVocales =0;
        int longitudPalabra=palabra.length();

        for (int i = 0; i < longitudPalabra; i++) {
            if(esVocal(palabra.charAt(i))) contadorConsonantes++;
            else contadorVocales++;
        }
        return "El número de consonantes es: " + contadorConsonantes  +  " y el número de vocales es: " + contadorVocales;
    }
}