/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_pedro_03_7;
import java.util.Scanner;

/**
 *
 * @author p.rosa
 */
public class Lista_revisao_pedro_03_7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int num1;int x;
       
        try{
        System.out.println("Digite a Quantidade do estoque ");
        x=ler.nextInt();
        
        for(int i = 1; i <= x; i++){
        System.out.println("Nome prod " + i);
         }
        
        int inventario[] = new int [10];
         
        for(int i = 0; i <= x; i++){
            System.out.println("Digite o numero relativos ao obj no estoque ");
            inventario[i]= ler.nextInt();
        }
        
        for(int i = 0; i <= x; i++){
        System.out.println("Digite um numero para saber se tem no vetor ");
        num1 = ler.nextInt();
        if(num1 == inventario[i]){
           System.out.println("Numero encontrado no vetor " + i);
        }
        else{
            System.out.println("numero nao encontrado");
        }
       }
        }
        catch(Exception erro){
            System.out.println(erro.getMessage());
        }

    }
}
