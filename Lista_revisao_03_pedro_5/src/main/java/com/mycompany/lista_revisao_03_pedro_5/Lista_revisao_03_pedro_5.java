/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_03_pedro_5;
import java.util.Scanner;

/**
 *
 * @author p.rosa
 */
public class Lista_revisao_03_pedro_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
         int num1;
         
         System.out.println("A contagem começara em qual numero");
         num1 = ler.nextInt();
         
        for(int i = 0; i < num1; ++i){
            System.out.println(num1-i);
        }
        System.out.println("Fim processo");
    }
}
