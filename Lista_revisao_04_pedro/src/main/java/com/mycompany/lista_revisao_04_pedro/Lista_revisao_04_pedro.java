/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_04_pedro;
import java.util.Scanner;

/**
 *
 * @author p.rosa
 */
public class Lista_revisao_04_pedro {

    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     int num1; 
     
     System.out.println("Digite o numero para saber se é par ou impar");
     num1 = ler.nextInt();
     
     if(num1 % 2 == 0){
         System.out.println("O numero " + num1 + " é par");
     }
     else{
         System.out.println("O numero " + num1 + " é impar");

     }
    }
}
