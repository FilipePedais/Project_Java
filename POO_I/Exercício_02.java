public class Exercício_02
{
    public static void main (String [] args){
        int SomaImprares = 0;
        long MultiplicaPares = 1;
        
        for (int i = 1; i <= 20; i++){
            if (i % 2 != 0){
                SomaImprares += i;
            } else {
                MultiplicaPares *= i;
            }
        }
        
        System.out.println("Soma dos números Ímpares de 0 a 20: "+ SomaImprares);
        System.out.println("Multiplicação dos números Pares de 0 a 20: "+ MultiplicaPares);
    }
}
