package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); // permite adicionar qualquer tipo de objeto

        // permite que seja adicionado so elementos do tipo string
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemente 1");
        listaGenerics.add("Elemente 2");

        // Iterando sobre a lista com Generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        // Iterando sobre a lista sem Generics (necessário fazer cast)
        for (Object elmento : listaSemGenerics) {
            String str = (String) elmento;
            System.out.println(str);
        }

    }
}
