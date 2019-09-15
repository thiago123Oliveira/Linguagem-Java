/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 5 - Identificar em um intervalo definido pelo usuário, todos os números que são divísiveis por 2 e por 7. Exemplo: 10, final do intervalo
 62; saída: 14, 28, 42 e 56.
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Classe CalcularDivisiveis
package exercicio5;

public class CalcularDivisiveis {
    public int inicio;
    public int fim;
   
    //Métodos da Classe
    public void calculaDivisiveis(int inicio, int fim){
        int cont;
        this.inicio = inicio;
        this.fim = fim;
        System.out.println("Números divisiveis por 2 e por 7 neste intervalo:");
        
        for(cont=inicio; cont<=fim; cont++){
            if((cont%2==0) && (cont%7==0)){
                System.out.println("Número: "+cont);
            }
        }
    }
}
