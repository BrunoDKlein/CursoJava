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
public class exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fat(sc.nextInt()));
    }
    
   private static int fat(int v){
       if(v>1){
           System.out.println(v);
            return fat(v-1)*v;
       }else{
           return 1;
       }
   }
    
}
