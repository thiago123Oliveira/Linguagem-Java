/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 8 - Escreva um algoritimo que lê uma valor n inteiro e positivo e que calcula a seguinte soma:
 S:= 1+1/2 +1+1/3 +1+1/4+...+1/n
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Classe Main
package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        int numero;
        double resultado;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite uma valor inteiro positivo: ");
        numero = scan.nextInt();
        
        SomaNumeros s1 = new SomaNumeros();
        resultado = s1.calcularNumero(numero);
        System.out.println("Reultado da soma: "+resultado);
        
    }
}
