/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu_series_sucesiones_raof;

import java.util.Scanner;

/**
 *
 * @author Ricardoao
 */
public class Menu_Series_Sucesiones_RAOF {

    public static void main(String[] args) {
        int Op, Op_2;
        Scanner Sc = new Scanner(System.in);
        System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚Bienvenido⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
        System.out.println("⮛                 1. Potencia                     ⮛");
        System.out.println("⮛                 2. Numeros Pares                ⮛");
        System.out.println("⮛                 3. Suma Pares                   ⮛");
        System.out.println("⮛                 4. Sumatorias Independientes    ⮛");
        System.out.println("⮛                 5. Sumatorias Anidadas          ⮛");
        System.out.println("⮛                 6. Salir                        ⮛");
        System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
        System.out.println("Por favor escoge una opcion");
        Op = Sc.nextInt();
        System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
        switch (Op) {
            case 1:
                System.out.println(" ");
                System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
                System.out.println("⮛          1. Mientras que               ⮛");
                System.out.println("⮛          2. Hacer Hasta                ⮛");
                System.out.println("⮛          3. Para                       ⮛");
                System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
                System.out.println("Por favor escoge una opcion de acuerdo a tu Ciclo de preferencia");
                Op_2 = Sc.nextInt();
                switch (Op_2) {
                    case 1:
                        int N_1,
                         M_1,
                         R = 1;
                        float T = 1;
                        System.out.println("Por favor dame la base");
                        M_1 = Sc.nextInt();
                        System.out.println("Por favor dame el exponente");
                        N_1 = Sc.nextInt();
                        while (R <= N_1) {
                            T = T * M_1;
                            R++;
                        }
                        System.out.println("Tu resultado es : " + T);
                        break;

                    case 2:
                        int N_2,
                         M_2,
                         O = 1;
                        float U = 1;
                        System.out.println("Por favor dame la base");
                        M_2 = Sc.nextInt();
                        System.out.println("Por favor dame el exponente");
                        N_2 = Sc.nextInt();
                        do {
                            U = U * M_2;
                            O++;
                        } while (O <= N_2);
                        System.out.println("Tu resultado es : " + U);
                        break;
                    case 3:
                        int i,
                         N,
                         M;
                        float P = 1;
                        System.out.println("Por favor dame la base");
                        M = Sc.nextInt();
                        System.out.println("Por favor dame el exponente");
                        N = Sc.nextInt();
                        for (i = 1; i <= N; i++) {
                            P = P * M;
                        }
                        System.out.println("Tu resultado es : " + P);
                        break;
                }
                break;
            case (2):
                System.out.println(" ");
                System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
                System.out.println("⮛          1. Mientras que               ⮛");
                System.out.println("⮛          2. Hacer Hasta                ⮛");
                System.out.println("⮛          3. Para                       ⮛");
                System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
                System.out.println("Por favor escoge una opcion de acuerdo a tu Ciclo de preferencia");
                Op_2 = Sc.nextInt();
                switch (Op_2) {
                    case (1):
                        int N_2,
                         R = 0;
                        System.out.println("Por favor dame para parar la secuencia");
                        N_2 = Sc.nextInt();
                        while (R < N_2) {
                            System.out.println("Tu secuencia es : " + 2 * R);
                            R++;
                        }
                        break;
                    case (2):
                        int N_1,
                         O = 0;
                        System.out.println("Por favor dame para parar la secuencia");
                        N_1 = Sc.nextInt();
                        do {
                            System.out.println("Tu secuencia es : " + 2 * O);
                            O++;
                        } while (O < N_1);
                        break;
                    case (3):
                        int i,
                         N;
                        System.out.println("Por favor dame para parar la secuencia");
                        N = Sc.nextInt();
                        for (i = 0; i < N; i++) {
                            System.out.println("Tu secuencia es : " + 2 * i);
                        }
                        break;
                }
                break;
            case (3):
                System.out.println(" ");
                System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
                System.out.println("⮛          1. Mientras que               ⮛");
                System.out.println("⮛          2. Hacer Hasta                ⮛");
                System.out.println("⮛          3. Para                       ⮛");
                System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
                System.out.println("Por favor escoge una opcion de acuerdo a tu Ciclo de preferencia");
                Op_2 = Sc.nextInt();
                switch (Op_2) {
                    case (1):
                        int P = 1,
                         N_1,
                         S_1 = 0;
                        System.out.println("Por favor dame para la sumatoria de pares ");
                        N_1 = Sc.nextInt();
                        while (P < N_1) {
                            S_1 += 2 * P;
                            P++;
                        }
                        System.out.println("Tu sumatoria es : " + S_1);
                        break;
                    case (2):
                        int R = 1,
                         N_2,
                         S_2 = 0;
                        System.out.println("Por favor dame para la sumatoria de pares ");
                        N_2 = Sc.nextInt();
                        do {
                            S_2 += 2 * R;
                            R++;
                        } while (R < N_2);
                        System.out.println("Tu sumatoria es : " + S_2);
                        break;
                    case (3):
                        int i,
                         N,
                         S = 0;
                        System.out.println("Por favor dame para la sumatoria de pares ");
                        N = Sc.nextInt();
                        for (i = 0; i < N; i++) {
                            S += 2 * i;
                        }
                        System.out.println("Tu sumatoria es : " + S);
                        break;
                }
                break;
            case (4):
                System.out.println(" ");
                System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
                System.out.println("⮛          1. Mientras que               ⮛");
                System.out.println("⮛          2. Hacer Hasta                ⮛");
                System.out.println("⮛          3. Para                       ⮛");
                System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
                System.out.println("Por favor escoge una opcion de acuerdo a tu Ciclo de preferencia");
                Op_2 = Sc.nextInt();
                switch (Op_2) {
                    case (1):
                        int Y = 1 ,N_4 ,S_2 = 0, S_3 = 0, R_2;
                        System.out.println("Por favor dame numero  para la sumatoria ");
                        N_4 = Sc.nextInt();
                        while (Y <= N_4) {
                            S_2 += Y;
                            Y++;
                        }

                        Y = 2;
                        while (Y <= N_4 - 2) {
                            S_3 += Y + 3;
                            Y++;
                        }
                        
                        R_2 = S_3 + S_2 ;
                        System.out.println("El resultado de Tu sumatoria es : " + R_2);
                        break;
                    case (2):
                        int J = 1 ,N_6, S_5 = 0, S_6 = 0, R_9 ;
                        System.out.println("Por favor dame numero  para la sumatoria ");
                        N_6 = Sc.nextInt();
                        do {
                            S_5 += J;
                            J++;
                        } while ( J <= N_6);
                        J = 2;
                        do {
                            S_6 += J + 3;
                            J++;
                        } while (J <= N_6 - 2);
                        R_9 = S_6 + S_5 ;
                        System.out.println("El resultado de Tu sumatoria es : " + R_9);
                        break;
                    case (3):
                        int I , N, S = 0,S_1 = 0,  R_8;
                        System.out.println("Por favor dame numero  para la sumatoria ");
                        N = Sc.nextInt();
                        for (I = 1; I <= N; I++) {
                            S = S + I;
                        }
                        for (I = 2; I <= N - 2; I++) {
                            S_1 = S_1 + I + 3;
                        }
                        R_8 = S + S_1;
                        System.out.println("El resultado de Tu sumatoria es : " + R_8);
                        break;

                }
                break;
            case (5):
                System.out.println(" ");
                System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
                System.out.println("⮛          1. Mientras que               ⮛");
                System.out.println("⮛          2. Hacer Hasta                ⮛");
                System.out.println("⮛          3. Para                       ⮛");
                System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
                System.out.println("Por favor escoge una opcion de acuerdo a tu Ciclo de preferencia");
                Op_2 = Sc.nextInt();
                switch (Op_2) {
                    case(1):
                        int P = 1 , T = 0 , N_5, S_9 = 0 ,S_10 = 0 ;
                        System.out.println("Por favor dame numero  para la sumatoria anidada ");
                        N_5 = Sc.nextInt();
                        while (P <= N_5) 
                            T = 0;
                        while (T <= N_5 - 2) {
                            S_9 += T + 3;
                            T++;
                        }
                        S_10 += S_9;
                        P++;
                      System.out.println("La suma final es: " + S_10);
                        break;
                    case(2):
                        int L = 1  , N_6, S_11 = 0 ,S_12 = 0 ;
                        System.out.println("Por favor dame numero  para la sumatoria anidada ");
                        N_6 = Sc.nextInt();  
                        do {
                            T = 0;
                            do {
                                S_11 += T + 3;
                                T++;
                            } while (T <= N_6 - 2);
                            S_12 += S_11;
                            L++;
                        } while (L <= N_6);
                        
                        System.out.println("La suma final es: " + S_12);
                       break;
                    case(3):
                        int I, J, N, S_7 = 0 , S_8 ;
                        System.out.println("Por favor dame numero  para la sumatoria anidada ");
                        N = Sc.nextInt();
                        for (I = 1; I <= N; I++){
                        
                             S_8 = 0;
                        for (J = 2; J <= N - 2; J++) {
                            S_8 += J + 3;
                        }
                        S_7 = S_7 + S_8;
                        }
                        System.out.println("La suma final es: " + S_7 );
                        break;
                
                case(6):
                System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
                System.out.println("⮛   Gracias por usar nuestro servicio    ⮛");
                System.out.println("⮛⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮚⮛");
                break;
           }
        }
    }
}