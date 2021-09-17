/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João Vitor
 */
public class TermosX {

    public static void main(String[] args) {
        int termos, counter, valor1, valor2, valor3;
        valor1 = 2;
        valor2 = 7;
        valor3 = 3;
        termos = 0;
        counter = 0;
        termos = Input.readInt("Insira o número de termos: ");
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        while (termos > counter) {
            valor1 = valor1 * 2;
            System.out.println(valor1);
            valor2 = valor2 * 3;
            System.out.println(valor2);
            valor3 = valor3 * 4;
            System.out.println(valor3);
            counter++;

        }

    }
}
