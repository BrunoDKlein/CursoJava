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
public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Que horas são?");
        int hora = sc.nextInt();
        if (hora < 12 ){
            System.out.println("É de manhã");
        }
        else{
            if(hora>12&&hora<18){
                System.out.println("É de tarde");
            }
            else {
                System.out.println("É de noite");
                
            }
            
        }
        
    }
    
}
