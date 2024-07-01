package sistema.multimidia;

public class Ipod implements ReprodutorMultimidia{
    private String versao;

    @Override
    public void reproduzirMidia() {
        System.out.println("REPRODUZIR MIDIA");
    }

    @Override
    public void pausarMidia() {
        System.out.println("PAUSAR MIDIA");
    }

    @Override
    public void selecionarMidia() {
        System.out.println("SELECIONANDO MIDIA");
    }

    @Override
    public void deletarMidia() {
        System.out.println("DELETAR MIDIA");
    }
}
