import ejercicios.Ejercicio1;
import ejercicios.Ejercicio2;
import ejercicios.Ejercicio3;
import ejercicios.Ejercicio4;
import utils.Menu;
import utils.ScannerUtils;

/*
 * Main 10/16/2024
 *
 *
 * ©Copyright 2024 Federico Sánchez Vidarte <fedesanchezvidarte@alumnes.ilerna.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
public class Main {

    static int ejercicio;
    static boolean continuar;

    public static void main(String[] args) {
        selectorDeEjercicios();
        ScannerUtils.closeScanner();
    }

    private static void selectorDeEjercicios() {
        do {
            Menu.despliegueMenuPrincipal();

            try {
                ejercicio = ScannerUtils.readInt();
                if (ejercicio == 0) {
                    System.out.println("Fin del programa.");
                    continuar = false;
                    break;
                } else {
                    ejecutarEjercicio(ejercicio);
                    mostrarOpcionesFinEjercicio();
                }
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Por favor ingrese un número válido.");
            }
        } while (continuar);
    }

    /**
     * Método que se ejecuta el finalizar cada ejercicio.
     * Muestra las opciones de volver al menú o cerrar el programa.
     * <p>
     * En el bloque default, continuar = false para cerrar el programa al ingresar una opción inválida.
     */
    private static void mostrarOpcionesFinEjercicio() {
        Menu.menuFinEjercicio();

        int option = ScannerUtils.readInt();
        switch (option) {
            case 0:
                System.out.println("Fin del programa.");
                continuar = false;
                break;
            case 1:
                continuar = true;
                break;
            default:
                System.out.println("Opción no válida. Volviendo al menú principal.");
                continuar = true;
                break;
        }
    }

    private static void ejecutarEjercicio(int numEjercicio) {
        switch (numEjercicio) {
            case 1:
                Ejercicio1.paperSizeCalculator();
                break;
            case 2:
                Ejercicio2.calculoAreaPerimetroCirculo();
                break;
            case 3:
                Ejercicio3.shapesDrawer();
                break;
            case 4:
                Ejercicio4.calculoDescuento();
                break;
            default:
                System.out.println("Ejercicio no definido.");
                break;
        }
    }

}