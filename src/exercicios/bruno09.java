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
public class bruno09 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a;
    double b;
    double c;
         System.out.println("Insira as medidas dos lados do triângulo X:");
         a=sc.nextDouble();
         b=sc.nextDouble();
         c=sc.nextDouble();
         
         double p=(a+b+c)/2;
         double areaX=Math.sqrt(p*(p-a)*(p-b)*(p-c));
         
         System.out.println("Insira as medidas dos lados do triângulo Y:");
         a=sc.nextDouble();
         b=sc.nextDouble();
         c=sc.nextDouble();
         
         p=(a+b+c)/2;
         double areaY=Math.sqrt(p*(p-a)*(p-b)*(p-c));
         
         System.out.println("Area do triângulo X: "+ areaX);
         System.out.println("Area do triângulo Y: "+ areaY);
         if(areaX>areaY){
             System.out.println("O triângulo X é maior");
         }
         else{
             if(areaX<areaY){
                 System.out.println("O triângulo Y é maior");
             }
             else{
                 System.out.println("Os dois triângulos tem a mesma área");
             }
         }

}
}