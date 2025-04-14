package com.mycompany.programacion2025;
import java.util.Scanner;

public class Punto6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la cantidad de triángulos: ");
            int cantidadTriangulos = scanner.nextInt();
            int equilateros = 0;
            int isosceles = 0;
            int escalenos = 0;

            for (int i = 1; i <= cantidadTriangulos; i++) {
                System.out.println("Triángulo " + i + ":");

                System.out.print("Ingrese la longitud del primer lado: ");
                int lado1 = scanner.nextInt();

                System.out.print("Ingrese la longitud del segundo lado: ");
                int lado2 = scanner.nextInt();

                System.out.print("Ingrese la longitud del tercer lado: ");
                int lado3 = scanner.nextInt();

                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("Es un triángulo equilátero.");
                    equilateros++;
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Es un triángulo isósceles.");
                    isosceles++;
                } else {
                    System.out.println("Es un triángulo escaleno.");
                    escalenos++;
                }
            }
            System.out.println("Cantidad de triángulos equiláteros: " + equilateros);
            System.out.println("Cantidad de triángulos isósceles: " + isosceles);
            System.out.println("Cantidad de triángulos escalenos: " + escalenos);

            String tipoMenorCantidad;
            if (equilateros <= isosceles && equilateros <= escalenos) {
                tipoMenorCantidad = "equilátero";
            } else if (isosceles <= equilateros && isosceles <= escalenos) {
                tipoMenorCantidad = "isósceles";
            } else {
                tipoMenorCantidad = "escaleno";
            }
            System.out.println("El tipo de triángulo que posee menor cantidad es: " + tipoMenorCantidad);
        }
    }
