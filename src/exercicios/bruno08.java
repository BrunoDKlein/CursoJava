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
public class bruno08 {
      public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double c;
    double f;
    char n;
    do{
          System.out.println("Digite a temperatura em graus celsius:");
          c=sc.nextDouble();
          f=(9*c)/5+32;
          
          System.out.println("Equivalente em fahrenheit: "+f);
          System.out.println("Deseja repetir? (s/n)");
          n=sc.next().charAt(0);
    }
    while(n=='s');
}
}