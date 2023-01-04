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
public class bruno07 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n;
    int a;
    int b;
    int c;
    do{
    n=sc.nextInt();
}
    while(n<0);
        for(int i=1;i<=n;i++){
            a=n-(n-i);
            b=a*a;
            c=a*a*a;
            System.out.println(a+" "+b+" "+c);
        }
}
}