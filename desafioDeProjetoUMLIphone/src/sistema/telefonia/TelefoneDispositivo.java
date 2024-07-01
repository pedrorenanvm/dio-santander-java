package sistema.telefonia;

import java.sql.SQLOutput;

public class TelefoneDispositivo implements Telefone {
    private int numero;

    @Override
    public void ligar() {
        System.out.println("LIGANDO");

    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");

    }

    public void bloquearNumero() {
        System.out.println("BLOQUANDO NUMERO");
    }

    public void adicionarNumero() {
        System.out.println("ADICIONANDO NUMERO");
    }

    public void deletarNumero() {
        System.out.println("DELETAR NUMERO");
    }

    public void listarNumerosSalvos() {
        System.out.println("LISTANDO NUMEROS SALVOS");
    }
}
