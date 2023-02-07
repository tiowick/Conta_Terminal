import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Conta_Terminal contTerminal = new Conta_Terminal();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, insira o número da sua conta: ");
        int numero = leitor.nextInt();

        System.out.println("------------------------");

        System.out.println("O numero da sua agência é : " + contTerminal.agencia);
        System.out.println("------------------------");


        System.out.println("Agora digite seu nome: ");
        String nomeCliente = leitor.next();
        System.out.println("------------------------");

        //System.out.println("Usuario " + numero);
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta no nosso banco, sua agência é " + contTerminal.agencia + ", conta " + numero + 
        " e seu saldo de R$ " + contTerminal.saldo + ", já está disponivel para saque!");
    }
}
