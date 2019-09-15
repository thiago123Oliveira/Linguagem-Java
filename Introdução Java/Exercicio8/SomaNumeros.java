/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 8 - Escreva um algoritimo que lê uma valor n inteiro e positivo e que calcula a seguinte soma:
 S:= 1+1/2 +1+1/3 +1+1/4+...+1/n
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Classe SomaNumeros
package exercicio8;

public class SomaNumeros {
    public int indiceNumero;
    public double resutado;
    
    //Método da classe
    public double calcularNumero(int indice){
        int cont;
        this.indiceNumero = indice;
        this.resutado = 1;
        
        for(cont=2; cont<=this.indiceNumero; cont++){
            this.resutado+=(1/cont);
        }
        return this.resutado; 
    }
}
