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
public class bruno04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a=sc.nextDouble();
            b=sc.nextDouble();
            if(b==0){
                System.out.println("divisão impossível");
            }
            else{
                System.out.println(a/b);
            }
        }
    }
}
