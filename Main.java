import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, Usuario> usuarios = new HashMap<>();
        Map<String, Pedido> pedidos = new HashMap<>();

        while (true){
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Criar pedido");
            System.out.println("3 - Adicionar produto");
            System.out.println("4 - Mostrar carrinho");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Nome:");
                    String nome = scanner.nextLine();
                    System.out.println("E-mail:");
                    String email = scanner.nextLine();
                    System.out.println("Endereço:");
                    String endereco = scanner.nextLine();

                    Usuario novoUsuario = new Usuario(nome, email, endereco);
                    usuarios.put(email, novoUsuario);
                    System.out.println("Usuário cadastrado com sucesso!!!");
                    break;

                case 2:
                    System.out.println("Email do usuário:");
                    String userEmail = scanner.nextLine();
                    Usuario usuario = usuarios.get(userEmail);
                    if (usuario != null) {
                        Pedido novoPedido = new Pedido(usuario);
                        pedidos.put(userEmail, novoPedido);
                        System.out.println("Pedido criado com sucesso!");
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Email do usuário:");
                    userEmail = scanner.nextLine();
                    Pedido pedido = pedidos.get(userEmail);
                    if (pedido != null) {
                        System.out.println("Nome do produto:");
                        String produto = scanner.nextLine();
                        pedido.adicionarProduto(produto);
                        System.out.println("Produto adicionado ao carrinho.");
                    } else {
                        System.out.println("Usuário não encontrado ou pedido não criado.");
                    }
                    break;

                case 4:
                    System.out.println("Email do usuário:");
                    userEmail = scanner.nextLine();
                    pedido = pedidos.get(userEmail);
                    if (pedido != null) {
                        pedido.mostrarCarrinho();
                    } else {
                        System.out.println("Usuário não encontrado ou pedido não criado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
