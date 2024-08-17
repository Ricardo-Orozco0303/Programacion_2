
package lab01_niño.solano.valentina_orozco.flores.ricardo_de.la.hoz.gomez.keinerth;

import java.util.Scanner;

public class Lab01_NiñoSolanoValentina_OrozcoFloresRicardo_DeLaHozGomezKeinerth {

    
    public static void main(String[] args) {
        int ds, dm, mes, año, HH, MM, SS, FRANJA;
        Scanner leer = new Scanner(System.in);

        
        System.out.println("【Ingrese el dia de la semana: 】 ");
        ds = leer.nextInt();
        System.out.println("【Ingrese el dia del mes: 】 ");
        dm = leer.nextInt();
        System.out.println("【Ingrese el mes: 】 ");
        mes = leer.nextInt();
        System.out.println("【Ingrese el año (maximo 2 digitos): 】 ");
        año = leer.nextInt();

        
        boolean añoBisiesto = ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0);

        
        if (!añoBisiesto && mes == 2 && dm > 28) {
            System.out.println("✘ Error ✘: Febrero no puede tener más de 28 días en un año no bisiesto, vuelva a intentarlo...");
            
            return;
        }

        System.out.println("Ingrese la hora 〔En formato 12 horas〕: ");
        HH = leer.nextInt();
        System.out.println("Ingrese el minuto: ");
        MM = leer.nextInt();
        System.out.println("Ingrese los segundos:  ");
        SS = leer.nextInt();
        System.out.println("Ingrese la franja horaria 〔1. a.m, 2. m o 3. p.m〕:  ");
        FRANJA = leer.nextInt();

        
        if (FRANJA < 1 || FRANJA > 3) {
            System.out.println("✘ Error ✘: Franja horaria fuera de rango, vuelva a intentarlo...");
        } else {
            switch (FRANJA) {
                case 1: 
                    if (HH < 0 || HH > 12) {
                        System.out.println("✘ Error ✘: Hora invalida, vuelva a intentarlo...");
                    } else {
                        if (HH == 12) {
                            HH = 0;
                        }
                    }
                    break;
                case 2: 
                    if (HH == 12) {
                     HH = 12;
                    }
                    break;
                case 3: 
                    if (HH < 1 || HH > 12) {
                        System.out.println("✘ Error ✘: Hora invalida, vuelva a intentarlo...");
                    } else {
                        if (HH != 12) {
                            HH = HH + 12;
                        }
                    }
                    break;
            }

            
            if (MM < 0 || MM > 59) {
                System.out.println("✘ Error ✘: Minutos invalidos, vuelva a intentarlo...");
            }
            if (SS < 0 || SS > 59) {
                System.out.println("✘ Error ✘: Segundos invalidos, vuelva a intentarlo...");
            } else {
                SS++;
                if (SS == 60) {
                    SS = 0;
                    MM++;
                    if (MM == 60) {
                        MM = 0;
                        HH++;
                        if (HH == 24) {
                            HH = 0;
                            dm++; 
                            switch (mes) {
                                case 1: case 3: case 5: case 7: case 8: case 10:
                                    if (dm > 31) {
                                        dm = 1;
                                        mes++;
                                    }
                                    break;
                                case 12:
                                    if (dm > 31) {
                                        dm = 1;
                                        mes = 1;
                                        año++;
                                    }
                                    break;
                                case 4: case 6: case 9: case 11:
                                    if (dm > 30) {
                                        dm = 1;
                                        mes++;
                                    }
                                    break;
                                case 2:
                                    if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
                                        if (dm > 29) {
                                            dm = 1;
                                            mes++;
                                        }
                                    } else {
                                        if (dm > 28) {
                                            dm = 1;
                                            mes++;
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                }
            }

            if (ds < 1 || ds > 7) {
                System.out.println("✘ Error ✘: Dia de la semana invalido, vuelva a intentarlo...");
            } else {
                String diaSemana = "";
                switch (ds) {
                    case 1:
                        diaSemana = "Domingo";
                        break;
                    case 2:
                        diaSemana = "Lunes";
                        break;
                    case 3:
                        diaSemana = "Martes";
                        break;
                    case 4:
                        diaSemana = "Miércoles";
                        break;
                    case 5:
                        diaSemana = "Jueves";
                        break;
                    case 6:
                        diaSemana = "Viernes";
                        break;
                    case 7:
                        diaSemana = "Sábado";
                        break;
                }
                System.out.print(diaSemana + ", ");
            }

            if (mes < 1 || mes > 12) {
                System.out.println("✘ Error ✘: Mes invalido, vuelva a intentarlo...");
            } else {
                String nombreMes = "";
                switch (mes) {
                    case 1:
                        nombreMes = "enero";
                        break;
                    case 2:
                        nombreMes = "febrero";
                        break;
                    case 3:
                        nombreMes = "marzo";
                        break;
                    case 4:
                        nombreMes = "abril";
                        break;
                    case 5:
                        nombreMes = "mayo";
                        break;
                    case 6:
                        nombreMes = "junio";
                        break;
                    case 7:
                        nombreMes = "julio";
                        break;
                    case 8:
                        nombreMes = "agosto";
                        break;
                    case 9:
                        nombreMes = "septiembre";
                        break;
                    case 10:
                        nombreMes = "octubre";
                        break;
                    case 11:
                        nombreMes = "noviembre";
                        break;
                    case 12:
                        nombreMes = "diciembre";
                        break;
                }
                System.out.print(nombreMes + " de ");
            }

            if (dm < 1 || dm > 31) {
                System.out.println("✘ Error ✘: Dia de mes invalido, vuelva a intentarlo...");
            } else {
                System.out.print(dm + " de ");
            }

            if (año < 0 || año > 99) {
                System.out.println("✘ Error ✘: El año debe ser de dos digitos");
            } else {
                año = año + 2000;
                System.out.print(año + " - ");
            }

           
            String HHif = (HH < 10) ? "0" + HH : "" + HH;
            
            String MMif = (MM < 10) ? "0" + MM : "" + MM;
            String SSif = (SS < 10) ? "0" + SS : "" + SS;
            

            System.out.println(HHif + ":" + MMif + ":" + SSif);
        }
    }
    
}
