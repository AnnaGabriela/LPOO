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
public class Questao13 {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor hora: ");
        double valorHora = scan.nextDouble();
        
        System.out.println("Entre com a qtd de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();
        
        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto/100) * 8;
        double sindicato = (salarioBruto/100) * 5;
        double ir = (salarioBruto/100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;
        
        System.out.println("Salário Bruto: "+salarioBruto);
        System.out.println("INSS: "+inss);
        System.out.println("Sindicato: "+sindicato);
        System.out.println("Imposto de Renda: "+ir);
        System.out.println("Total de descontos: "+totalDescontos);
        System.out.println("Salário Líquido: "+salarioLiquido);
        
        
    }
}
