/*
 * Ejercicio1 10/23/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package ejercicios;

import utils.ScannerUtils;

public class Ejercicio1 {

    private static final String A1_SIZE = "594 x 841 mm";
    private static final String A2_SIZE = "420 x 594 mm";
    private static final String A3_SIZE = "297 x 420 mm";
    private static final String A4_SIZE = "210 x 297 mm";
    private static final String A5_SIZE = "148 x 210 mm";
    private static final String A6_SIZE = "105 x 148 mm";
    private static final String A7_SIZE = "74 x 105 mm";
    private static final String A8_SIZE = "52 x 74 mm";
    private static final String UNKNOWN_SIZE_MSG = "Tamaño de papel inexistente.";
    private static final String KNOWN_SIZE_MSG = "Tamaños de papel existentes: A1 | A2 | A3 | A4 | A5 | A6 | A7 | A8";

    public static void main(String[] args) {
        paperSizeCalculator();
    }

    /**
     * Solicita un tamaño de papel,
     * verifica su existencia
     * imprime el tamaño en mm si el tamaño existe.
     */
    private static void paperSizeCalculator() {
        System.out.print("Introduce el tamaño del papel: ");
        String paperSize = ScannerUtils.getScanner().nextLine().toUpperCase();

        // Determina dimensiones basándonos en el tamaño
        switch (paperSize) {
            case "A1":
                System.out.println("El tamaño del papel " + paperSize + " es: " + A1_SIZE);
                break;
            case "A2":
                System.out.println("El tamaño del papel " + paperSize + " es: " + A2_SIZE);
                break;
            case "A3":
                System.out.println("El tamaño del papel " + paperSize + " es: " + A3_SIZE);
                break;
            case "A4":
                System.out.println("El tamaño del papel " + paperSize + " es: " + A4_SIZE);
                break;
            case "A5":
                System.out.println("El tamaño del papel " + paperSize + " es: " + A5_SIZE);
                break;
            case "A6":
                System.out.println("El tamaño del papel " + paperSize + " es: " + A6_SIZE);
                break;
            case "A7":
                System.out.println("El tamaño del papel " + paperSize + " es: " + A7_SIZE);
                break;
            case "A8":
                System.out.println("El tamaño del papel " + paperSize + " es: " + A8_SIZE);
                break;
            default:
                System.out.println(UNKNOWN_SIZE_MSG);
                System.out.println(KNOWN_SIZE_MSG);
                break;
        }
    }
}