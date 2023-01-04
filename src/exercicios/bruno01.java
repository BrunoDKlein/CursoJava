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
public class bruno01 {
    public static void main(String[] args) {
        int x=1;
        Scanner sc = new Scanner(System.in);
        do{
            x=sc.nextInt();
        }
        while(x<1||x>1000);
        for(int i=1;i<=x;i=i+2){
            System.out.println(i);
        }
        
            
        
    }
}
