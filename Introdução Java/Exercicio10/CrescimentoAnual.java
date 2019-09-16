/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 10 - Anacleto tem 1,50 e cresce 2 centímetros por ano, enquanto Felisberto tem 1,10 e cresce 3 centímetros por ano.
 Construa um programa que calcule e apresente quantos anos serão necessários para que felisberto seja maior que Anacleto.
  *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Classe CrescimentoAnual
package exercicio10;

public class CrescimentoAnual {
    public double altAnacleto;
    public double altFelisberto;
    public double taxaAnacleto = 0.02;
    public double taxaFelisberto = 0.03;
   
    
    //Métodos da Classe
    public void taxaCresAnual(double altAnacleto, double altFelisberto){
        this.altAnacleto = altAnacleto;
        this.altFelisberto = altFelisberto;
        int cont;
        
        for(cont=0; this.altFelisberto<this.altAnacleto; cont++){
            calcCresAnacleto();
            calcCresFelisberto();
        }
        
        System.out.println("São necessários "+cont +" anos para Felisberto ser maior que Anacleto");
    }
    
    public void calcCresAnacleto(){
        this.altAnacleto+= this.taxaAnacleto;
    }
    
    public void calcCresFelisberto(){
        this.altFelisberto+= this.taxaFelisberto;
    }
    
}
