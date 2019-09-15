/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 1 - Escreva um programa que imprima todos os números inteiros de 0 a 50.
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/
package exercicios;

public class Exercicios1 {
    
    public static void main(String[] args) {
      int cont;
      
      System.out.println("Números inteiros de 0 à 50");
      
      for(cont=0; cont<=50; cont++){
          if((cont%2) == 0){
              System.out.println("Número: "+cont);
          } 
      } 
    }
}
