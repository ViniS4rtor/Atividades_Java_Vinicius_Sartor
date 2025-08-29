import java.util.Scanner;

public class verificacao_idade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade <= 0 || String.valueOf(idade).isEmpty()) {
            System.out.println("Idade inválida");
        } else if (idade >= 18) {
            System.out.println("Acesso Liberado");
        } else {
            System.out.println("Acesso Negado");
        }
        sc.close();
    }
}
