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
public class exercicio5 {
    public static void main(String[] args){ 
            Scanner sc = new Scanner (System.in);
            int numeroFuncionario = sc.nextInt() ;
            int horasTrabalhadas = sc.nextInt();
            double valorHora = sc.nextDouble();
            double salario;
            salario = valorHora * horasTrabalhadas;
            System.out.println("Número de funcionario e seu salário:" + numeroFuncionario +"      "+ salario   );
            
            
            
            
            ;
            
    }
    
}
        
    
    
    

