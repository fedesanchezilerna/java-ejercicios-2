/*
 * Menu 10/24/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package utils;

public class Menu {

    public static void despliegueMenuPrincipal() {
        System.out.println("""
                                
                ============================================
                MENÚ PRINCIPAL
                Seleccione un ejercicio:
                                
                1.  Tamaño de Papel.
                2.  Perímetro/Área de Círculo.
                3.  Figuras impresas.
                4.  Precio y Descuento.
                                
                0.  Salir del programa.
                ============================================
                """);
    }

    public static void menuFinEjercicio() {
        System.out.println("""
                                
                ============================================
                Fin del ejercicio.
                1.  Volver al menú principal
                
                0.  Salir del programa
                ============================================
                """);
    }

    public static void shapesDrawerMenu() {
        System.out.print("""
                Elige una de las siguientes opciones:
                1.  Cuadrado
                2.  Pirámide
                3.  Gráfico 2
                4.  Tríangulo inverso.
                """);
    }

    public static void descuentosMenu() {
        System.out.println("""
                Menú Descuentos:
                1: Calcular descuento
                0: Salir
                Elige una opción:
                """);
    }
}
