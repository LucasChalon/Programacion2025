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
public class Punto3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir un número positivo al usuario
        System.out.print("Ingrese un número entre 1 y 99: (positivos) ");
        int num = scanner.nextInt();

        //Se verifica que se encuentre en el rango pedido
        if (num >= 1 && num <= 99) {
            if (num < 10) {
                System.out.println("El número tiene un dígito.");
            } else {
                System.out.println("El número tiene dos dígitos.");
            }
        } else {
            System.out.println("El número ingresado esta fuera de rango.");
        }

        scanner.close();
    }
}

