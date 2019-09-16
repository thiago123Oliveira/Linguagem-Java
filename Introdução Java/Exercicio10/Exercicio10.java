/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 10 - Anacleto tem 1,50 e cresce 2 centímetros por ano, enquanto Felisberto tem 1,10 e cresce 3 centímetros por ano.
 Construa um programa que calcule e apresente quantos anos serão necessários para que felisberto seja maior que Anacleto.
  *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Classe Main
package exercicio10;

public class Exercicio10 {

    public static void main(String[] args) {
        double altuaAnacleto = 1.50;
        double alturaFelisberto = 1.10;
        
        CrescimentoAnual ca1 = new CrescimentoAnual();
        
        ca1.taxaCresAnual(altuaAnacleto, alturaFelisberto);
        
    }
    
}
