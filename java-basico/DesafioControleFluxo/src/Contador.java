import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("###############################");
        System.out.println("  Desafio Controle de Fluxo");
        System.out.println("###############################");
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = input.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = input.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException error) {
            System.out.println(error.getMessage());
        }finally {
            input.close();
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++ ){
            System.out.println("Imprimindo o número "+i);
        }
    }
}