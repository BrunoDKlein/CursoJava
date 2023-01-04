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
public class exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;

            case 3:
                System.out.println("terça");
                break;

            case 4:
                System.out.println("quarta");
                break;

            case 5:
                System.out.println("quinta");
                break;

            case 6:
                System.out.println("sexta");
                break;

            case 7:
                System.out.println("sábado");
                break;

            default:
                System.out.println("valor inválido");
                break;

        }

    }

}
