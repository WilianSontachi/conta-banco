import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        double saldo;
        String agencia, nomeCliente;

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência com hífen: ");
        agencia = scanner.nextLine();

        String[] partesAgencia = agencia.split("-");
        
        String numeroAgencia = partesAgencia[0].trim();
        
        String digitoAgencia = partesAgencia[1].trim();

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + "-" + digitoAgencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
