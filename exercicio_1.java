import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Acesso negado, digite novamente");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido, seja bem vindo.");
        sc.close();
    }
}