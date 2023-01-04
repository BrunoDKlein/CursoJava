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
public class exercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        int i = 1;

        int n;
        n = sc.nextInt();
        
        for (i = 1; i <= n; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(x / y);
            }
        };

    }

}
