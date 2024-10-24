/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao_03_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Lista_revisao_03_pedro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1; int num2; int res;
        try{
        System.out.println("Digite um numero");
        num1 = ler.nextInt();
        
        System.out.println("Digite um numero");
        num2 = ler.nextInt();
        
        res =num1 + num2;
        
        
        System.out.println("A soma dos numeros e: " + res);
        }
        catch(Exception erro){
            System.out.println(erro.getMessage());
            System.out.println("Nao era esperado o que foi digitado, tente outra vez");
        }
        finally{
            System.out.println("Operação concluida");
        }
    }
}
