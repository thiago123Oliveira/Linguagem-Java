/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 6 - Escrever uma algoritimo que gere e escreva os 5 primeiros números perfeitos. Um número perfeito é aquele que é igual
 a soma dos seus divisores exceto o próprio número. (Ex: 6 = 1+2+3; 28 = 1+2+4+7+14 etc.) 
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Classe NumeroPerfeito
package exercicio6;


public class NumeroPerfeito {
    public int nPerfeito;
    public int somaPerfeito;
    
    //Métodos da Classe
    public void numeroPerfeito(){
        int cont;
        int contDecrescente;
        this.nPerfeito = 0;
        
        System.out.println("Calculando os 5 primeiros números perfeitos: ");
        
        for(cont=1; this.nPerfeito<5; cont++){
            this.somaPerfeito = 0;
            for(contDecrescente=(cont-1); contDecrescente>=1; contDecrescente--){
                if(cont%contDecrescente==0){
                    this.somaPerfeito+=contDecrescente;
                }
            }
            if(this.somaPerfeito==cont){
                System.out.println("Número: "+cont);
                nPerfeito++;
            }
        }
    }
    
}
