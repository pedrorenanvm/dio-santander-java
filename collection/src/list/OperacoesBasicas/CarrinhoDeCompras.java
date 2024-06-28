package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> listCarrinho;

    public CarrinhoDeCompras() {
        this.listCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listCarrinho.add(new Item(nome, preco, quantidade));
        System.out.println("Item: "+nome+", adicionado");
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        if(!listCarrinho.isEmpty()){
            for (Item item : listCarrinho) {
                if(item.getNome().equalsIgnoreCase(nome)){
                    itemsParaRemover.add(item);
                }
            }
            listCarrinho.removeAll(itemsParaRemover);
            System.out.println("Item: "+nome+", removido");
        }else{
            System.out.println("A lista está vazia");
        }
    }
    public double calcularValorTotal(){
        double total = 0d;
        if(!listCarrinho.isEmpty()){
            for (Item item : listCarrinho) {
                double valorItem = item.getQuantidade() * item.getPreco() ;
                total += valorItem;
            }
            return total;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public void exibirItens(){
        if(!listCarrinho.isEmpty()){
            System.out.println(this.listCarrinho);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listCarrinho=" + listCarrinho +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras1 = new CarrinhoDeCompras();

        carrinhoDeCompras1.adicionarItem("Frango",16.99,2);
        carrinhoDeCompras1.adicionarItem("Leite",4.99,2);
        carrinhoDeCompras1.adicionarItem("Arroz",5.99,2);
        carrinhoDeCompras1.adicionarItem("Pastel",2.99,2);

        carrinhoDeCompras1.removerItem("Pastel");

        carrinhoDeCompras1.exibirItens();

        System.out.println("Total das compras: "+carrinhoDeCompras1.calcularValorTotal());
    }
}
