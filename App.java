import java.util.Locale;
import java.util.Scanner;

public class App{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US); // faz a classe Scanner aceitar "." ao invés de "," que é o default no Windows Pt-BR
        double receivedNumber;
        double biggerNumber = 0;
        double sumOfNumbers = 0;
        int count = 0;

        do {

            System.out.println("Digite um número qualquer: ");
            receivedNumber = input.nextDouble();
            
            if (receivedNumber > biggerNumber){
                biggerNumber = receivedNumber;
            }

            sumOfNumbers = sumOfNumbers + receivedNumber;

            count ++;

        } while (count < 5);

        System.out.println("O maior número digitado foi: " + biggerNumber);
        System.out.println("A média dos números digitados é: " + (sumOfNumbers / count));
        
        input.close();

    };


}