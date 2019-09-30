package aula7;

import java.util.Scanner;

public class Aula7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int menu = 0;
        
        while(menu!=20){
            System.out.println("1 - Calcular área do quadrado");
            System.out.println("2 - Calcular área do retângulo");
            System.out.println("3 - Calcular área do Losango");
            System.out.println("4 - Calcular área do Trinagulo");
            System.out.println("5 - Calcular área do Pentágono");
            System.out.println("6 - Calcular área do Hexágono");
            System.out.println("7 - Calcular área da Circunferência");
            System.out.println("8 - Calcular área do Tetaedro");
            System.out.println("9 - Calcular área do Octaedro");
            System.out.println("10 - Calcular área do Cubo");
            System.out.println("11 - Calcular área do Docecaedro");
            System.out.println("20 - Sair");
            menu = scan.nextInt();
            
            //Condicional se menu for igual a 1 entra na rotina do calcularAreaQuadrado
            if(menu==1){
                System.out.println("\nFunção para executar o calulo da Área do Quadrado");
                System.out.println("Digite o Lado do Quadrado: ");
                double valorDigitado = scan.nextDouble();
        
                double x = Matematica.calculaAreaQuadrado(valorDigitado);
                System.out.printf("A área do quadrado é: %.2f\n\n", x);
            }
            //Condicional se menu for igual a 2 entra na rotina do calcularAreaRetangulo
            if(menu==2){
                double b, h;
                System.out.println("\nFunção para executar o calulo da Área do Retângulo");
                System.out.println("Digite o valor da base do Retângulo: ");
                b = scan.nextDouble();
                System.out.println("Digite o valor da altura Retângulo: ");
                h = scan.nextDouble();
        
                double r = Matematica.calcularAreaRetangulo(b, h);
                System.out.printf("A área do Retângulo é: %.2f\n\n", r);
            }
            //Condicional se menu for igual a 3 entra na rotina do calcularAreaLosango
            if(menu==3){
                System.out.println("\nFunção para executar o calulo da Área do Losango");
                double b, h;
                System.out.println("Digite o valor da base do Losango: ");
                b = scan.nextDouble();
                System.out.println("Digite o valor da altura Losango: ");
                h = scan.nextDouble();
        
                double r = Matematica.calcularAreaLosango(b, h);
                System.out.printf("A área do Losango é: %.2f\n\n", r);
            }
            //Condicional se menu for igual a 4 entra na rotina do calcularAreaTrinagulo
            if(menu==4){
                System.out.println("\nFunção para executar o calulo da Área do Triângulo");
                double b, h;
                System.out.println("Digite o valor da base do Triângulo: ");
                b = scan.nextDouble();
                System.out.println("Digite o valor da altura Triângulo: ");
                h = scan.nextDouble();
        
                double r = Matematica.calcularAreaTrinagulo(b, h);
                System.out.printf("A área do Triângulo é: %.2f\n\n", r);
            }
            //Condicional se menu for igual a 5 entra na rotina do calcularAreaPentagono
            if(menu==5){
                System.out.println("\nFunção para executar o calulo da Área do Pentágono");
                double b, h;
                System.out.println("Digite o valor da base do Pentáono: ");
                b = scan.nextDouble();
                System.out.println("Digite o valor da altura Pentágono: ");
                h = scan.nextDouble();
        
                double r = Matematica.calcularAreaPentagono(b, h);
                System.out.printf("A área do Pentágono é: %.2f\n\n", r);
            }
            //Condicional se menu for igual a 6 entra na rotina do calcularAreaHexagono
            if(menu==6){
                System.out.println("\nFunção para executar o calulo da Área do Hexágono");
                double b, h;
                System.out.println("Digite o valor da base Hexágono: ");
                b = scan.nextDouble();
                System.out.println("Digite o valor da altura Hexágono: ");
                h = scan.nextDouble();
        
                double r = Matematica.calcularAreaHexagono(b, h);
                System.out.printf("A área do Hexágono é: %.2f\n\n", r);
            }
            //Condicional se menu for igual a 7 entra na rotina do calcularAreaCircunferencia
            if(menu==7){
                System.out.println("\nFunção para executar o calulo da Área da Circunferência");
                double raio;
                System.out.println("Digite o valor do raio da Circunferência: ");
                raio = scan.nextDouble();
               
                double r = Matematica.calcularAreaCircunferencia(raio);
                System.out.printf("A área da Circunferência é: %.2f\n\n", r);
            }
            //Condicional se menu for igual a 8 entra na rotina do calcularAreaTetaedro
            if(menu==8){
                System.out.println("\nFunção para executar o calulo da Área do Tetaedro");
                double aresta;
                System.out.println("Digite o valor do raio da Aresta do Tetaedro: ");
                aresta = scan.nextDouble();
               
                double r = Matematica.calcularAreaTetaedro(aresta);
                System.out.printf("A área do Tetaedro é: %.2f\n\n", r);
            }
            //Condicional se menu for igual a 9 entra na rotina do calcularAreaOctaedro
            if(menu==9){
                System.out.println("\nFunção para executar o calulo da Área do Octaedro");
                double aresta;
                System.out.println("Digite o valor do raio da Aresta do Octaedro: ");
                aresta = scan.nextDouble();
               
                double r = Matematica.calcularAreaOctaedro(aresta);
                System.out.printf("A área do Octaedro é: %.2f\n\n", r);
            }
            //Condicional se menu for igual a 10 entra na rotina do calcularAreaCubo
            if(menu==10){
                System.out.println("\nFunção para executar o calulo da Área do Cubo");
                double aresta;
                System.out.println("Digite o valor do raio da Aresta do Cubo: ");
                aresta = scan.nextDouble();
               
                double r = Matematica.calcularAreaCubo(aresta);
                System.out.printf("A área do Cubo é: %.2f\n\n", r);
            }
            //Condicional se menu for igual a 11 entra na rotina do calcularAreaDocecaedro
            if(menu==11){
                System.out.println("\nFunção para executar o calulo da Área do Docecaedro");
                double b;
                double h;
                double aresta;
                System.out.println("Digite o valor da base do Pentáono do Docecaedro: ");
                b = scan.nextDouble();
                System.out.println("Digite o valor da altura Pentágono do Docecaedro: ");
                h = scan.nextDouble();
                System.out.println("Digite o valor do raio da Aresta do Docecaedro: ");
                aresta = scan.nextDouble();
               
                double r = Matematica.calcularAreaCubo(aresta);
                System.out.printf("A área do Docecaedro é: %.2f\n\n", r);
            }
            //Condicional se menu for igual a 5 fim da execução do programa
            if(menu==20){
                System.out.println("Fim da execução do programa.");
            }
            //Condicional se menu for diferente das opções válidas
            if(menu!=1 && menu!=2 && menu!=3 && menu!=4 && menu!=5 && menu!=6 && menu!=7 && menu!=8 && menu!=9
                    && menu!=10 && menu!=20 && menu!=11){
                System.out.println("Opção Inválida");
            }
        }
        
    }
    
}
