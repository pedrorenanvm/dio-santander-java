
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    public void verRendimento(double tempo){
        double rendimento = getSaldo() * (tempo * 0.013);

        System.out.printf("%s com seu saldo atual de %.2f o seu dinheiro vai render %.2f em %.0f meses%n",cliente.getNome(),getSaldo(), rendimento,tempo);
    }
}