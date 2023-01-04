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
public class exercicio14 {
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        if(a>0&&a<25){
            System.out.println("o valor está entre 0 e 25");
            
        }
        else{
            if(a>25&&a<50){
                System.out.println("o valor está entre 25 e 50");
                
            }
            else{
                if(a>50&&a<75){
                    System.out.println("o valor está entre 50 e 75");
                }
                else{
                    if(a>75&&a <100){
                        System.out.println("o valor está entre 75 e 100");
                        
                    }
                    else{
                        System.out.println("fora do intrvalo");
                        
                    }
                }
            }
        }
    }
    
}
