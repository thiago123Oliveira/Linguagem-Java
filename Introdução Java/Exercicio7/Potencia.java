/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 7 - Faça um algoritimo que leia dois valores inteiros X e Y, e que calcule e mostre a potência X^Y
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Potencia
package exercicio7;

public class Potencia {
    public int base;
    public int potencia;
    public double calcPotencia;
    
    //Construtor
    Potencia(int x, int y){
        this.base = x;
        this.potencia = y;
    }
    
    
    //Métodos da classe
    public void calculaPotencia(){
        System.out.println("Calculando a potência de "+this.base +" elevado a "+this.potencia);
        
        this.calcPotencia = Math.pow(this.base, this.potencia);
       
        System.out.println("Resultado: "+this.calcPotencia);
        
    }
}
