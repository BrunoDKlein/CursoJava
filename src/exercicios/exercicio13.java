/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Mauri
 */
public class exercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = 0;
        System.out.println("Informe o código do produto que você quer comprar");
        int codigo;
        codigo = sc.nextInt();
        System.out.println("Informe a quantidade de produtos que você quer comprar");
        int quantidade = sc.nextInt();

        switch (codigo) {
            case 1:
                valor = quantidade * 4.00;
                break;
            case 2:
                valor = quantidade * 4.50;
                break;

            case 3:
                valor = quantidade * 5.00;
                break;

            case 4:
                valor = quantidade * 2.00;
                break;

            case 5:
                valor = quantidade * 1.50;
                break;

            default:
                System.out.println("Código inválido");
                break;
        }
        System.out.println("valor a pagar:" + valor);
    }

}
