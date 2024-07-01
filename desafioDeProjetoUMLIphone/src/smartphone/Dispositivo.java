package smartphone;

import sistema.internet.Browser;
import sistema.iphone.Iphone;
import sistema.multimidia.ReprodutorMultimidia;
import sistema.telefonia.Telefone;

public class Dispositivo {
    public static void main(String[] args) {
        Iphone gadget  = new Iphone();

        gadget.reproduzirMidia();
        gadget.exibirPaginas();
        gadget.ligar();
    }
}
