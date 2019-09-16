/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 8 - Esreva uma algoritimo que lê um valor n inteiro e positivo e que calcula a seguinte fama:
 S: 1+ 1/2+ 1/3+ 1/4+...+1/n
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Classe Main
package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        int nIndice;
        
        Scanner scan = new Scanner(System.in);
        SomaN sn1 = new SomaN();
        
        System.out.println("Digite um núemro inteiro e Positivo");
        nIndice = scan.nextInt();
        
        sn1.calcN(nIndice);
        
    }
    
}
