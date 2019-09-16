/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 9 - Construa um programa que apresente o peso total que será carregado por um caminhão. Sabe-se que esse caminhão carrega 25 caixas,
 com pesos diferentes. Será entrada do programa o peso (P) de cada uma das caixas.
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Classe Main
package exercicio9;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        int nCaixas;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Programa para calcular o peso da carga do caminhão");
        nCaixas = scan.nextInt();
        
        CalculaPeso cp1 = new CalculaPeso();
        cp1.calcPeso(nCaixas);
        
    }
    
}
