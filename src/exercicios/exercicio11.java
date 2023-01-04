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
public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if (A%B==0||B%A==0){
            System.out.println("são múltiplos");
            
        }
        else{
            System.out.println(" não são múltiplos");
            
        }
    }
    
}
