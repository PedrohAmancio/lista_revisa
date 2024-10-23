/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_03_pedro_3;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Lista_revisao_03_pedro_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
         int num1; int num2;
         
         System.out.println("Digite um numero");
         num1 = ler.nextInt();
         
          System.out.println("Digite um numero");
         num2 = ler.nextInt();
         
         if( num1 > num2 ){
             System.out.println("O primeiro numero digitado é maior ");
             
         }
         else if( num2 > num1 ){
             System.out.println("O segundo numero digitado é maior ");
         }
         else{
             System.out.print("Os numeros são iguais");
    }
}
}
