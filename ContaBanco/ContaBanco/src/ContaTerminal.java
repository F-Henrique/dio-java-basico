import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da sua Agência:");
        int Agencia = scanner.nextInt();

        System.out.print("Por favor, digite o número da sua conta: ");
        String Numero = scanner.next();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("digite o saldo atual:");
        double Saldo = scanner.nextDouble();

        System.out.print("Olá "+nomeCliente+", obrigado por criar uma conta ");
        System.out.print("em nosso banco, sua agência é "+ Agencia +", conta "+ Numero);
        System.out.print(" e seu saldo "+ Saldo +" já está disponível para saque.");



    }
}
