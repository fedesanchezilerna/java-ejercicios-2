/*
 * Ejercicio4 10/23/2024
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
 * Pide el precio de un producto por teclado (precio sin descuento), comprueba que es
 * un número real, sino pide de nuevo el precio. Representa por consola el precio final
 * si aplicamos un descuento en tanto por ciento de 5, 10, 15, 20, 25, 30, 35, 40, 45,
 * 50, 55, 60, 65, 70, 75, 80, 85, 90 y 100. Representa el resultado en dos decimales
 * como máximo.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        calculoDescuento();
    }

    private static void calculoDescuento() {
        System.out.println("""
                MENÚ
                1: Calcular descuento
                0: Salir
                Elige una opción:""");

        int option = ScannerUtils.readInt();
        if (option == 1) {
            System.out.print("Introduce precio: ");
            double precio = ScannerUtils.readDouble();
            mostrarDescuentos(precio);
        }
        System.out.println("Fin del programa.");
    }

    private static void mostrarDescuentos(double pOriginal) {
        for (double i = 5; i <= 100; i = i + 5) {
            double pDescuento = pOriginal - (pOriginal * (i / 100));
            System.out.printf("Descuento %.0f%%: %.2f%n", i, pDescuento);
        }
    }
}
