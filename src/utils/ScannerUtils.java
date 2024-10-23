/*
 * Scanner 10/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package utils;

import java.util.Scanner;

public class ScannerUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    /**
     * Lee un Integer de manera segura. Si el input ingresado no es un integer válido,
     * muestra al usuario que ingrese un número válido.
     * Reads an integer from the console safely. If the input is not a valid integer,
     * it prompts the user again until a valid integer is provided.
     *
     * @return The integer value provided by the user.
     */
    public static int readInt() {
        int number;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada inválida. No es un número entero.");
                System.out.print("Por favor, introduce un número entero: ");
            }
        }
        return number;
    }

    /**
     * Reads a double from the console safely. If the input is not a valid double,
     * it prompts the user again until a valid double is provided.
     *
     * @return The double value provided by the user.
     */
    public static double readDouble() {
        double number;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada inválida. No es un número decimal.");
                System.out.print("Por favor, introduce un número decimal: ");
            }
        }
        return number;
    }

    public static void closeScanner() {
        scanner.close();
    }
}
