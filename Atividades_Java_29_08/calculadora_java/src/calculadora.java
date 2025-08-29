import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out
                    .println("\nSelecione a Operação:\n1. Adição\n2. Subtração\n3. Multiplicação\n4. Divisão\n5. Sair");
            int operacao = sc.nextInt();

            System.out.println("\nDigite o Número 1:");
            double num1 = sc.nextDouble();

            System.out.println("\nDigite o Número 2:");
            double num2 = sc.nextDouble();

            if (operacao < 1 || operacao > 5) {
                System.out.println("Operação Inválida! Tente novamente.\n");
                continue;
            }

            switch (operacao) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }

        }
    }
}
