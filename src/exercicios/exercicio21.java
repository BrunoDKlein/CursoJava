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
public class exercicio21 {
    public static void main(String[] args) {
        
        int i=1;
        Scanner sc = new Scanner(System.in);
        int x;
        do{
            x = sc.nextInt();
        } while(x<1||x>1000);
        
        for (i=1;i<=x;i+=2){
            System.out.println(i);
        }
    }
    
}
