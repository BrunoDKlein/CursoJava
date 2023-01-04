/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ ;
 
package exercicios;

import java.util.Scanner;

/**
 *
 * @author
 */


public class exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o codigo da peça1:");
        int codigoPeca1 = sc.nextInt();
        System.out.println("Informe o numero de peças1:");
        int numeroPecas1 = sc.nextInt();
        System.out.println("Informe o valor unitario da peça1:");
        double valorUnitarioPeça1 = sc.nextDouble();
        System.out.println("Informe o codigo da peça2: ");
        int codigoPeca2 = sc.nextInt();
        System.out.println("Informe o numero de peças2:");
        int numeroPecas2 = sc.nextInt();
        System.out.println("Informe o valor unitario da peça2:");
        double valorUnitarioPeça2 = sc.nextDouble();
        double valorPago;
        valorPago = valorUnitarioPeça1 * numeroPecas1 + valorUnitarioPeça2 * numeroPecas2;
        System.out.println("Valor a ser pago peça cod = "+ codigoPeca1+ " quant = " + numeroPecas1 + " valor = " + valorUnitarioPeça1*numeroPecas1);
        System.out.println("Valor a ser pago peça cod = "+ codigoPeca2+ " quant = " + numeroPecas2 + " valor = " + valorUnitarioPeça2*numeroPecas2);
        System.out.println("Total da compra = R$ "+ valorPago);
        
    }

}
