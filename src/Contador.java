import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            // Solicita os parâmetros ao usuário
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();

            try {
                // Chama o método para realizar a contagem com os parâmetros fornecidos
                contar(parametroUm, parametroDois);
            
            } catch (ParametrosInvalidosException e) {
                // Se ocorrer a exceção, imprime a mensagem de erro
                System.out.println(e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            // Lança a exceção personalizada se a condição for atendida
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula o número de interações (quantidade de vezes que o 'for' será executado)
        int contagem = parametroDois - parametroUm;

        // Realiza o 'for' para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

