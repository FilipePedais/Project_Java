import java.util.Scanner;

public class Exercício_06
{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dígite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.println("Dígite os meses: ");
        int meses = scanner.nextInt();

        System.out.println("Dígite os dias: ");
        int dias = scanner.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade em dias é: " + totalDias);

        scanner.close();
    }

}
