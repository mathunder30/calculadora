//projeto de calculadora simples onde as contas são feitas no terminal
package projeto.pessoal.calculadora;

import java.util.Scanner;
//definindo as operações basicas como somar, subtrair, multiplicar e dividir
public class Cal{
    public static double soma(double num1,double num2) {
        return num1 + num2;
    }
    public static double subtracao(double num1, double num2){
        return num1 - num2;
    }
    public static double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    public static double divisao (double num1, double num2){
        return num1/num2;
    }

    public static void main(String[] args) {

    // defirnir a vareavel calculadorNum como verdadeiro (true) serve para usar para funcionar a repetição (while)
        boolean calculadoraNum = true;
        Scanner scan = new Scanner(System.in);

    // while como processo de repetição para sempre voltar as opções.
        while (calculadoraNum) {
    //usei print para imprimir no terminal as opções.
        System.out.println("\n opções: ");
        System.out.println("1. SOMAR ");
        System.out.println("2. SUBTRAIR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SAIR");
        int operacao = scan.nextInt();
    //primeiro if é para usar a opção saida.
        if (operacao == 5) {
            calculadoraNum = false;
            System.out.println("saindo...");
            break;

            
        } 
        
    // usei condição para escolher determinada opção
        if (operacao == 1) {
           System.out.println("digite um numero: ");
           double num1 = scan.nextDouble();
           System.out.println("Digite o segundo numero: ");
           double num2 = scan.nextDouble();
           System.out.println("O resultado de "+num1+" somado por "+ num2 + " é: "+soma(num1, num2));
           
        } else if (operacao == 2) {
            System.out.println("digite um numero: ");
            double num1 = scan.nextDouble();
            System.out.println("digite o segundo numero: ");
            double num2 = scan.nextDouble();
            System.out.println("O resultado de "+num1+" subtraido por "+ num2 + " é: "+subtracao(num1, num2));

            
        } else if (operacao == 3) {
            System.out.println("Digite o primeiro numero: ");
            double num1 = scan.nextDouble();
            System.out.println("Digite o segundo numero: ");
            double num2 = scan.nextDouble();
            System.out.println("O resultado de "+num1+" multiplicado por "+ num2 + " é: "+multiplicacao(num1, num2));
            
        } else if (operacao == 4) {
            System.out.println("digite o primerio numero: ");
            double num1 = scan.nextDouble();
            System.out.println("digite o segundo numero: ");
            double num2 = scan.nextDouble();
            System.out.println("O resultado de "+num1+" dividido por "+ num2 + " é: "+ divisao(num1, num2));
            
        } else if (operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4 && operacao != 5){
            System.out.println("DADOS NÃO ENCONTRADOS, TENTE NOVAMENTE!!");
            }

       
    }
        



        scan.close();
    }

}
