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
public class Questao3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra (F ou M): ");
        String input = scan.next();

        if ("f".equalsIgnoreCase(input)) {
            System.out.println("F = feminino");
        } else if ("m".equalsIgnoreCase(input)) {
            System.out.println("M = masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
    }
}
