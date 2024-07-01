
public class Cliente {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public static final class ClienteBuilder {
        private String nome;
        private String cpf;

        private ClienteBuilder() {
        }

        public static ClienteBuilder builder() {
            return new ClienteBuilder();
        }

        public ClienteBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public ClienteBuilder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Cliente build() {
            Cliente cliente = new Cliente();
            cliente.nome = this.nome;
            cliente.cpf = this.cpf;
            return cliente;
        }
    }
}