/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_2;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Calculo8_2 {

    Scanner teclado = new Scanner(System.in);
    private float prezo_total;

    public void calcular() {

        System.out.println("Cal é o número de unidades vendidas?");
        int unidades = teclado.nextInt();
        System.out.println("E o prezo do artigo?(unidade)");
        float prezo = teclado.nextFloat();
        if (unidades < 100) {
            prezo_total = unidades * prezo;
        } else if (unidades < 200) {
            if (prezo > 4000) {
                prezo_total = prezo * unidades * 0.95f;
            } else {
                prezo_total = prezo * unidades * 0.98f;
            }
        } else {
            if (prezo > 4000) {
                prezo_total = prezo * unidades * 0.90f;
            } else {
                prezo_total = prezo * unidades * 0.92f;
            }

        }
        System.out.println("Unidades " + unidades + ".");
        System.out.println("Prezo unidad " + prezo + "€.");
        System.out.println("Prezo total " + prezo_total + "€.");
        System.out.println("Desconto " + (prezo * unidades - prezo_total) + "€.");
        
    }
}
