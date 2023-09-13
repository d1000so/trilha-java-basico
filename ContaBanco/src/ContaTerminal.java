import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite seu Nome completo !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, informe seu Saldo !");
        double saldo = scanner.nextDouble();

        String menssagem = "Olá " + nomeCliente + ", obrigado por criar uma";
        menssagem += " conta em nosso banco, sua agência é " + numeroAgencia;
        menssagem += ", conta " + numeroConta + " e seu saldo de R$ "+ saldo;
        menssagem += " já está disponível para saque.";

        System.out.println(menssagem);
        
    }
}