import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente pedro = Cliente.ClienteBuilder.builder().nome("pedro").cpf("992.222.239.99").build();

        Cliente erika = Cliente.ClienteBuilder.builder().nome("erika").cpf("092.552.449.22").build();

        Conta cc = new ContaCorrente(pedro);
        ContaPoupanca poupanca = new ContaPoupanca(erika);

        cc.depositar(1100);
        cc.transferir(1000, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        poupanca.verRendimento(13);
        List<Conta> listaContas = List.of(cc,poupanca);
        Banco bancoDesenvolvedoresJava = Banco.BancoBuilder.builder().nome("Banco Desenvolvedores Java").contas(listaContas).build();
        bancoDesenvolvedoresJava.listarContas();


    }

}