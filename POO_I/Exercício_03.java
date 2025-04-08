import java.util.Scanner;

public class Exercício_03
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double horastrabalhadas = scanner.nextDouble();

        double valorHora = 30.0;

        double salario = horastrabalhadas * valorHora;

        System.out.println("O salário a receber é: R$"+ salario+" para "+ horastrabalhadas+" horas trabalhadas");

        scanner.close();
    }
}