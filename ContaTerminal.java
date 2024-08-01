import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = sc.nextInt();
        System.out.println("Digite a agência!");
        String agencia = sc.next();
        System.out.println("Digite o nome do cliente!");
        sc.nextLine();
        String cliente = sc.nextLine();
        System.out.println("Digite o seu saldo!");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
