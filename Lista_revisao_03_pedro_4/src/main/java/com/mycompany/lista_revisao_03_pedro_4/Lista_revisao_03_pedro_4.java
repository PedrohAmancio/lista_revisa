/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_03_pedro_4;
import java.util.Scanner;

/**
 *
 * @author p.rosa
 */
public class Lista_revisao_03_pedro_4 {

    public static void main(String[] args) {
            Scanner ler = new Scanner (System.in);
         int num1;   

         System.out.println("Digite o numero para aparecer a tabuada");
         num1 = ler.nextInt();
         
        for(int i = 0; i < 11; ++i){
            System.out.println("Tabuada numero" + num1  + ":" + num1 * i);
        }
    }
}
