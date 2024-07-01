import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;


    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }

    public void listarContas(){
        System.out.println(contas);
        System.out.println();
    }

    public static final class BancoBuilder {
        private String nome;
        private List<Conta> contas;

        private BancoBuilder() {
        }

        public static BancoBuilder builder() {
            return new BancoBuilder();
        }

        public BancoBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public BancoBuilder contas(List<Conta> contas) {
            this.contas = contas;
            return this;
        }

        public Banco build() {
            Banco banco = new Banco();
            banco.contas = this.contas;
            banco.nome = this.nome;
            return banco;
        }
    }
}