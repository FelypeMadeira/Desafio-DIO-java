import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Agência");
        String agencia = sc.nextLine();
        System.out.println("Digite o Número do banco");
        int numero = sc.nextInt();
        System.out.println("Digite o valor do seu primeiro depósito:");
        double saldo = sc.nextDouble();
        System.out.println("Digite o seu nome");
        String nome = sc.nextLine();



        System.out.println("Olá "+ nome+", obrigado por criar uma conta em nosso banco, " +
                "sua Agência é "+agencia+", Conta "+numero+" e seu Saldo "+saldo+" já está disppnível" +
                " para saque");
    }
}
