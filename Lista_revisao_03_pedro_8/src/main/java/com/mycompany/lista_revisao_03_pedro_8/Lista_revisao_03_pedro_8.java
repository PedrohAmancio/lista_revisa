/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_03_pedro_8;
import java.util.Scanner;

/**
 *
 * @author p.rosa
 */
public class Lista_revisao_03_pedro_8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int x; int media = 0 ;
         
         System.out.println("Digite quantas notas serão registradas");
         x=ler.nextInt();
         
         int num2[] = new int [x];
         int num[] = new int [x];
         for(int i = 1; i <=x;++i){
             System.out.println("Digite a nota :");
             num[i]= ler.nextInt();
          num2[i]=num2[i]+num[i];
         }
         for(int i = 0; i <=x;++i){
         media = num[i]/x;
         
         }
         System.out.println(media);
        
         
    }
}
