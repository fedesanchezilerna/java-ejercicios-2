/*
 * Ejercicio3 10/23/2024
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
 * Crea un programa donde se muestre el siguiente menú:
 * Elige una de las siguientes opciones:
 * 1. Cuadrado
 * 2. Pirámide
 * 3. Gráfico 2
 * 4. Tríangulo inverso.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        shapesDrawer();
    }

    private static void shapesDrawer() {
        System.out.print("""
                Elige una de las siguientes opciones:
                1.  Cuadrado
                2.  Pirámide
                3.  Gráfico 2
                4.  Tríangulo inverso.
                
                """);
        int option = ScannerUtils.readInt();

        switch (option) {
            case 1:
                System.out.println("""
                        1.Cuadrado:
                        *****
                        *****
                        *****
                        *****
                        *****
                        """);
                break;
            case 2:
                System.out.println("""
                        2.Pirámide:
                        *
                        **
                        ***
                        ****
                        *****
                        """);
                break;
            case 3:
                System.out.println("""
                        3. Gráfico 2:
                        *
                         *
                          *
                           *
                            *
                        """);
                break;
            case 4:
                System.out.println("""
                        4. Triángulo inverso:
                        *****
                        ****
                        ***
                        **
                        """);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
