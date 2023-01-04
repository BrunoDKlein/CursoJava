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
public class bruno02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int out=0;
        int in=0;
        int x=0;
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            
            x=sc.nextInt();
            
            if (x>=10 && x<=20) {
            in=in+1;
        }
            else{
            out=out+1;
                    }
        }
        System.out.println("in: "+in);
        System.out.println("out: "+out);
    }
}
