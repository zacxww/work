import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Usuario usuario;
    private List<String> produtos;

    public Pedido(Usuario usuario) {
        this.usuario = usuario;
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String produto){
        produtos.add(produto);
    }

    public void mostrarCarrinho(){
        System.out.println("Carrinho de " + usuario.getNome() + ":");
        for (String produto : produtos){
            System.out.println(produto);
        }
    }
}
