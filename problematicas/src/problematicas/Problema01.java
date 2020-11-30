/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problematicas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;
        double estatura;
        int edad;
        boolean bandera = true;
        String salir;
        int sumaEdades = 0;
        double sumaEstaturas = 0.0;
        int contador = 0;
        double promedioEdad;
        double promedioEstatura;
        String cadena_edad = "";

        cadenaReporte = String.format("%s%s\n", cadenaReporte,
                "Listado de Jugadores");

        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextDouble();

            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            contador = contador + 1;

            cadena_edad = String.format("%s\n%s", cadena_edad, edad);

            cadenaReporte = String.format("%s%d.%s -%s-, edad %d, "
                    + "estatura %.2f\n",
                    cadenaReporte,
                    contador,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);

            entrada.nextLine();

            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if (salir.equals("si")) {
                bandera = false;
            }
        } while (bandera);

        promedioEdad = (double) sumaEdades / contador;
        promedioEstatura = sumaEstaturas / contador;

        cadenaReporte = String.format("%sListado de Edadades%s\n"
                + "Promedio de edades: %.2f\n",
                cadenaReporte, cadena_edad, promedioEdad);

        cadenaReporte = String.format("%sPromedio de estaturas: %.2f\n",
                cadenaReporte, promedioEstatura);

        System.out.printf("%s\n", cadenaReporte);
    }

}
