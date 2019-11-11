/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_3;

import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Calcular8_3 {

    private int mes;
    Scanner sc = new Scanner(System.in);

    public void diasMeses() {
        System.out.println("De que mes(1-12) quieres saber los días?");
        mes = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Enero: 31 días.");
                break;
            case 2:
                System.out.println("Febrero: 28 días.");
                break;
            case 3:
                System.out.println("Marzo: 31 días.");
                break;
            case 4:
                System.out.println("Abril: 30 días.");
                break;
            case 5:
                System.out.println("Mayo: 31 días.");
                break;
            case 6:
                System.out.println("Junio: 30 días.");
                break;
            case 7:
                System.out.println("Julio: 31 días.");
                break;
            case 8:
                System.out.println("Agosto: 31 días.");
                break;
            case 9:
                System.out.println("Septiembre: 30 días.");
                break;
            case 10:
                System.out.println("Octubre: 31 días.");
                break;
            case 11:
                System.out.println("Noviembre: 30 días.");
                break;
            case 12:
                System.out.println("Diciembre: 31 días.");
                break;
        }
    }
}
