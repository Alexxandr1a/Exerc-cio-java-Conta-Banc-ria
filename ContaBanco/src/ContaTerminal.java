import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Numero;
        String Agencia;
        String NomeCliete;
        double Saldo = 237.48;

        System.out.print("Por favor digite o número da conta: ");
         Numero = scan.nextInt();

        System.out.print("Digite o número da agência: ");
        Agencia = scan.next();

        System.out.print("Digite seu nome: ");
        NomeCliete = scan.next();

        System.out.println("Olá " + NomeCliete + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia
        + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }

}
