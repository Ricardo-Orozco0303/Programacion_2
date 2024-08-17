/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labfinal_java_vns_raof_kdlhg;

import java.util.Random; // Para generar numeros aleatorios
import java.util.Scanner;

/**
 *
 * @author valentinanino
 */
public class LabFinal_Java_VNS_RAOF_KDLHG {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int op;
        
            
        System.out.println("♥ Bienvenido al Menú Iterativo ♥");
        System.out.println("♥         1. Dados             ♥");
        System.out.println("♥         2. Punto y Fama      ♥");
        System.out.println("♥         3. La Margarita      ♥");
        System.out.println("♥         4. Salir             ♥");
        System.out.print("Seleccione una opción: ");
        op = leer.nextInt();
        
        while (op < 1 | op > 4) {
            System.out.print("Opción inválida, debe elegir un número del menú: ");
            op = leer.nextInt();
            }

        switch (op) {
            
            case 1: // Dados
                System.out.println("¿Deseas leer las instrucciones del juego? (1. Sí / 2. No):");
                int leerInstrucciones = leer.nextInt();

                if (leerInstrucciones == 1) {
                System.out.println("\"**Instrucciones del juego Dados:**\n" +
"                \"1. El juego se desarrolla entre dos jugadores.\n" +
"                \"2. Cada jugador tiene un turno para lanzar dos dados.\n" +
"                \"3. La suma de los resultados de los dados es el puntaje del jugador en esa tirada.\n" +
"                \"4. Si un jugador saca dobles, tiene la oportunidad de tirar de nuevo y su puntaje en esa tirada se suma al puntaje anterior. \n" +
"                \"5. El primer jugador que alcance 21 puntos o más gana la partida.\n" +
"                \"6. En caso de empate, se juega una ronda adicional para determinar al ganador.");
                }
                //Definimos las variables como enteros
                
                int Score_j1, Score_j2, n_jugadas, dado1_j1, dado2_j1, dado1_j2, dado2_j2, sumaDados1, sumaDados2, totScorej1, totScorej2, difScorej1, difScorej2;
               
                //Inicializamos las variables del numero de jugadas y el puntaje de ambos jugadores en 0
                
                n_jugadas = 0;
                Score_j1 = 0;
                Score_j2 = 0;
                totScorej1 = 0;
                totScorej2 = 0;
                difScorej1 = 0;
                difScorej2 = 0;
                
               //La primera condicion para terminar el juego es si llegan a las 21 jugadas posibles
               while (n_jugadas < 21 && (difScorej1 < 15 || difScorej2 < 15)) {
               //Incrementamos el numero de jugadas
               n_jugadas = n_jugadas + 1;
               System.out.println(" ");
               System.out.println("---------- Jugada # " + n_jugadas + "-----------");
               System.out.println(" ");
               System.out.println("TURNO DEL PRIMER JUGADOR. Presiona enter para lanzar los dados");
               leer.nextLine();
               System.out.println(" ");
              
              
                //Utilizamos random con 6 posibles valores aleatorios para simular las 6 caras de un dado y le sumamos 1 porque random comienza desde el 0
                dado1_j1 = random.nextInt(6) + 1;
                dado2_j1 = random.nextInt(6) + 1;
                sumaDados1 = dado1_j1 + dado2_j1;
            
                //Mostramos la jugada completa del jugador 1 despues de haber tirado los dos dados
            
                System.out.println("La jugada # " + n_jugadas + " del jugador uno, es: PRIMER DADO = " + dado1_j1 + ", SEGUNDO DADO = " + dado2_j1);
            
                //El puntaje es la suma de el resultado de los dos dados
            
                Score_j1 = sumaDados1;
            
               System.out.println(" ");
            
               //Si el jugador 1 saco dobles entonces a el puntaje del jugador 1 se le suma 1 punto
            
               if (dado1_j1 == dado2_j1) {
                   System.out.println("¡DOBLES! El jugador uno gana un punto");
                   Score_j1 = Score_j1 + 1;
                   System.out.println("Su resultado fue: " + sumaDados1 + " Y su puntaje es: " + Score_j1);
                   //Si el jugador saca dobles tiene que tirar otra vez y asi hasta ue deje de sacar dobles
                 do {
                    System.out.println(" ");
                    System.out.println("Vuelva a tirar");
                    leer.nextLine();
                    dado1_j1 = random.nextInt(6) + 1;
                    dado2_j1 = random.nextInt(6) + 1;
                    sumaDados1 = dado1_j1 + dado2_j1;
                    Score_j1 = Score_j1 + sumaDados1;
                    System.out.println(" ");
                    System.out.println("La jugada # " + n_jugadas + " del jugador uno, es: PRIMER DADO = " + dado1_j1 + ", SEGUNDO DADO = " + dado2_j1);
                    System.out.println(" ");
                    System.out.println("Su resultado fue: " + sumaDados1 + " Y su puntaje es: " + Score_j1);
                } while (dado1_j1 == dado2_j1);

                } else {
                //Si el jugador no saca dobles entonces solo se le muestra su resultado de la jugada 
                System.out.println("Su resultado fue: " + sumaDados1 + " Y su puntaje es: " + Score_j1);
                }
                System.out.println(" ");

                //Termina el turno del jugador 1 y pasa el turno al jugador 2
                System.out.println("TURNO DEL SEGUNDO JUGADOR. Presiona enter para lanzar los dados");
                leer.nextLine();
                System.out.println(" ");
                dado1_j2 = random.nextInt(6) + 1;
                dado2_j2 = random.nextInt(6) + 1;
                sumaDados2 = dado1_j2 + dado2_j2;
                System.out.println("La Jugada # " + n_jugadas + " del jugador dos, es: PRIMER DADO = " + dado1_j2 + ", SEGUNDO DADO = " + dado2_j2);
                Score_j2 = sumaDados2;
                System.out.println(" ");
                
                
                if (dado1_j2 == dado2_j2) {
                System.out.println("¡DOBLES! El jugador dos gana un punto");
                Score_j2 = Score_j2 + 1;
                System.out.println(" ");
                System.out.println("Su resultado fue: " + sumaDados2 + " Y su puntaje es: " + Score_j2);
                
                do {
                    System.out.println(" ");
                    System.out.println("Vuelva a tirar");
                    leer.nextLine();
                    dado1_j1 = random.nextInt(6) + 1;
                    dado2_j1 = random.nextInt(6) + 1;
                    sumaDados2 = dado1_j1 + dado2_j1;
                    Score_j2 = Score_j2 + sumaDados2;
                    System.out.println(" ");
                    System.out.println("La jugada # " + n_jugadas + " del jugador dos es: PRIMER DADO = " + dado1_j2 + ", SEGUNDO DADO = " + dado2_j2);
                    System.out.println(" ");
                    System.out.println("Su resultado fue: " + sumaDados2 + " Y su puntaje es: " + Score_j2);
                } while (dado1_j1 == dado2_j1);
                
                 } else {
                System.out.println(" ");
                System.out.println("Su resultado fue: " + sumaDados2 + " Y su puntaje es: " + Score_j2);
             }
            
                totScorej1 = totScorej1 + Score_j1;
                totScorej2 = totScorej2 + Score_j2;
            
            // Si un jugador saca un puntaje mayor que el jugador 2 entonces se le acomulan 3 puntos adicionales a el jugador
            if (Score_j1 > Score_j2) {
                Score_j1 = Score_j1 + 3;
                System.out.println(" ");
                System.out.println("El jugador uno ha ganado esta ronda. Obtienes 3 puntos adicionales");
            } else {
                if (Score_j2 > Score_j1) {
                    Score_j2 = Score_j2 + 3;
                    System.out.println(" ");
                    System.out.println("El jugador dos ha ganado esta ronda. Obtienes 3 puntos adicionales");
                } else {
                    if (sumaDados1 == sumaDados2) {
                        //Si ambos obtienen un puntaje igual la jugada se anula
                        System.out.println(" ");
                        System.out.println("Los jugadores alcanzaron el mismo valor en su jugada. la ronda # " + n_jugadas + " Se anula.");
                        n_jugadas = n_jugadas - 1;
                        totScorej1 = totScorej1 - Score_j1;
                        totScorej2 = totScorej2 - Score_j2;
                    }
                }
            }
            System.out.println("Puntaje total del jugador uno: " + totScorej1);
            System.out.println("Puntaje total del jugador dos: " + totScorej2);
            if (totScorej1 >= totScorej2 + 15) {
                break;
            } else {
                if (totScorej2 >= totScorej1 + 15) {
                    break;
                }
              }
            }
            //Le mostramos el mensaje a los jugadores de quien gano la partida
            if (totScorej1 > totScorej2) {
            System.out.println("¡Felicades! El jugador 1 gana la partida con un puntaje total de: " + totScorej1);
            difScorej1 = totScorej1 - totScorej2;
            System.out.println("Con una diferencia de " + (totScorej1 - totScorej2) + " Sobre el jugador 2");
            } else {
            
            if (totScorej2 > totScorej1) {
                System.out.println("¡Felicades! El jugador 2 gana la partidacon un puntaje total de: " + totScorej2);
                difScorej2 = totScorej2 - totScorej1;
                System.out.println("Con una diferencia de " + (totScorej2 - totScorej1) + " Sobre el jugador 2");
            } else {

                System.out.println("Los jugadores 1 y 2 han empatado la partida. Buena suerte en la proxima...");
            }

            }
                break; 
                
            case 2: // Punto y Fama
                System.out.println("¿Deseas leer las instrucciones del juego? (1. Sí / 2. No):");
                leerInstrucciones = leer.nextInt();

                if (leerInstrucciones == 1) {
                   System.out.println("**Instrucciones del juego Punto y Fama:**\n" +
"                \"1. El objetivo del juego es adivinar un número de cuatro cifras generado aleatoriamente por la computadora.\n" +
"                \"2. El jugador tiene 10 intentos para adivinar el número. \n" +
"                \"3. Cada dígito correcto en la posición correcta se considera una 'Fama'.\n" +
"                \"4. Cada dígito correcto en una posición diferente se considera un 'Punto'.\n" +
"                \"5. El juego termina cuando el jugador alcanza las 4 'Famas'.\n" +
"                \"6. El jugador gana si adivina el número en menos de 10 intentos.");
                   }
                   
                
                
                System.out.println( "Bienvenido al juego Punto y Fama!");
                int intentos = 0, numeroGenerado,n1Jugador1, n2Jugador1, n3Jugador1, n4Jugador1;
                int n1Jugador2, n2Jugador2, n3Jugador2, n4Jugador2, famas, puntos;
                boolean contJuego = true;
                
                do { 
                    // Generar un número aleatorio de cuatro cifras sin dígitos repetidos
                  do {
                    numeroGenerado = random.nextInt(9999);
                    n1Jugador1 = numeroGenerado % 10;
                    n2Jugador1 = numeroGenerado / 10 % 10;
                    n3Jugador1 = numeroGenerado / 100 % 10;
                    n4Jugador1 = numeroGenerado / 1000 % 10;
                    } while (numeroGenerado < 1000 || n1Jugador1 == n2Jugador1 || n1Jugador1 == n3Jugador1 || n1Jugador1 == n4Jugador1 || n2Jugador1 == n3Jugador1 || n2Jugador1 == n4Jugador1 || n3Jugador1 == n4Jugador1);

                    System.out.println("El jugador uno (PC) ha generado el número que tienes que adivinar. ¡Buena suerte!");

                int i = 0;
                int intentoJugador;
                do {
                    // Solicitar al jugador que ingrese un número de cuatro cifras sin dígitos repetidos
                    do {
                        if (i == 0) {
                        System.out.println("Porfavor, intente adivinar el número de cuatro cifras: ");
                        } else {
                        System.out.print("Por favor, ingresa un número válido de cuatro cifras (no puede repetir los dígitos): ");
                        }
                        intentoJugador = leer.nextInt();
                        n1Jugador2 = intentoJugador % 10;
                        n2Jugador2 = intentoJugador / 10 % 10;
                        n3Jugador2 = intentoJugador / 100 % 10;
                        n4Jugador2 = intentoJugador / 1000 % 10;
                        i = i + 1;
                        } while (intentoJugador < 1000 || intentoJugador > 9999 || n1Jugador2 == n2Jugador2 || n1Jugador2 == n3Jugador2 || n1Jugador2 == n4Jugador2 || n2Jugador2 == n3Jugador2 || n2Jugador2 == n4Jugador2 || n3Jugador2 == n4Jugador2);
                        i = 0;
                        famas = 0;
                        puntos = 0;
                        intentos = intentos + 1;
                        
                        // Calcular las famas y los puntos
                        
                        if (n1Jugador2 == n1Jugador1) {
                            famas = famas + 1;
                        }
                        if (n2Jugador2 == n2Jugador1) {
                            famas = famas + 1;
                        }
                        if (n3Jugador2 == n3Jugador1) {
                            famas = famas + 1;
                        }
                        if (n4Jugador2 == n4Jugador1) {
                            famas = famas + 1;
                        }
                        if (n1Jugador2 == n2Jugador1 || n1Jugador2 == n3Jugador1 || n1Jugador2 == n4Jugador1) {
                            puntos = puntos + 1;
                        }
                        if (n2Jugador2 == n1Jugador1 || n2Jugador2 == n3Jugador1 || n2Jugador2 == n4Jugador1) {
                            puntos = puntos + 1;
                            }
                        if (n3Jugador2 == n1Jugador1 || n3Jugador2 == n2Jugador1 || n3Jugador2 == n4Jugador1) {
                            puntos = puntos + 1;
                        }
                        if (n4Jugador2 == n1Jugador1 || n4Jugador2 == n2Jugador1 || n4Jugador2 == n3Jugador1) {
                            puntos = puntos + 1;
                        }
                        
                        // Mostrar las famas y los puntos
                        System.out.println("Famas: " + famas + " Puntos: " + puntos);
                        } while (famas < 4);

                        // Mostrar un mensaje de felicitaciones al jugador por ganar y el número de intentos realizados
                        System.out.println("¡Felicidades! Ganaste. Adivinaste el número en " + intentos + " intentos.");

                        // Preguntar si el jugador desea continuar jugando
                        System.out.println("¿Deseas continuar jugando? (1: Sí / 2: No)");
                        int opcionContinuar = leer.nextInt();
                        leer.nextLine(); // Consumir el carácter de nueva línea
                        if (opcionContinuar != 1) {
                        contJuego = false;
                       }
                       } while (contJuego);
                break;
                       
            case 3: // La Margarita
                System.out.println("¿Deseas leer las instrucciones del juego? (1. Sí / 2. No):");
                leerInstrucciones = leer.nextInt();

                if (leerInstrucciones == 1) {
                   System.out.println("**Instrucciones del juego La Margarita:**\n" +
                "1. El objetivo del juego es ser el último jugador en tomar una ficha del tablero.\n" +
                "2. El juego se desarrolla en turnos.\n" +
                "3. En cada turno, el jugador debe seleccionar una casilla del tablero y quitar una ficha.\n" +
                "4. El jugador también puede optar por quitar una ficha adicional contigua a la primera, si está disponible.\n" +
                "5. El jugador que toma la última ficha del tablero gana la partida.\n");
                }
                
                
                int[] petalos = new int[9];
                int turno_P_J = 1;
                int Respuesta_US;
                int Posiciones_Restantes = 9;
                
                    while (Posiciones_Restantes > 0) {
                    // Mostrar el tablero actual
                    for (int J = 0; J < 9; J++) {
                        System.out.print(petalos[J] + " ");
                        }
                    System.out.println("  ");

                     // Turno del jugador actual
                    System.out.println("Jugador " + turno_P_J + ", es tu turno:");
                    System.out.println("Selecciona una casilla (1-9) para quitar una ficha:");

                    int Lugar_1 = leer.nextInt() - 1; // Convertir a índice 0-8
                    while (Lugar_1 < 0 || Lugar_1 >= 9 || petalos[Lugar_1] != 0) {
                    System.out.println("casilla incorrecta. Elige otra casilla (1-9):");
                    Lugar_1 = leer.nextInt() - 1;
                    }
                    petalos[Lugar_1] = turno_P_J;
                    Posiciones_Restantes--;
                    
                        // Opción de marcar una casilla adicional
                        if (Posiciones_Restantes > 0) {
                        System.out.println("¿Quieres sacar una ficha adicional contigua? (1.Si/2.No):");
                        Respuesta_US = leer.nextInt();

                    if (Respuesta_US == 1) {
                        System.out.println("Selecciona una casilla contigua (1-9) para sacar la segunda ficha:");
                        int Lugar_2 = leer.nextInt() - 1; 
                        while (Lugar_2 < 0 || Lugar_2 >= 9 || petalos[Lugar_2] != 0 || Math.abs(Lugar_2 - Lugar_1) != 1) {
                            System.out.println("casilla incorrecta. Elige otra casilla (1-9):");
                            Lugar_2 = leer.nextInt() - 1;
                        }
                        petalos[Lugar_2] = turno_P_J;
                        Posiciones_Restantes--;
                        }
                        }
                        
                     // Verificar si el juego ha terminado
                    if (Posiciones_Restantes == 0) {
                    System.out.println("¡Felicidades al jugador " + turno_P_J + ", has ganado!");
                    } else {
                        // Cambiar turno
                    turno_P_J = (turno_P_J == 1) ? 2 : 1;
                    }
                    }        
                 break;
            case 4:
                System.out.println("Saliendo del Programa, Adios!!!");
                break;
            default:
            System.out.println("Opción inválida. Intente de nuevo, por favor");
            break;
            
        }

    }

}




    



    
    
  
