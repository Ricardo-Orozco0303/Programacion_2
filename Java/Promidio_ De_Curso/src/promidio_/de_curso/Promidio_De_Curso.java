/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promidio_.de_curso;

/**
 *
 * @author Ricardo
 */
import java.util.Scanner;

public class Promidio_De_Curso {

    public static void main(String[] args) {
        int Op, E_G, E_N_G, E_T_G;
        float P_1, P_2, N_P_1, N_P_2, Prom;
        Scanner Sc = new Scanner(System.in);
        E_G = 0;
        E_N_G = 0;
        E_T_G = 0;
        while (true) {
            System.out.println("¿Deseas añadir un estudiante ?");
            System.out.println("1. Sí"); 
            System.out.println("2. No");
            Op = Sc.nextInt();
            if (Op == 1) {
                System.out.println("Por favor digita la nota del primer parcial");
                P_1 = Sc.nextFloat();
                System.out.println("Por favor digita la nota del Segundo parcial ");
                P_2 = Sc.nextFloat();
                N_P_1 = (float) (P_1 * 0.25);
                N_P_2 = (float) (P_2 * 0.40);
                Prom = N_P_1 + N_P_2;
                System.out.println("La mota del estudiante por hora es de: " + Prom);
                if (Prom >= 3.0) {
                    E_G++;
                } else if (Prom >= 0) {
                    E_T_G++;
                } else {
                    E_N_G++;
                }
            } else if (Op == 2) {
                System.out.println("Gracias por su visita. ¡Hasta luego!");
                System.out.println("");
                System.out.println("Estudiantes que ganan la asignatura: " + E_G);
                System.out.println("Estudiantes que aún no ganan la asignatura: " + E_T_G);
                System.out.println("Estudiantes que tienen definitivamente perdida la asignatura: " + E_N_G);
            } else {
                System.out.println("Opción no válida. Por favor, selecciona 1 o 2.");
            }
       }
    }
}
