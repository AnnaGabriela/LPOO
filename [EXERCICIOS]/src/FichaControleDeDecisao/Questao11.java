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
public class Questao11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = scan.nextDouble();
        double taxa;

        if (salario <= 280) {
            taxa = 20;
        } else if (salario > 280 && salario < 700) {
            taxa = 15;
        } else if (salario >= 700 && salario < 1500) {
            taxa = 10;
        } else {
            taxa = 5;
        }

        double aumento = (salario / 100) * taxa;
        double salarioDepois = salario + aumento;
        
        System.out.println("\nSalário Inicial: R$" + salario);
        System.out.println("Percentual de aumento: " + taxa+"%");
        System.out.println("Valor do aumento: R$" + aumento);
        System.out.println("Salário Ajustado: R$" + salarioDepois);
    }
}
