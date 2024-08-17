/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzería_raof_vñs;

import java.util.Scanner;

public class Pizzería_RAOF_VÑS {

    public static void main(String[] args) {
        int Op, Op_2;
        Scanner Sc = new Scanner(System.in);
        System.out.println("🍕-------🍕-------🍕----Bienvenido a la----🍕-------🍕-------🍕 "
                + "\n🍕-------🍕-------🍕-pizzería Bella Napoli-🍕-------🍕-------🍕");
        System.out.println("🍕------Ofrecemos pizzas vegetarianas y no vegetariana------🍕");
        System.out.println("🍕--------Marca 1. si quieres una pizza vegetariana---------🍕 ");
        System.out.println("🍕--------Marca 2. si quieres una no pizza vegetariana------🍕 ");
        System.out.println("🍕-------🍕-------🍕----------🍕-----------🍕-------🍕-------🍕 ");
        System.out.println("Por favor elige una opcion para continuar ");
        Op = Sc.nextInt();
        if (Op == 1) {
            System.out.println("🍕-------🍕-------🍕----------🍕-----------🍕-------🍕-------🍕");
            System.out.println("🍕--------Ingredientes para una pizza vegetariana----------🍕");
            System.out.println("🍕----------------------- 1.Pimiento ----------------------🍕");
            System.out.println("🍕------------------------ 2.Tofu -------------------------🍕");
            System.out.println("🍕-------🍕-------🍕----------🍕-----------🍕-------🍕-------🍕");
            System.out.println("Por favor elige un ingrediente para continuar para continuar");
            Op_2 = Sc.nextInt();
            switch (Op_2) {
                case 1:
                    System.out.println("🍕-------🍕-------🍕----------🍕-----------🍕-------🍕-------🍕");
                    System.out.println("🍕--------------- Tu pizza vegetariana con: ---------------🍕");
                    System.out.println("🍕--------------------- * Mozzarella ----------------------🍕");
                    System.out.println("🍕--------------------- * Tomate     ----------------------🍕");
                    System.out.println("🍕--------------------- * pimiento   ----------------------🍕");
                    System.out.println("🍕-------🍕-------🍕----------🍕-----------🍕-------🍕-------🍕");
                    System.out.println("");
                    System.out.println("------------------------------------------------------------");
                    System.out.println(" Resumen de tu pedido:\n"
                            + "  * Vegetariana: Sí\n"
                            + "  * Ingredientes: Mozzarella, Tomate, pimiento ");
                    break;
                case 2:
                    System.out.println("🍕-------🍕-------🍕----------🍕-----------🍕-------🍕-------🍕");
                    System.out.println("🍕--------------- Tu pizza vegetariana con: ---------------🍕");
                    System.out.println("🍕--------------------- * Mozzarella ----------------------🍕");
                    System.out.println("🍕--------------------- * Tomate     ----------------------🍕");
                    System.out.println("🍕--------------------- * Tofu       ----------------------🍕");
                    System.out.println("🍕-------🍕-------🍕----------🍕-----------🍕-------🍕-------🍕");
                    System.out.println("");
                    System.out.println("------------------------------------------------------------");
                    System.out.println(" Resumen de tu pedido:\n"
                            + "  * Vegetariana: Sí\n"
                            + "  * Ingredientes: Mozzarella, Tomate, Tofu ");
                    break;
                default:
                    System.out.println("Por favor digita una opcion correcta");

            }
        } else if (Op == 2) {
            Op_2 = Sc.nextInt();
            switch (Op_2) {
                case 1:
                    System.out.println("🍕--------🍕---------🍕----------🍕-----------🍕-------🍕-------🍕");
                    System.out.println("🍕--------------- Tu pizza no vegetariana con: ---------------🍕");
                    System.out.println("🍕----------------------- * Mozzarella -----------------------🍕");
                    System.out.println("🍕----------------------- * Tomate     -----------------------🍕");
                    System.out.println("🍕----------------------- * Peperoni   -----------------------🍕");
                    System.out.println("🍕--------🍕---------🍕----------🍕-----------🍕-------🍕-------🍕");
                    System.out.println("");
                    System.out.println("------------------------------------------------------------");
                    System.out.println(" Resumen de tu pedido:\n"
                            + "  * Vegetariana: No\n"
                            + "  * Ingredientes: Mozzarella, Tomate, Peperoni ");
                    break;
                case 2:
                    System.out.println("🍕--------🍕---------🍕----------🍕-----------🍕-------🍕-------🍕");
                    System.out.println("🍕--------------- Tu pizza no vegetariana con: ---------------🍕");
                    System.out.println("🍕----------------------- * Mozzarella -----------------------🍕");
                    System.out.println("🍕----------------------- * Tomate     -----------------------🍕");
                    System.out.println("🍕----------------------- * Jamón      -----------------------🍕");
                    System.out.println("🍕--------🍕---------🍕----------🍕-----------🍕-------🍕-------🍕");
                    System.out.println("");
                    System.out.println("------------------------------------------------------------");
                    System.out.println(" Resumen de tu pedido:\n"
                            + "  * Vegetariana: No\n"
                            + "  * Ingredientes: Mozzarella, Tomate, Jamón ");
                    break;
                case 3:
                    System.out.println("🍕--------🍕---------🍕----------🍕-----------🍕-------🍕-------🍕");
                    System.out.println("🍕--------------- Tu pizza no vegetariana con: ---------------🍕");
                    System.out.println("🍕----------------------- * Mozzarella -----------------------🍕");
                    System.out.println("🍕----------------------- * Tomate     -----------------------🍕");
                    System.out.println("🍕----------------------- * Salmón     -----------------------🍕");
                    System.out.println("🍕--------🍕---------🍕----------🍕-----------🍕-------🍕-------🍕");
                    System.out.println("");
                    System.out.println("------------------------------------------------------------");
                    System.out.println(" Resumen de tu pedido:\n"
                            + "  * Vegetariana: No\n"
                            + "  * Ingredientes: Mozzarella, Tomate, Salmón ");
                    break;
                default:
                    System.out.println("Por favor digita una opcion correcta");
            }
         }
    }
}