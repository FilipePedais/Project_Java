import java.util.Scanner;

public class Exercício_04
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dígite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Dígite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Dígite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Dígite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Aluno: %s%n", nome);
        System.out.printf("Média: %.2f%n", media);

        if (media >= 7.0){
            System.out.println("Aprovado");
        } else if (media >= 5.0){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}
    