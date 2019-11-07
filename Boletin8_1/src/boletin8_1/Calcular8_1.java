/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_1;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Calcular8_1 {

    Scanner teclado = new Scanner(System.in);
    private float fin;

    public void calculo() {
        System.out.println("Inserte un valor numérico enteiro.");
        float respuesta = teclado.nextFloat();
        if (respuesta <= 500) {
            fin = respuesta + respuesta * 50 / 100;
        } else if (respuesta <= 1000) {
            fin = respuesta + respuesta * 7 / 100;
        } else if (respuesta <= 5000) {
            fin = respuesta + respuesta * 15 / 100;
        } else {
            fin = respuesta - respuesta * 3 / 100;
        }
        System.out.println("A cantidade é " + respuesta + ".");
        System.out.println("O incremento é " + (fin - respuesta) + ".");
        System.out.println("A cantidade final é " + fin + ".");

    }
}
