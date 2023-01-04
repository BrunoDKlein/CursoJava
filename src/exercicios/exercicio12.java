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
public class exercicio12 {

    public static void main(String[] args) {
        Scanner bruno = new Scanner(System.in);
        int totalhoras;
        System.out.println("Escreva a hora que o jogo começou:");
        int hi = bruno.nextInt();
        System.out.println("Escreva a hora que o jogo terminou:");
        int hf = bruno.nextInt();
        
        if(hi>hf){
            totalhoras=(hf+24)-hi;
        }
        else{
            totalhoras=hf-hi;
        }
        System.out.println("o jogo durou "+totalhoras+" horas");

    }

}
