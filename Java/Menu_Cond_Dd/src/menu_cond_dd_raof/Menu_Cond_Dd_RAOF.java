/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu_cond_dd_raof;

import java.util.Scanner;

public class Menu_Cond_Dd_RAOF {

    public static void main(String[] args) {
        int Op, OP_2, Mes,Mes_2,Dia , Año, N_R, N_V, V, R, I;
        Scanner Leer = new Scanner(System.in);
        System.out.println("♓-------♓-------♓-Bienvenido-♓-------♓-------♓");
        System.out.println("♓ 1.Nombre del mes                             ♓");
        System.out.println("♓ 2.Digito en romano                           ♓");
        System.out.println("♓ 3.Vocal                                      ♓");
        System.out.println("♓ 4.Ley de ohm                                 ♓");
        System.out.println("♓ 5.Fecha                                      ♓");
        System.out.println("♓ 6.Salir                                      ♓");
        System.out.println("♓-------♓-------♓------♓------♓-------♓-------♓");
        System.out.println("Con cual opcion desea empezar: ");
        Op = Leer.nextInt();
        if (Op < 1 | Op > 6) {
            System.out.println("Opcion invalida, Vuelva a empezar. ");
        } else {
            switch (Op) {
                case 1:
                    System.out.println("Digite el numero del mes que guiere saber su nombre: ");
                    Mes = Leer.nextInt();
                    switch (Mes) {
                        case 1:
                            System.out.println("Corresponde al mes de ENERO");
                            break;
                        case 2:
                            System.out.println("Corresponde al mes de FEBRERO");
                            break;
                        case 3:
                            System.out.println("Corresponde al mes de MARZO");
                            break;
                        case 4:
                            System.out.println("Corresponde al mes de ABRIL");
                            break;
                        case 5:
                            System.out.println("Corresponde al mes de MAYO");
                            break;
                        case 6:
                            System.out.println("Corresponde al mes de JUNIO");
                            break;
                        case 7:
                            System.out.println("Corresponde al mes de JULIO");
                            break;
                        case 8:
                            System.out.println("Corresponde al mes de AGOSTO");
                            break;
                        case 9:
                            System.out.println("Corresponde al mes de SEPTIEMBRE");
                            break;
                        case 10:
                            System.out.println("Corresponde al mes de OCTUBRE");
                            break;
                        case 11:
                            System.out.println("Corresponde al mes de NOVIEMBRE");
                            break;
                        case 12:
                            System.out.println("Corresponde al mes de DICIEMBRE");
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Mes no valido");
                    }
                    break;
                case 2:
                    System.out.println("Digite un numero del 1 al 10 para mostrar su equivalente : ");
                    N_R = Leer.nextInt();
                    switch (N_R) {
                        case 1:
                            System.out.println("El numero equivale a: I ");
                            break;
                        case 2:
                            System.out.println("El numero equivale a: II ");
                            break;
                        case 3:
                            System.out.println("El numero equivale a: III ");
                            break;
                        case 4:
                            System.out.println("El numero equivale a: IV ");
                            break;
                        case 5:
                            System.out.println("El numero equivale a: V ");
                            break;
                        case 6:
                            System.out.println("El numero equivale a: VI ");
                            break;
                        case 7:
                            System.out.println("El numero equivale a: VII ");
                            break;
                        case 8:
                            System.out.println("El numero equivale a: VIII ");
                            break;
                        case 9:
                            System.out.println("El numero equivale a: IX ");
                            break;
                        case 10:
                            System.out.println("El numero equivale a: X ");
                            break;
                        default:
                            System.out.println("Numero no valido");
                    }
                    break;
                case 3:
                    System.out.println(" Digita un numero del 1 al 5 para mostrae su equivalente en vocal ");
                    N_V = Leer.nextInt();
                    switch (N_V) {
                        case 1:
                            System.out.println(" El numero equivale a la vocal A");
                            break;
                        case 2:
                            System.out.println(" El numero equivale a la vocal E");
                            break;
                        case 3:
                            System.out.println(" El numero equivale a la vocal I");
                            break;
                        case 4:
                            System.out.println(" El numero equivale a la vocal O");
                            break;
                        case 5:
                            System.out.println(" El numero equivale a la vocal U");
                            break;
                        default:
                            System.out.println("Numero no valido");
                    }
                    break;
                case 4:
                    System.out.println("♎----♎---Ley de ohm---♎---♎");
                    System.out.println("♎--------1.voltaje --------♎");
                    System.out.println("♎--------2.Resistencia-----♎");
                    System.out.println("♎--------3.Intensidad------♎");
                    System.out.println("♎------♎-----♎-----♎------♎");
                    System.out.println("Digita una opcion dependiendo del valor a hallar: ");
                    OP_2 = Leer.nextInt();
                    switch (OP_2) {
                        case 1:
                            System.out.println("Digita el valor del Intensidad");
                            I = Leer.nextInt();
                            System.out.println("Digita el valor de la Resistencia");
                            R = Leer.nextInt();
                            V = I * R;
                            System.out.println("El valor del voltaje es:" + V);
                            break;

                        case 2:
                            System.out.println("Digita el valor del Voltaje ");
                            V = Leer.nextInt();
                            System.out.println("Digita el valor de la Intensidad");
                            I = Leer.nextInt();
                            R = V / I;
                            System.out.println("El valor de la resistencia es:" + R);
                            break;
                        case 3:
                            System.out.println("Digita el valor del Voltaje ");
                            V = Leer.nextInt();
                            System.out.println("Digita el valor de la resistencia");
                            R = Leer.nextInt();
                            I = V / R;
                            System.out.println("El valor de la Intensidad es:" + I);
                            break;
                        default:
                           System.out.println(" Digita un valor valido por favor  ");             
                    }
                    break;
                case 5:
                    System.out.println("Digite el Mes de la fecha: ");
                    Mes_2 = Leer.nextInt();
                    System.out.println("Digite el Dia de la fecha: ");
                    Dia = Leer.nextInt();
                    System.out.println("Digite el Año de la fecha: ");
                    Año = Leer.nextInt();
                    switch (Mes_2) {
                        case 1:
                            System.out.println("Enero, " + Dia + " de " + Año);
                            break;
                        case 2:
                            System.out.println("FEBRERO,"+ Dia + " de " + Año);
                            break;
                        case 3:
                            System.out.println("MARZO,"+ Dia + " de " + Año);
                            break;
                        case 4:
                            System.out.println("ABRIL,"+ Dia + " de " + Año);
                            break;
                        case 5:
                            System.out.println(" MAYO,"+ Dia + " de " + Año);
                            break;
                        case 6:
                            System.out.println("JUNIO,"+ Dia + " de " + Año);
                            break;
                        case 7:
                            System.out.println("JULIO,"+ Dia + " de " + Año);
                            break;
                        case 8:
                            System.out.println("AGOSTO,"+ Dia + " de " + Año);
                            break;
                        case 9:
                            System.out.println("SEPTIEMBRE,"+ Dia + " de " + Año);
                            break;
                        case 10:
                            System.out.println("OCTUBRE,"+ Dia + " de " + Año);
                            break;
                        case 11:
                            System.out.println("NOVIEMBRE,"+ Dia + " de " + Año);
                            break;
                        case 12:
                            System.out.println("DICIEMBRE,"+ Dia + " de " + Año);
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Mes no valido");
                    }
                    break;
                case 6:
                    System.out.println("Gracias por usar nuestro servicio...Vuelve Pronto");
                    break;  
                   
            }
        }
    }
}
