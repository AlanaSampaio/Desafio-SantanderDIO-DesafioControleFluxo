import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
        } finally {
            terminal.close();
        }
    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        if(numeroUm < numeroDois) {
            int contador = numeroDois-numeroUm;
            for(int i = 0; i <=contador; i++) {
                System.out.println("Imprimindo o número: "+ i);
            }
        } else {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }
}
