/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 7 - Faça um algoritimo que leia dois valores inteiros X e Y, e que calcule e mostre a potência X^Y
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Classe Main
package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        int x;
        int y;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor X: ");
        x = scan.nextInt();
        System.out.println("Digite o valor Y: ");
        y = scan.nextInt();
        
        Potencia p1 = new Potencia(x, y);
        
        p1.calculaPotencia();
        
    }
}
