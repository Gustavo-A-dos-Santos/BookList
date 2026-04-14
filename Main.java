import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    CatalogoLivros catalogo = new CatalogoLivros(5);

    int opcao;

    do {
      System.out.println("\n=== MENU CATÁLOGO DE LIVROS ===");
      System.out.println("1 - Adicionar livro");
      System.out.println("2 - Adicionar livro no início");
      System.out.println("3 - Inserir livro em posição");
      System.out.println("4 - Remover livro por ID");
      System.out.println("5 - Remover primeiro livro");
      System.out.println("6 - Remover último livro");
      System.out.println("7 - Buscar livro");
      System.out.println("8 - Exibir catálogo");
      System.out.println("9 - Total de livros");
      System.out.println("0 - Sair");
      System.out.print("Escolha: ");

      opcao = sc.nextInt();
      sc.nextLine(); // limpa buffer

      switch (opcao) {

        case 1:
          System.out.print("ID do livro: ");
          int id = sc.nextInt();
          sc.nextLine();
          catalogo.adicionarLivro(id);
          break;

        case 2:
          System.out.print("ID do livro: ");
          id = sc.nextInt();
          sc.nextLine();
          catalogo.adicionarLivroNoInicio(id);
          break;

        case 3:
          System.out.print("ID do livro: ");
          id = sc.nextInt();
          System.out.print("Posição: ");
          int pos = sc.nextInt();
          sc.nextLine();
          catalogo.inserirLivroNaPosicao(id, pos);
          break;

        case 4:
          System.out.print("ID do livro: ");
          id = sc.nextInt();
          sc.nextLine();
          catalogo.removerLivroPorId(id);
          break;

        case 5:
          catalogo.removerPrimeiroLivro();
          break;

        case 6:
          catalogo.removerUltimoLivro();
          break;

        case 7:
          System.out.print("ID do livro: ");
          id = sc.nextInt();
          sc.nextLine();
          int posicao = catalogo.buscarLivro(id);

          if (posicao != -1) {
            System.out.println("Livro encontrado na posição: " + posicao);
          } else {
            System.out.println("Livro não encontrado.");
          }
          break;

        case 8:
          catalogo.exibirCatalogo();
          break;

        case 9:
          System.out.println("Total de livros: " + catalogo.totalLivros());
          break;

        case 0:
          System.out.println("Encerrando sistema...");
          break;

        default:
          System.out.println("Opção inválida.");
      }

    } while (opcao != 0);

    sc.close();
  }
}