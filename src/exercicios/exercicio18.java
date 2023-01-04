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
public class exercicio18 {
    public static void main(String[] args) {
        int senha=0;
        Scanner sc = new Scanner(System.in);
        senha=sc.nextInt();
        while(senha!=2002){
            System.out.println("senha incorreta");
            senha=sc.nextInt();
        }
        System.out.println("senha correta");
    }
    
}
