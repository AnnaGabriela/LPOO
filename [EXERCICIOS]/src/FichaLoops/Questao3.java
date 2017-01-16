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
public class Questao3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do {
            System.out.println("Entre com o nome (min 3 car): ");
            nome = scan.next();
            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa no mínimo 3 caracteres");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com a idade (0 - 150): ");
            idade = scan.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida!");
            } else {
                infoValida = true;
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o salário: ");
            salario = scan.nextDouble();
            if (salario < 0) {
                System.out.println("Valor inválido!");
            } else {
                infoValida = true;
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o sexo: ");
            sexo = scan.next();
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Sexo inválido!");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Entre com o estado civil (s, c, v ou d): ");
            estadoCivil = scan.next();
            if (estadoCivil.equalsIgnoreCase("s")
                    || estadoCivil.equalsIgnoreCase("c")
                    || estadoCivil.equalsIgnoreCase("v")
                    || estadoCivil.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                System.out.println("Estado civil inválido!");
            }
        } while (!infoValida);
    }
}
