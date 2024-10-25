/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_03_11;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author farne
 */
public class Lista_revisao_03_11 {

    public static void main(String[] args) {

        Random sorte = new Random();
        int S_num = sorte.nextInt(1-100);
        int num[] = new int [S_num];
        int Num_Maior = 0;int Num_Menor=0;
        
      try{  
        for(int i = 0; i < S_num; i++){
        num[i]=sorte.nextInt(1-100);
    }
        for(int i = 0; i < S_num; i++){
            Num_Maior = num[i];
            Num_Menor = num[i];
            for(int j = 0; j < S_num; j++){
                if(Num_Maior < num[j]){
                    Num_Maior = num[j];
                }
                if(Num_Menor > num[j]){
                    Num_Menor = num[j];
            }
        }
        
    }for(int i = 0; i < S_num; i++){
        System.out.println(num[i]);
    }
    
    JOptionPane.showMessageDialog(null,"O maior número:"+Num_Maior+"\nO menor número:" + Num_Menor);
      }
      catch(Exception erro){
          System.out.println(erro.getMessage());
      }
        
}
}
