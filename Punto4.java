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
public class Punto4 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el día: (1 AL 30) "); //Ingreso de datos
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes (1 AL 12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        
        if (mes >= 1 && mes <= 12) { //Determinar el trimestre
            if (mes >= 1 && mes <= 3) {
                System.out.println("La fecha corresponde al PRIMER trimestre del año.");
            } else if (mes >= 4 && mes <= 6) {
                System.out.println("La fecha corresponde al SEGUNDO trimestre del año.");
            } else if (mes >= 7 && mes <= 9) {
                System.out.println("La fecha corresponde al TERCER trimestre del año.");
            } else {
                System.out.println("La fecha corresponde al CUARTO trimestre del año.");
            }

            System.out.printf("Fecha ingresada: %02d/%02d/%d\n", dia, mes, anio);
        } else {
            System.out.println("Mes inválido. Debe estar entre 1 y 12.");
        }
        scanner.close();
    }
}

