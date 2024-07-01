package sistema.internet;

public class Safari implements Browser {
    private String versao;

    @Override
    public void exibirPaginas() {
        System.out.println("EXIBINDO PÁGINA");
    }

    @Override
    public void novaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    public void novoGuiaAnonimo() {
        System.out.println("ADICIONANDO GUIA ANONIMO");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    public void listarPaginas() {
        System.out.println("LISTANDO PÁGINA");
    }
}
