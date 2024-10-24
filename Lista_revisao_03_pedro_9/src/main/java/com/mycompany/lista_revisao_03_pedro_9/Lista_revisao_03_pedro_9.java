/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_03_pedro_9;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author p.rosa
 */
public class Lista_revisao_03_pedro_9 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner (System.in);
        String nome;  int quant;  int val2; int x=0;
        
        System.out.println("----------------------|");
        System.out.println("Itens do cardapio:    |");
        System.out.println("1-Coca-Cola =  9,00   |");
        System.out.println("2-Coxinha = 6,00      |");
        System.out.println("3-Pão de queijo = 4,00|");
        System.out.println("4-Fanta = 5,00        |");
        System.out.println("----------------------|");

        
        
        
        System.out.println("Quantos itens deseja(conidere a unidade)");
        quant = ler.nextInt();
        
        System.out.println("Digite o nome do Cliente");
        nome = ler.next();
   
        int produto[] = new int [quant]; int res[] = new int [quant]; int val[] = new int[quant];
        int QTD[] = new int [quant];
        for(int i = 0; i < quant ; ++i){
        System.out.println("Digite o numero do produto");
        produto[i] = ler.nextInt();
        System.out.println("Digite a quantidade do produto");
        QTD[i] = ler.nextInt();
        
        if(produto[i] == 1){
            res[i] = 9*QTD[i];
        }
       else if(produto[i] == 2){
            res[i] = 6*QTD[i];
 
        }
       else if(produto[i] == 3){
            res[i] = 4*QTD[i];

        }
       else if(produto[i] == 4){
            res[i] = 5*QTD[i];
 
        }
        
        System.out.println(res[i]);
        val[i]=x;
        val[i]=res[i];
        val[i]+=val[i];
        }
        for(int i = 0; i < quant ; ++i){ 
        System.out.println(val[i]);
        }
        FileWriter arquivo = new FileWriter("C:\\Atv_DDS\\Cliente" + nome +".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf("--------------------------------------------\n");
            gravar.printf("O cliente "+nome+ " pagara"+val+"\n");
            gravar.printf("--------------------------------------------\n");
            
            gravar.printf("--------------------------------------------\n");
            arquivo.close();

        
        }
}
