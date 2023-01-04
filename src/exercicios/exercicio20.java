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
public class exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int alcool=0;
        int gasolina=0;
        int diesel=0;
        int comb=0;
        while(comb!=4){
            if(comb==1){
                alcool=alcool+1;
            }
            else{
                if(comb==2){
                    gasolina=gasolina+1;
                }
                else{
                    if(comb==3){
                        diesel=diesel+1;
                    }
                }
            }
            comb=sc.nextInt();
        }
        System.out.println("Muito Obrigado");
        System.out.println("alcool= "+alcool);
        System.out.println("gasolina= "+gasolina);
        System.out.println("diesel= "+diesel);
    }
}
