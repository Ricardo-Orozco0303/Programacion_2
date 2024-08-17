/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teatro;

import java.util.Scanner;

public class Teatro {

    public static void main(String[] args) {
        float V_B, T_b, T_d, D_C_1, D_C_2, D_C_3, D_C_4, D_C_5, D;
        int Edad, Op;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Dame el valor total de la boleta: ");
        V_B = Sc.nextFloat();
        T_d = 0;
        D_C_1 = 0;
        D_C_2 = 0;
        D_C_3 = 0;
        D_C_4 = 0;
        D_C_5 = 0;

        while (true) {
            System.out.println("\n¿Deseas comprar una boleta?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            Op = Sc.nextInt();

            if (Op == 1) {
                System.out.println("Digita tu edad: ");
                Edad = Sc.nextInt();
                D = 0;
                if (Edad >= 5 && Edad <= 14) {
                    D = (float) (V_B * 0.35);
                    D_C_1 += D;
                } else if (Edad >= 15 && Edad <= 19) {
                    D = (float) (V_B * 0.25);
                    D_C_2 += D;
                } else if (Edad >= 20 && Edad <= 45) {
                    D = (float) (V_B * 0.1);
                    D_C_3 += D;
                } else if (Edad >= 46 && Edad <= 65) {
                    D = (float) (V_B * 0.25);
                    D_C_4 += D;
                } else if (Edad >= 66) {
                    D = (float) (V_B * 0.35);
                    D_C_5 += D;
                } else {
                    System.out.println("Los niños menores de 5 años no pueden entrar al teatro.");
                }
                T_d += D;
                T_b = V_B - D ;   
                System.out.println("Descuento aplicado: $" + D);
                System.out.println(" Tu valor a pagar es de " + T_b);
            } else if (Op == 2) {
                System.out.println("Gracias por su visita. ¡Hasta luego!");
                System.out.println("");
                System.out.println("El teatro deja de percibir:");
                System.out.println("Categoría 1 (5 - 14 años): $" + D_C_1);
                System.out.println("Categoría 2 (15 - 19 años): $" + D_C_2);
                System.out.println("Categoría 3 (20 - 45 años): $" + D_C_3);
                System.out.println("Categoría 4 (46 - 65 años): $" + D_C_4);
                System.out.println("Categoría 5 (66 en adelante): $" + D_C_5);
                System.out.println("Total: $" + T_d);
                break;
            } else {
                System.out.println("Opción no válida. Por favor, selecciona 1 o 2.");
            }
        }
    }
}
