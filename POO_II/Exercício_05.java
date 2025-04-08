import java.util.Scanner;

public class Exercício_01
{
    public static void main (String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Dígite a temperatura: ");
        double celsius = Scanner.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Temperatura em Fahrenheit: "+ fahrenheit+ "ºF");
        System.out.println("Temperatura em Kelvin: "+ kelvin+ "ºK");

        Scanner.close();

    }
}
