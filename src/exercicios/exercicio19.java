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
public class exercicio19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        x = sc.nextDouble();
        y = sc.nextDouble();
        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("o ponto está no 1º Q");
            } else if (y > 0 && x < 0) {
                System.out.println("o ponto está no 2º Q");
            } else if (x < 0 && y < 0) {
                System.out.println("o ponto está no 3º Q");
            } else if (y < 0 && x > 0) {
                System.out.println("o ponto está no 4º Q");
                
            }
            x = sc.nextDouble();
                y = sc.nextDouble();
        }
    }

}


    

