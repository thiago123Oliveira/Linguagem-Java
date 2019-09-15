/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 3 - Escreva um programa que imprima todos os números inteiros de 100 a 1.
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/
package exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        int cont;
      
        System.out.println("Números inteiros de 100 à 1");
      
        for(cont=100; cont>=1; cont--){
            if((cont%2) == 0){
              System.out.println("Número: "+cont);
          } 
        } 
    }   
}
