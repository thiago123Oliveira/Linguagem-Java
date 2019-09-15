/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 4 - Faça um programa que leia um número inteiro n e, n>1 imprima a soma dos múltiplos de 5 no intevalo de 1 a n.
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/
package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        int nInteiro;
        int somaMultiplo;
        int cont;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma valor inteiro para soma: ");
        nInteiro = scan.nextInt();
        
        if(nInteiro>1){
            System.out.println("Soma dos Múltiplos de 5 no intervalo de 1 a "+ nInteiro);
            somaMultiplo = 0;
            for(cont=0; cont<=nInteiro; cont++){
                if(cont%5 == 0){
                    somaMultiplo+=cont;
                }
            }
            System.out.println("A soma dos Múltiplos de 5 = "+somaMultiplo);
        }
        else{
            System.out.println("Para realizar a soma digite um número maior que 1");
        }
    }
    
}
