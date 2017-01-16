/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FichaControleDeDecisao;

import java.util.Scanner;

/**
 *
 * @author Anna
 */
public class Questao21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Álcool (A) ou Gasolina (G)?");
        String tipoComb = scan.next();
        System.out.println("Quantos litros?");
        double litros = scan.nextDouble();

        double total = 0;
        double totalDesc = 0;
        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percentualDesc = 0;
        double precoAPagar;

        if (tipoComb.equalsIgnoreCase("A")) {
            if (litros <= 20) {
                percentualDesc = 3;
            } else {
                percentualDesc = 5;
            }
            total = litros * precoAlc;
        } else if (tipoComb.equalsIgnoreCase("G")) {
            if (litros <= 20) {
                percentualDesc = 4;
            } else {
                percentualDesc = 6;
            }
            total = litros * precoGas;
        }

        totalDesc = (total / 100) * percentualDesc;
        precoAPagar = total - totalDesc;

        System.out.println("O valor a ser pago será: " + precoAPagar);
    }
}
