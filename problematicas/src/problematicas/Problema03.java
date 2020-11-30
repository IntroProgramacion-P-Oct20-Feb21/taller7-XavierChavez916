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
public class Problema03 {

    public static void main(String[] args) {

        int secuencia1 = 2;
        int secuencia2 = 3;

        do {
            System.out.printf("%s ", secuencia1);
            secuencia1 = secuencia1 + secuencia2;
            secuencia2 = secuencia2 + 2;

        } while (secuencia2 <= 13);

        System.out.println("");
    }

}
