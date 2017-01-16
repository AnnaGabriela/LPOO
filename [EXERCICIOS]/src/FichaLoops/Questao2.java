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
public class Questao2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username, password;
        boolean infoValida = false;

        do {
            System.out.println("Digite o nome de usuário: ");
            username = scan.next();
            System.out.println("Digite a senha: ");
            password = scan.next();

            if (username.equals(password)) {
                System.out.println("Senha igual a usuário. Digite novamente: ");
            } else {
                System.out.println("Usuário: " + username + "\nSenha: " + password);
                infoValida = true;
            }
        } while (!infoValida);
    }
}
