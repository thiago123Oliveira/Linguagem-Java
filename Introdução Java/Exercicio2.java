/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 2 - Faça um programa que apresente a tabuada de um determinado número enviado pelo teclado.
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/
package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        int tabuada;
        int cont;
       
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual tabuada deseja calcular: ");
        tabuada = scan.nextInt();
        
        System.out.println("Tabuada do: "+tabuada);
        
        for(cont=0; cont<=10; cont++){
            System.out.println(""+tabuada +"X"+cont +"= "+(tabuada*cont));
        }
    }
}
