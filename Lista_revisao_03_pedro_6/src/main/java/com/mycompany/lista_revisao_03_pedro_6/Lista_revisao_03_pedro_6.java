/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_03_pedro_6;
import java.util.Scanner;

/**
 *
 * @author p.rosa
 */
public class Lista_revisao_03_pedro_6 {

    public static void main(String[] args) {
         Scanner ler = new Scanner (System.in);
         int num1; int num2; int num3; int media;
         
         System.out.println("Digite o primeiro numero");
         num1 = ler.nextInt();
         System.out.println("Digite o segundo numero");
         num2 = ler.nextInt();
         System.out.println("Digite o terceiro numero");
         num3 = ler.nextInt();
         
         media=(num1+num2+num3)/3;
         
         System.out.println("A media dos numeros é: " + media);
    }
}
