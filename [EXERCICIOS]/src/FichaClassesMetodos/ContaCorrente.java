/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FichaClassesMetodos;

/**
 *
 * @author Anna
 */
public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar) {
        //tem saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } //nao tem saldo na conta
        else if (especial) {
            double limite = limiteEspecial - saldo;
            if (saldo >= quantiaASacar) {
                saldo -= quantiaASacar;
                return true;
            } else {
                return false;
            }
        }
    }
}
