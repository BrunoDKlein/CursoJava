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
public class bruno05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        if(n==0){
            System.out.println("1");
        }
        else{
        for(int i=1;i<=n;i++){
            a=a*i;
        }
            
                  
    
        System.out.println(a);
    }
}
}
