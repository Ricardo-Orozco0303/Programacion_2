print("🍕-------🍕-------🍕----Bienvenido a la----🍕-------🍕-------🍕 "
  + "\n🍕-------🍕-------🍕-pizzería Bella Napoli-🍕-------🍕-------🍕")
print("🍕------Ofrecemos pizzas vegetarianas y no vegetariana-------🍕")
print("🍕--------Marca 1. si quieres una pizza vegetariana----------🍕 ")
print("🍕--------Marca 2. si quieres una no pizza vegetariana-------🍕 ")
print("🍕-------🍕-------🍕----------🍕-----------🍕-------🍕-------🍕 ")
print("Por favor elige una opcion para continuar. ")
Op = input()
if Op == "1":
    print("🍕--------🍕--------🍕---------🍕--------🍕-------🍕-------🍕")
    print("🍕--------Ingredientes para una pizza vegetariana----------🍕")
    print("🍕----------------------- 1.Pimiento ----------------------🍕")
    print("🍕------------------------ 2.Tofu -------------------------🍕")
    print("🍕--------🍕--------🍕--------🍕----------🍕-------🍕------🍕")
    print("Por favor elige un ingrediente para continuar para continuar.")
    Op_2 = input()
    if Op_2 == "1":
        print("🍕-------🍕-------🍕--------🍕---------🍕-------🍕-------🍕")
        print("🍕--------------- Tu pizza vegetariana con: ---------------🍕")
        print("🍕--------------------- * Mozzarella ----------------------🍕")
        print("🍕--------------------- * Tomate     ----------------------🍕")
        print("🍕--------------------- * pimiento   ----------------------🍕")
        print("🍕-------🍕-------🍕--------🍕--------🍕-------🍕-------🍕")
        print("");
        print("------------------------------------------------------------")
        print(" Resumen de tu pedido:\n"
              + "  * Vegetariana: Sí.\n"
              + "  * Ingredientes: Mozzarella, Tomate, pimiento.")
    elif Op_2 == "2":
        print("🍕-------🍕-------🍕--------🍕----------🍕-------🍕------🍕")
        print("🍕--------------- Tu pizza vegetariana con: ---------------🍕")
        print("🍕--------------------- * Mozzarella ----------------------🍕")
        print("🍕--------------------- * Tomate     ----------------------🍕")
        print("🍕--------------------- * Tofu       ----------------------🍕")
        print("🍕-------🍕-------🍕--------🍕----------🍕-------🍕------🍕")
        print("");
        print("------------------------------------------------------------");
        print(" Resumen de tu pedido:\n"
              + "  * Vegetariana: Sí.\n"
              + "  * Ingredientes: Mozzarella, Tomate, Tofu. ");
    else:
        print("Por favor digita una opcion correcta")
elif Op == "2":
    print("🍕--------🍕---------🍕-----------🍕---------🍕-------🍕-------🍕")
    print("🍕--------Ingredientes para una pizza no vegetariana-----------🍕")
    print("🍕------------------------- 1.Peperoni ------------------------🍕")
    print("🍕------------------------- 2.Jamón    ------------------------🍕")
    print("🍕------------------------- 3.Salmón   ------------------------🍕")
    print("🍕--------🍕---------🍕-----------🍕--------🍕--------🍕-------🍕")
    print("Por favor elige un ingrediente para continuar para continuar.")
    Op_2 = input()
    if Op_2 == "1":
        print("🍕---------🍕---------🍕--------🍕---------🍕-------🍕-------🍕")
        print("🍕--------------- Tu pizza no vegetariana con: ---------------🍕")
        print("🍕--------------------- * Mozzarella -------------------------🍕")
        print("🍕--------------------- * Tomate     -------------------------🍕")
        print("🍕--------------------- * Peperoni   -------------------------🍕")
        print("🍕---------🍕---------🍕--------🍕---------🍕-------🍕-------🍕")
        print("")
        print("------------------------------------------------------------")
        print(" Resumen de tu pedido:\n"
              + "  * Vegetariana: No.\n"
              + "  * Ingredientes: Mozzarella, Tomate, Peperoni. ")
    elif Op_2 == "2":
        print("🍕--------🍕---------🍕----------🍕---------🍕-------🍕-------🍕")
        print("🍕--------------- Tu pizza no vegetariana con: ---------------🍕")
        print("🍕--------------------- * Mozzarella -------------------------🍕")
        print("🍕--------------------- * Tomate     -------------------------🍕")
        print("🍕--------------------- * Jamón      -------------------------🍕")
        print("🍕--------🍕---------🍕----------🍕---------🍕-------🍕-------🍕")
        print("")
        print("--------------------------------------------------------------")
        print(" Resumen de tu pedido:\n"
              + "  * Vegetariana: No.\n"
              + "  * Ingredientes: Mozzarella, Tomate, Jamón. ")
    elif Op_2 == "3":
        print("🍕-------🍕--------🍕----------🍕---------🍕-------🍕-------🍕")
        print("🍕--------------- Tu pizza no vegetariana con: -------------🍕")
        print("🍕--------------------- * Mozzarella -----------------------🍕")
        print("🍕--------------------- * Tomate     -----------------------🍕")
        print("🍕--------------------- * Salmón     -----------------------🍕")
        print("🍕-------🍕--------🍕----------🍕---------🍕-------🍕-------🍕")
        print("")
        print("--------------------------------------------------------------")
        print(" Resumen de tu pedido:\n"
              + "  * Vegetariana: No.\n"
              + "  * Ingredientes: Mozzarella, Tomate, Salmón ")
    else:
        print("Por favor digita una opcion correcta")
else:
    print("Por favor digita una opcion correcta")