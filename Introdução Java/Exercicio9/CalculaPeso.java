/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 9 - Construa um programa que apresente o peso total que será carregado por um caminhão. Sabe-se que esse caminhão carrega 25 caixas,
 com pesos diferentes. Será entrada do programa o peso (P) de cada uma das caixas.
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Classe CalculaPeso
package exercicio9;

import java.util.Scanner;

public class CalculaPeso {
    public int numCaixas;
    public double pesoCaixas;
    public int cont;
    
    Scanner scan = new Scanner(System.in);
    
    
    //Método da classe
    public void calcPeso(int num){
        this.numCaixas = num;
        this.pesoCaixas = 0.0;
        for(cont=1; cont<=this.numCaixas; cont++){
            System.out.println("Digite o peso da caixa :"+ cont);
            this.pesoCaixas += scan.nextDouble();
        }
        System.out.println("Peso total da carga: "+this.pesoCaixas);
        
    }
}
