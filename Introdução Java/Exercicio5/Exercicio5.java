/*Programação Orientada a Objetos 1
 *Exercicios Prática Aula 1ºbimestre
 *Exercicio 5 - Identificar em um intervalo definido pelo usuário, todos os números que são divísiveis por 2 e por 7. Exemplo: 10, final do intervalo
 62; saída: 14, 28, 42 e 56.
 *Thiago Oliveira 
 *Engenharia da Computação 7º semestre
*/

//Classe Main
package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        int inIntervalo;
        int fimIntervalo;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o ínicio do intervalo:");
        inIntervalo = scan.nextInt();
        System.out.println("Digite o fim do intervalo:");
        fimIntervalo = scan.nextInt();
        
        System.out.println("Inicio do Intervalo:"+inIntervalo +" Fim do Intervalo:"+fimIntervalo);
        
        //Cria uma instância da classe CalcularDivisiveis
        CalcularDivisiveis c1 = new CalcularDivisiveis();
        
        c1.calculaDivisiveis(inIntervalo, fimIntervalo);
        
    }
    
}
