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
public class exercício16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s;
        double imposto;
        s = sc.nextDouble();
        if (s <= 2000) {
            System.out.println("isento");
        } else if (s > 2000 && s <= 3000) {
            imposto = (s / 100) * 8;
            System.out.println(imposto);
        } else if (s > 3000 && s <= 4500) {
            imposto = (s / 100) * 18;
            System.out.println(imposto);
        } else if (s > 4500) {
            imposto = (s / 100) * 28;
            System.out.println(imposto);
        }
    }

}
