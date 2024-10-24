/*
 * Ejercicio2 10/23/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package ejercicios;

import utils.ScannerUtils;

/**
 * 2. Calcula el perímetro y el área de un círculo dado su radio (introducido por teclado),
 * deberás preguntar primero qué cálculo se desea realizar. Dependiendo de la petición
 * del usuario, muestra por consola el aria o el perímetro. Si el usuario no entra un
 * número, se mostrará el mensaje "This is not a number".
 */
public class Ejercicio2 {

    public static void calculoAreaPerimetroCirculo() {
        System.out.print("Ingresa el radio del círculo: ");
        double radio = ScannerUtils.readDouble();

        System.out.println("""
                Seleccione la opción que desea realizar:
                1.  Calcular el área.
                2.  Calcular el perímetro.
                """);
        int option = ScannerUtils.readInt();

        switch (option) {
            case 1:
                double area = Math.PI * radio * radio;
                System.out.printf("El área del círculo con radio %.2f es: %.2f\n", radio, area);
                break;
            case 2:
                double perimetro = 2 * Math.PI * radio;
                System.out.printf("El perímetro del círculo con radio %.2f es: %.2f\n", radio, perimetro);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
