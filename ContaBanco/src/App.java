import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    
        scanner.close();
    }
}
