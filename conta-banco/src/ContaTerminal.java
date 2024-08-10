import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o numero da sua conta: ");        
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o valor do seu saldo: ");
        double saldo = scanner.nextDouble();


        
        
        


    }
}
