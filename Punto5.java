/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion2025;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Punto5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de coordenadas
        System.out.print("Ingrese la coordenada X (distinta de 0): ");
        int x = scanner.nextInt();

        System.out.print("Ingrese la coordenada Y (distinta de 0): ");
        int y = scanner.nextInt();

        
        if (x == 0 || y == 0) {     //Verificación de que no sean cero
            System.out.println("Las coordenadas no pueden ser cero.");
        } else {
            
            if (x > 0 && y > 0) {   //Determinar el que cuadrante se encuentran
                System.out.println("El punto está en el 1º Cuadrante.");
            } else if (x < 0 && y > 0) {
                System.out.println("El punto está en el 2º Cuadrante.");
            } else if (x < 0 && y < 0) {
                System.out.println("El punto está en el 3º Cuadrante.");
            } else if (x > 0 && y < 0) {
                System.out.println("El punto está en el 4º Cuadrante.");
                //1º Cuadrante: x > 0, y > 
                //02º Cuadrante: x < 0, y > 0
                //3º Cuadrante: x < 0, y < 0
                //4º Cuadrante: x > 0, y < 0
            }
        }

        scanner.close();
    }

}
