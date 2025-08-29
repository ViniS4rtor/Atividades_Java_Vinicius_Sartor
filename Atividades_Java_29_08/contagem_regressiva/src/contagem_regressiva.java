import java.util.Scanner;

public class contagem_regressiva {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        sc.close();
    }
}
