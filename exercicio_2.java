import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu voto: \n1 - Álcool\n2 - Gasolina\n3 - Diesel\n4 - FIM");
        int voto = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (voto != 4) {
            switch (voto) {
                case 1:
                    alcool += 1;
                    voto = sc.nextInt();
                    break;
                case 2:
                    gasolina += 1;
                    voto = sc.nextInt();
                    break;
                case 3:
                    diesel += 1;
                    voto = sc.nextInt();
                    break;
                default:
                    System.out.println("Voto invalido, digite novamente");
                    voto = sc.nextInt();
                    break;
            }

        }
        System.out.println("Muito obrigado!");
        System.out.printf("Numero de votos:\nÁlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
        sc.close();
    }
}