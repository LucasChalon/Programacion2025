package com.mycompany.programacion2025;
import java.util.Scanner;

/**
 *
 * @author lucas
 */


public class Programacion2025 {

    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
        
    System.out.println("Ingresar la nota del alumno: "); // Se pide la nota a verificar del alumno
    
    double nota = scanner.nextDouble();
    
    if(nota<4){
        System.out.println("Esta desaprobado");
    } else if(nota>=4 && nota<10){
        System.out.println("Esta Aprobado");
    } else if(nota == 10){
        System.out.println("Esta Aprobado - Sobresaliente");
} else {
    System.out.println("Nota invalida");
    }
    scanner.close();
    }
    }
