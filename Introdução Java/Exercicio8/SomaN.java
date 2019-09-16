/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 8 - Esreva uma algoritimo que lê um valor n inteiro e positivo e que calcula a seguinte fama:
 S: 1+ 1/2+ 1/3+ 1/4+...+1/n
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Classe SomaN
package exercicio8;

public class SomaN {
    public int indice;
    public double resultado = 0.0;
    
    
    //Métodos da Classe
    public void calcN(int indice){
        this.indice = indice;
        int cont;
        double soma = 1.0;
        
        for(cont=1; cont<=this.indice; cont++){
            this.resultado+= 1/soma;
            soma++;
        }
        System.out.println("O resultado é: "+this.resultado);
    }
}

