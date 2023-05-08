
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia!");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o numero da Conta!");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite seu nome!");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o valor do primeiro deposito!");
        saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência e " + agencia + ", conta " + numero + " e seu saldo " + saldo
                + " ja esta disponivel para saque.");
    }
}
