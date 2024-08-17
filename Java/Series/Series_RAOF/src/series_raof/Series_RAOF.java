/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package series_raof;

import java.util.Scanner;

/**
 *
 * @author Ricardoao
 */
public class Series_RAOF {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int V ,Op, R = 0,R_2 = 0;
        float  R_3,Sum = 0;
        double R_4 = 1,Sum_2 = 0;
        System.out.println("♓------♓---------♓-------♓- Bienvenido al proyecto de series -♓------♓---------♓---------♓");
        System.out.println("♓-                               1. 1^3 + 2^3 + 3^3 + ....+                               -♓");
        System.out.println("♓-                               2. 1 x 2 + 2 x 3 + 3 x 4 .... +                          -♓");
        System.out.println("♓-                               3. 2 + 4 + 6 + 8 + ... +                                 -♓");
        System.out.println("♓-                               4. 1 + 4 + 7 + 10 + ... +                                -♓");
        System.out.println("♓-                               5. 3^1 + 3^2 + 3^3 + ....+                               -♓");
        System.out.println("♓-                               6. 6 + 4 + 2 + 0 + ... +                                 -♓");
        System.out.println("♓-                               7. 2 - 16 - 30 -                                         -♓");
        System.out.println("♓-                               8. 1/1X2 + 1/2X3 + 1/3X4 + ... +                         -♓");
        System.out.println("♓-                               9. 1 - 1/3 + 1/9 - 1/27 +...+                            -♓");
        System.out.println("♓------♓---------♓-------♓------♓-----♓-----♓-----♓-----♓------♓------♓---------♓-------♓");
        System.out.println("por favor escoge una secuencia ");
        Op = Sc.nextInt();
        System.out.println("♓------♓---------♓-------♓------♓-----♓-----♓-----♓-----♓------♓------♓---------♓-------♓ ");
        switch (Op){
            case 1 :
                System.out.println("Dame un numero para seguir la secuencia ");
                V = Sc.nextInt();
                for(int I = 1; I <= V ; ++I){
                    R = (int) Math.pow(I,3) ;
                    System.out.println("Tu secuencia es :" + R );
                    R_2 += R;
                }
                System.out.println("La suma de la serie es: " + R_2 );
                break;
            case 2 :
                System.out.println("Dame un numero para seguir la secuencia ");
                V = Sc.nextInt();
                for( int I = 1 , J = 2 ; I <= V ; ++I , ++J){
                    R = I * J ;
                    System.out.println("Tu secuencia es : " + I +" X "+ J + " = "+ R );
                    R_2 += R;
                }
                System.out.println("La suma de la serie es: " + R_2 );
                break;
            case 3 :
                System.out.println("Dame un numero para seguir la secuencia ");
                V = Sc.nextInt();
                for(int I = 1 ; I <= V ; ++I){
                    R =  I + I ;
                    System.out.println("Tu secuencia es : " + R );
                    R_2 += R;
                }
                System.out.println("La suma de la serie es: " + R_2 );
                break;
            case 4 :
                System.out.println("Dame un numero para seguir la secuencia ");
                V = Sc.nextInt();
                for (int I = 0; I < V; ++I) {
                 R = 1 + I * 3;
                 System.out.println("Tu secuencia es : " + R);
                 R_2 += R;
                }
                System.out.println("La suma de la serie es: " + R_2 );
                break;
            case 5 :
                System.out.println("Dame un numero para seguir la secuencia ");
                V = Sc.nextInt();
                for(int I = 1; I <= V ; ++I){
                    R = (int) Math.pow(3,I) ;
                    System.out.println("Tu secuencia es :" + R );
                    R_2 += R;
                }
                System.out.println("La suma de la serie es: " + R_2 );
                break;
            case 6 :
                System.out.println("Dame un numero para seguir la secuencia ");
                V = Sc.nextInt();
                for (int I = 0; I < V; ++I) {
                 R = 6 + I * -2;
                 R_2 += R;
                 System.out.println("Tu secuencia es :"+ R);
                }
                System.out.println("La suma de la serie es: " + R_2 );
                break;
            case 7 :
                System.out.println("Dame un numero para seguir la secuencia ");
                V = Sc.nextInt();
                for (int I = 0; I < V; ++I) {
                 R = 2 + I * 14;
                 System.out.println("Tu secuencia es :" + R);
                 R_2 += R;
                }
                System.out.println("La suma de la serie es: " + R_2 );
                break;
            case 8 :
                System.out.println("Dame un numero para seguir la secuencia ");
                V = Sc.nextInt();
                for( int I = 1 , J = 2 ; I <= V ; ++I , ++J){
                     R_3 = (float) I * J;
                        System.out.println("Tu secuencia es :" + "1/" + I + " X " + J + " = " + " (" + 1/R_3+ ")");
                        Sum += (1.0 / R_3);
                    }
                   System.out.println("La suma de la serie es: " + Sum);
                break;
            case 9 :
                System.out.println("Dame un numero para seguir la secuencia ");
                V = Sc.nextInt();
                        for(int I = 0; I < V; I++){
                            if (I % 2 == 0 ){
                                Sum_2 += R_4;
                            } else{
                                Sum_2 -= R_4;
                            }
                            R_4 /= 3.0;
                        }                
                        System.out.println("La suma de la serie es: " + Sum_2);
                break;
            default :
                System.out.println("ERROR, POR FAVOR DIGITE UNA OPCION CORRECTA."); 
        }
    }
}
    
