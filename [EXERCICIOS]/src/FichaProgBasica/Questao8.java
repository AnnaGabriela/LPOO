/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FichaProgBasica;

import java.util.Scanner;

/**
 *
 * @author Anna
 */
public class Questao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor hora: ");
        double valorHora = scan.nextDouble();
        System.out.println("Entre com a qtd de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();
        double salario = valorHora * horas;
        System.out.println("O salário foi de "+salario);
    }
}
