/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problematicas;

/**
 *
 * @author xavierchavez
 */
public class Problema04 {

    public static void main(String[] args) {
        int contador = 0;
        String cadena_final = "";
        double valor;
        int numerador1 = 1;
        int numerador2 = -1;
        double resultado = 0;

        for (double i = 1; i <= 15; i += 2) {

            valor = 1 / i;
            contador++;
            if ((contador % 2) == 0) {
                valor = valor * -1;
                cadena_final = String.format("%s%s/%s\n", cadena_final, 
                        numerador2, (int) i);

            } else {
                valor = valor * 1;

                cadena_final = String.format("%s+%s/%s\n", cadena_final, 
                        numerador1, (int) i);

            }

            resultado = resultado + valor;

        }

        System.out.printf("%s\nEl resultado es:%.3f\n", cadena_final, 
                resultado);

    }
}
