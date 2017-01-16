/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FichaLoops;

import java.util.Scanner;

/**
 *
 * @author Anna
 */
public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double nota;
        boolean notaValida = false;
        
        System.out.println("Informe uma nota entre 0 e 10: ");
        
        do {
            nota = scan.nextDouble();
            if (nota >= 0 && nota<=10) {
                System.out.println("Sua nota é: "+nota);
                notaValida = true;
            } else {
                System.out.println("Digite uma nota válida!");
            }
        } while (!notaValida);
        
    }
}

