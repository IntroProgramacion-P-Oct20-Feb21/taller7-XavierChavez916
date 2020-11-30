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
public class Problema02 {

    public static void main(String[] args) {

        int resultado = 2;
        int contador2 = 2;

        do {
            System.out.printf("%s ", resultado);
            contador2 = contador2 + 2;
            resultado = resultado + contador2;

        } while (contador2 <= 20);

        System.out.println("");

    }

}
