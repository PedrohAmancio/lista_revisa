/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_03_10;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author farne
 */
public class Lista_revisao_03_10 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int clientes; int A=0;int D=0; int C=0; int T=0; int F=0;
        
        System.out.println("Quantas pessoas participaram da pesquisa");
        clientes = ler.nextInt();
        
        System.out.println("Esses são os generos");
        System.out.println("1-Açao");
        System.out.println("2-Drama");
        System.out.println("3-Comedia");
        System.out.println("4-Terror");
        System.out.println("5-Familiar");
        
       int resp[] = new int [clientes];
       for(int i = 0; i < clientes; i++){
           System.out.println("Qual seu genero favorito");
           resp[i]=ler.nextInt();
           if(resp[i]==1){
              A=A+1; 
           }
           else if(resp[i]==2){
              D=D+1; 
           }
           else if(resp[i]==3){
               C=C+1;
           }
           else if(resp[i]==4){
               T=T+1;
           }
           else if(resp[i]==5){
               F=F+1;
           }
       }
      JOptionPane.showMessageDialog(null,"O filme de acao tem " + A + " votos");
      JOptionPane.showMessageDialog(null,"O filme de drama tem " + D + " votos");
      JOptionPane.showMessageDialog(null,"O filme de comedia tem " + C + " votos");
      JOptionPane.showMessageDialog(null,"O filme de terror tem " + T + " votos");
      JOptionPane.showMessageDialog(null,"O filme de familia tem " + F + " votos");
       
       
       FileWriter arquivo = new FileWriter("C:\\Atv_DDS\\Cliente\\genero_filme.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf("O filme de drama tem " + A + " votos\");\n" +
"       O filme de drama tem"  + D + " votos\";\n" +
"       O filme de comedia tem " + C + " votos\";\n" +
"       O filme de terror tem " + T + " votos\";\n" +
"       O filme de familia tem " + F + " votos\";\n");
            arquivo.close();



    }
}
