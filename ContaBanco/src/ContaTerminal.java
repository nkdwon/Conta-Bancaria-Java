import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, insira o número de sua Agência:");
        int numero = sc.nextInt();
        System.out.println("Por favor, insira qual é sua Agência:");
        String agencia = sc.next();
        System.out.println("Por favor, insira o seu nome:");
        String nomeCliente = sc.next();
        System.out.println("Por favor, insira o seu saldo:");
        double saldo = sc.nextDouble();
                        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero + " e seu saldo de " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
